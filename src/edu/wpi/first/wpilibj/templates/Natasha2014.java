/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DigitalInput;

public class Natasha2014 extends SimpleRobot {
    
    Joystick leftstick = new Joystick(1);
    Joystick rightstick = new Joystick(2);
    double turnPercent = .9;
    DriveTrain dt = new DriveTrain(Constants.frontLeft, Constants.rearLeft,
                                   Constants.frontRight, Constants.rearRight);
    double driveX = 0.0;   
    double driveY = 0.0;
    double loopDelay = 0.0;  //Timer value to control loop rate
    Throweraterenator thrower = new Throweraterenator();
    Tail tail = new Tail();
    SinisterSonar sonar = new SinisterSonar();
    DriverStation ds;
    SmartDashboard DashData = new SmartDashboard();
    Solenoid leftLight = new Solenoid(1);
    Solenoid rightLight = new Solenoid(2);
    Solenoid centerLight = new Solenoid(3);
    DigitalInput ballDetect = new DigitalInput(Constants.DIO_TAIL_BALL_DETECT);
    AxisCamera camera;
    Vision vision = new Vision(camera);
    Auto auto = new Auto(thrower, dt, ds, centerLight, vision);
    Capture capture = new Capture();
    boolean recording = false;  //Capturing joystick movements?

    
    /** 
     * Robot Initialization upon boot
     */
    protected void robotInit() {
        System.out.println("RobotInit...");
        ds = DriverStation.getInstance();
        dt.setMotorsInverted();

        thrower.setStowSpeed(-0.35);
        thrower.initThrower();
        
        capture.load();

        vision.init();
    }

    /**
     * This function is called once, when Autonomous mode is enabled.
     */
    public void autonomous() {
        dt.setSafetyEnabled(false);
        auto.statusCount = 0;
        while (auto.statusCount != 99) {
            auto.updateAuto();
            Timer.delay(Constants.TELEOP_LOOP_DELAY_SECS);
        }
        System.out.println("DONE!");
    }


    /**
     * This function is called while Teleop mode is enabled.
     */
    public void operatorControl() {
        System.out.println("Teleop...");
        dt.setSafetyEnabled(true);
        while (isOperatorControl() && isEnabled()) {
             loopDelay = Timer.getFPGATimestamp() + Constants.TELEOP_LOOP_DELAY_SECS;           
            // DRIVETRAIN
            if (tail.getStatus() == Constants.TAIL_STATUS_EXTENDED) {
                turnPercent = .9 * .75;
            } else {
                turnPercent = .9;
            }
            
            if (Math.abs(rightstick.getX()) < .1 &&
                Math.abs(rightstick.getY()) < .1) {
                driveX = leftstick.getX() * turnPercent;
                driveY = leftstick.getY() * -1;
            } else {
                driveX = rightstick.getX() * turnPercent;
                driveY = rightstick.getY();
            }
            dt.arcadeDrive(dt.accelCurve(driveY), driveX);
            dt.arcadeDrive(dt.accelCurve(driveY), driveX);

            // THROWER
            // To throw, tail must be home and Throw Safety button be pressed.
            if (tail.getStatus() == Constants.TAIL_STATUS_RETRACTED &&
                rightstick.getRawButton(Constants.JB_THROW_SAFETY) ) {
                // Auto ranged throw
                if (rightstick.getRawButton(Constants.JB_THROW_AUTO_DIST) ) {
                    // Set thrower range based on current sonar reading
                    thrower.setTargetDistance(sonar.getDistance());
                    thrower.startThrow();
                // Truss toss
                } else if (rightstick.getRawButton(Constants.JB_THROW_TRUSS_TOSS) ){
                    thrower.setThrowSpeed(1.0);
                    thrower.setThrowArc(125);
                    thrower.startThrow();
                // Robot pass
                } else if (rightstick.getRawButton(Constants.JB_THROW_ROBOT_PASS) ) {
                    thrower.setThrowSpeed(0.8);
                    thrower.setThrowArc(103);
                    thrower.startThrow();
                // Manual throw - no sonar
                } else if (rightstick.getRawButton(Constants.JB_THROW_MANUAL) ){
                    thrower.setThrowSpeed(1.0);
                    thrower.setThrowArc(Constants.THROWER_NOMINAL_ARC);
                    thrower.startThrow();
                // Use Analog parameters
                } else if (rightstick.getRawButton(Constants.JB_THROW_ANALOG) ){
                   thrower.setThrowSpeed(ds.getAnalogIn(1)/5);
                   thrower.setThrowArc((int)(ds.getAnalogIn(2)/5 * 200));
                   thrower.startThrow();
                } else if (rightstick.getRawButton(Constants.JB_THROW_AUTO)) {
                    thrower.setThrowSpeed(1.0);
                    thrower.setThrowArc(Constants.THROWER_NOMINAL_ARC);
                    if (sonar.getDistance() <= 12.0) {
                        thrower.startThrow();
                    }
                }

                  //THIS BLOCK WAS ADDED FOR TEMPORARY NERFING
                  if (rightstick.getRawButton(Constants.JB_THROW_ROBOT_PASS) ) {
                    thrower.setThrowSpeed(0.5);
                    thrower.setThrowArc(108);
                    thrower.startThrow();
                    }
                  }
               // Catch ball by braking at 110 arc while button is held
            if (leftstick.getRawButton(Constants.JB_THROW_CATCH)) {
                thrower.setThrowSpeed(0.3);
                thrower.setThrowArc(110);
                thrower.setBrake();
                thrower.startThrow();
            } else {
                thrower.releaseBrake();
            }
      
            thrower.update();
                      
            // SCORPION TAIL
            if (thrower.getStatus() == Constants.THROWER_STATUS_HOME) {
                if (leftstick.getRawButton(Constants.JB_TAIL_EXTEND) ) {
                    tail.startExtend();
                }
                if (leftstick.getRawButton(Constants.JB_TAIL_RETRACT)) {
                    tail.startRetract();
                }
                if (!ballDetect.get()
                    && tail.getStatus() == Constants.TAIL_STATUS_EXTENDED) {
                    tail.startRetract();
                }
            }
            tail.update();

            // SONAR
             sonar.update();
             
            // LIGHTS
            if (thrower.inRange(sonar.getDistance()) ) {
                if (sonar.getBalance() == Constants.SONIC_BALANCE_LEFT
                    || sonar.getBalance() == Constants.SONIC_BALANCE_EQUAL) {
                    leftLight.set(true);
                } else { 
                    leftLight.set(false);
                }
                if (sonar.getBalance() == Constants.SONIC_BALANCE_RIGHT
                    || sonar.getBalance() == Constants.SONIC_BALANCE_EQUAL) {
                    rightLight.set(true);
                } else { 
                    rightLight.set(false);
                }
            } else {
                rightLight.set(false);
                leftLight.set(false);
            }
            if (rightstick.getRawButton(Constants.JB_LIGHT_CENTER_1)
                || rightstick.getRawButton(Constants.JB_LIGHT_CENTER_2)
                || leftstick.getRawButton(Constants.JB_LIGHT_CENTER_1)
                || leftstick.getRawButton(Constants.JB_LIGHT_CENTER_2)) {
                centerLight.set(true);
            } else {
                centerLight.set(false);
            }
                
            // DEBUG
            SmartDashboard.putNumber("Left dist",sonar.getLeftDistance());
            SmartDashboard.putNumber("Right dist",sonar.getRightDistance());
            SmartDashboard.putNumber("Thrower Status (0=home 1=throw 2=stow 3=init 4=brake)",thrower.getStatus());
            SmartDashboard.putNumber("Encoder",thrower.position() );
            SmartDashboard.putNumber("Tail Status (1=extened 2=retracted)", tail.getStatus());
            SmartDashboard.putNumber("Tail Position", tail.getTheta());            
            SmartDashboard.putNumber("Slider Arc", ds.getAnalogIn(2)/5 * 200);
            SmartDashboard.putNumber("Slider Speed", ds.getAnalogIn(1)/5);
            SmartDashboard.putNumber("Target Arc", thrower.getThrowArc());
            SmartDashboard.putBoolean("In Range",thrower.inRange(sonar.getDistance()));
            SmartDashboard.putNumber("Distance" , sonar.getDistance());
            SmartDashboard.putNumber("Turn Offset", (ds.getAnalogIn(3) / 5 * 0.2));

            // RECORD
            
            //Record while Record button is held
            if (leftstick.getRawButton(Constants.JB_RECORD) ||
                rightstick.getRawButton(Constants.JB_RECORD)) {
                if (recording == false) {
                    capture.start();
                    recording = true; 
                }
                capture.add(driveX, driveY, 
                    leftstick.getRawButton(Constants.JB_TAIL_EXTEND),
                    leftstick.getRawButton(Constants.JB_TAIL_RETRACT),
                    rightstick.getRawButton(Constants.JB_THROW_SAFETY)
                        && rightstick.getRawButton(Constants.JB_THROW_ROBOT_PASS),
                    rightstick.getRawButton(Constants.JB_LIGHT_CENTER_1)
                        || rightstick.getRawButton(Constants.JB_LIGHT_CENTER_2)
                        || leftstick.getRawButton(Constants.JB_LIGHT_CENTER_1)
                        || leftstick.getRawButton(Constants.JB_LIGHT_CENTER_2));
            } else {  // turn off recording
                if (recording) {
                    capture.print();
                    recording = false;
                }
            }            
            
//          LOOP DELAY
            while (Timer.getFPGATimestamp() < loopDelay) {
                Timer.delay(.005);
            }
          
        }        
    }  //end operatorControl
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
        //Play back recorded movements
        int i = 0;  //playback index
        
        System.out.println("Capture playback..."+capture.count()+" steps.");
        if (capture.count()>0) {
            leftLight.set(true);
            rightLight.set(true);

            dt.setSafetyEnabled(true);
            while (i <= capture.count() && isEnabled()) {
                loopDelay = Timer.getFPGATimestamp() + Constants.TELEOP_LOOP_DELAY_SECS;
                
                //DRIVETRAIN
                dt.arcadeDrive(dt.accelCurve(capture.y(i)), capture.x(i));
 
                //THROWER
                if (tail.getStatus() == Constants.TAIL_STATUS_RETRACTED &&
                        capture.thrower(i)) {
                    thrower.setThrowSpeed(0.4);
                    thrower.setThrowArc(90);
                    thrower.startThrow();
                }
                thrower.update();   
                
                //TAIL
                if (thrower.getStatus() == Constants.THROWER_STATUS_HOME) {
                    if (capture.extend(i)) {
                        tail.startExtend(); }

                    if (capture.retract(i)) {
                        tail.startRetract(); }
                    
                    if (!ballDetect.get()
                        && tail.getStatus() == Constants.TAIL_STATUS_EXTENDED) {
                        tail.startRetract(); }
                }
                tail.update();
                
                //LIGHT
                centerLight.set(capture.light(i));
                leftLight.set(!capture.light(i));
                rightLight.set(!capture.light(i));
                
                //WAIT BEFORE LOOPING
                while (Timer.getFPGATimestamp() < loopDelay) {
                    Timer.delay(.005);
                }
                
                //NEXT FRAME
                i ++;
            }
            
            dt.arcadeDrive(0.0,0.0);
            centerLight.set(false);
            leftLight.set(false);
            rightLight.set(false);
        }
    } // test
    
} //End SimpleRobot
