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

    /** 
     * Robot Initialization upon boot
     */
    protected void robotInit() {
        System.out.println("RobotInit...");
        ds = DriverStation.getInstance();
        dt.setMotorsInverted();

        thrower.setStowSpeed(-0.35);
        thrower.initThrower();

//***********************THIS NEEDS TO BE REENABLED        vision.init();
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
            
            // DRIVETRAIN
            if (tail.getStatus() == Constants.TAIL_STATUS_EXTENDED) {
                turnPercent = .9 * .75;
            } else {
                turnPercent = .9;
            }
            
            if (Math.abs(rightstick.getX()) < .1 &&
                Math.abs(rightstick.getY()) < .1) {
                dt.arcadeDrive(dt.accelCurve(leftstick) * -1, leftstick.getX() * turnPercent);
            } else {
                dt.arcadeDrive(dt.accelCurve(rightstick) * 1, rightstick.getX() * turnPercent);            }
            
            
            // THROWER
            // A throw tail be home and Throw Safety button be pressed.
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
                    thrower.setThrowArc(110);
                    thrower.startThrow();
                // Robot pass
                } else if (rightstick.getRawButton(Constants.JB_THROW_ROBOT_PASS) ) {
                    thrower.setThrowSpeed(0.6);
                    thrower.setThrowArc(90);
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
            //System.out.print("pot: " + tail.getTheta());
            //System.out.print(Timer.getFPGATimestamp() );
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
            
            //System.out.println(", arc: " + thrower.getThrowArc() );
            /*System.out.print(" sonar: " + sonar.getDistance() );
            System.out.println(" status: " + thrower.getStatus() );
            
            System.out.print("L: " + sonar.getLeftDistance());
            System.out.print(", R: " + sonar.getRightDistance());
            System.out.print(", Dist: " + sonar.getDistance());
            System.out.println(", Bal: " + sonar.getBalance());*/
            System.out.println("DT speed" + dt.speed);
 
            Timer.delay(Constants.TELEOP_LOOP_DELAY_SECS);
        }        
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
        //vision.init();
        //centerLight.set(true);
        //Timer.delay(1.5);
        while (!leftstick.getRawButton(6)) {
            if (leftstick.getRawButton(1)) {
                tail.setBaseSpeed(.05);
            } else {
                tail.setBaseSpeed(0);
            }
            System.out.println(tail.getTheta());
            Timer.delay(Constants.TELEOP_LOOP_DELAY_SECS);
        }
        
        /*Solenoid left = new Solenoid(1);
        Solenoid right = new Solenoid(2);
        Solenoid comm = new Solenoid(3);
        while (isEnabled()) {
            sonar.sonarLeftEnable.set(true);
            sonar.sonarRightEnable.set(true);
            System.out.print("L: " + sonar.getLeftDistance());
            System.out.print(", R: " + sonar.getRightDistance());
            System.out.print(", Dist: " + sonar.getDistance());
            System.out.println(", Bal: " + sonar.getBalance());
            
            if (sonar.getBalance() == Constants.SONIC_BALANCE_LEFT
                || sonar.getBalance() == Constants.SONIC_BALANCE_EQUAL) {
                left.set(true);
            } else { 
                left.set(false);
            }
            if (sonar.getBalance() == Constants.SONIC_BALANCE_RIGHT
                || sonar.getBalance() == Constants.SONIC_BALANCE_EQUAL) {
                right.set(true);
            } else { 
                right.set(false);
            }
            
            Timer.delay(.1);
        }
        
        Vision vision = new Vision();
        double startTime = Timer.getFPGATimestamp();
        thrower.initThrower();
        // drive forward
        dt.setSafetyEnabled(true);
        dt.arcadeDrive(-0.7,0);
        while (Timer.getFPGATimestamp() < startTime + 2.9) {  //2.9 secs run time
            thrower.update();
        }
        dt.arcadeDrive(0,0);
        // Hot test
        int hotCounter = 0;
        while (Timer.getFPGATimestamp()< startTime + 4) {
            if (vision.hot()) {
                hotCounter ++;
            }
            else {
                hotCounter --;
            }
            thrower.update();
            Timer.delay(0.1);
        }
        //Throw test
        thrower.setThrowSpeed(1.0);
        thrower.setThrowArc((int)(ds.getAnalogIn(2)/5 * 130));
        if (hotCounter > 0) {
            System.out.println("Shooting");
          } else {
            System.out.println("Not hot, waiting");
            Timer.delay(2);
            System.out.println("Shooting");
        }
        thrower.startThrow();
        while (thrower.getStatus() != Constants.THROWER_STATUS_HOME) {
            thrower.update();
            //System.out.println(thrower.getStatus());
            Timer.delay(Constants.TELEOP_LOOP_DELAY_SECS);
        }
        //Turn around*/
        
    }
}
