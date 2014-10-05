/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;


/**
 *
 * @author Steven
 */
public class DriveTrain extends RobotDrive{
    
    double speed = 0;
    double accel = 0.25;
    
    public DriveTrain(SpeedController frontLeft, SpeedController rearLeft, SpeedController frontRight, SpeedController rearRight) {
        super(frontLeft, rearLeft, frontRight, rearRight);
    }
    
    public void setMotorsInverted() {
       setInvertedMotor(RobotDrive.MotorType.kFrontLeft,true);
       setInvertedMotor(RobotDrive.MotorType.kRearLeft,true);
       setInvertedMotor(RobotDrive.MotorType.kFrontRight,true);
       setInvertedMotor(RobotDrive.MotorType.kRearRight,true);
    }
    
    // Set speed based on Y value from joystick and a straight line acceleration curve
    public double accelCurve(double Y) {
        if (Math.abs(speed - Y) > accel) {
            if (speed > Y) {
                speed = speed - accel;
            } else {
                speed = speed + accel;
            }
        } else {
            speed = Y;
        }
        return speed;
    }
}
