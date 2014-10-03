/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author TheGreenBox
 */
public class Auto {
    //objects used by autonomous
    Throweraterenator thrower;
    DriveTrain dt;
    DriverStation ds;
    Solenoid light;
    Vision vision;
    
    private int hotCounter = 0;
    double startTime;
    int status = Constants.AUTO_STATUS_INIT;
    int statusCount = 0;
    double driveSpeed = 0;
    private boolean pic = false;
    
    public Auto(Throweraterenator thrower, DriveTrain dt, DriverStation ds,
                Solenoid light, Vision vision) {
        this.thrower = thrower;
        this.dt = dt;
        this.ds = ds;
        this.light = light;
        this.vision = vision;
    }
        
    public void updateAuto() {
        /*if (status == Constants.AUTO_STATUS_INIT) {
            System.out.println("INIT Autonomous");
            dt.setSafetyEnabled(false);
            startTime = Timer.getFPGATimestamp();
            thrower.initThrower();
            thrower.setThrowSpeed(1.0);
            thrower.setThrowArc(Constants.THROWER_NOMINAL_ARC);
            vision.init();
            status = Constants.AUTO_STATUS_MOVING;
        // Moving
        } else if (status == Constants.AUTO_STATUS_MOVING) {
            System.out.println("Moving");
            if (Timer.getFPGATimestamp() < startTime + 2.9) {
               driveSpeed = -0.7;
            } else {
               driveSpeed = 0.0;
                status = Constants.AUTO_STATUS_LOOKING;
            }
        // Looking for Hot or Cold
        } else if (status == Constants.AUTO_STATUS_LOOKING) {
            System.out.println("Looking");
            light.set(true);
            if (Timer.getFPGATimestamp() < startTime + 4) {
                if (vision.hot()) {
                    hotCounter ++;
                } else {
                    hotCounter --;
                }
            } else {
                light.set(false);
                vision.close();
                status = Constants.AUTO_STATUS_THROWCHECK;
            }
        // Test to see if it is time to throw or wait
        } else if (status == Constants.AUTO_STATUS_THROWCHECK) {
            if (hotCounter > 0) {
                System.out.println("Shooting");
                status = Constants.AUTO_STATUS_THROW;
            } else if (Timer.getFPGATimestamp() < startTime + 6) {
                System.out.println("Shooting");
                status = Constants.AUTO_STATUS_THROW;
            }
        // Initiate throw
        } else if (status == Constants.AUTO_STATUS_THROW) {
            thrower.startThrow();
            status = Constants.AUTO_STATUS_THROWING;
        // Allow throw to complete
        } else if (status == Constants.AUTO_STATUS_THROWING) {
            if (thrower.getStatus() == Constants.THROWER_STATUS_HOME) {
                status = Constants.AUTO_STATUS_DONE;
            }
        }*/
        System.out.print("Time: " + Timer.getFPGATimestamp() + " ");

        switch (statusCount) {
            case 0 :  // Initialize
                System.out.println("INIT Autonomous");
                dt.setSafetyEnabled(true);
                startTime = Timer.getFPGATimestamp();
                //thrower.initThrower();
                thrower.setThrowSpeed(1.00);
                thrower.setThrowArc(120);
                hotCounter = 0;
                statusCount += 2;  //skip case 1 (vision done later)
                break;
            case 1 :  // Watch for Hot
                System.out.println("Looking");
                light.set(true);
                if (Timer.getFPGATimestamp() < startTime + 0.9) {
                    if (vision.hot()) {
                        System.out.println("Hot");
                        hotCounter ++;
                    } else {
                        System.out.println("Cold");
                        hotCounter --;
                    }
                } else {
                    light.set(false);
                    vision.close();
                    System.out.println("Hot Counter: " + hotCounter);
                    statusCount++;
                }
                break;
            case 2 :  //Approach goal 
                if (Timer.getFPGATimestamp() < startTime + 2.6) {
                   driveSpeed = -0.72;
                   light.set(true);
                   // Time to take a picture?
                   if (Timer.getFPGATimestamp() > startTime + 1.83
                       && !pic) {
                        if (vision.hot()) {
                            System.out.println("Hot");
                            hotCounter ++;
                        } else {
                            System.out.println("Cold");
                            hotCounter --;
                        }
                        //vision.writeImage();
                        light.set(false);
                        pic = true;
                   }
                } else {
                   System.out.println("Stopped Moving");
                   driveSpeed = 0.0;
                   vision.close();
                   statusCount++;
                }
                break;
            case 3 :  // Hot or Cold decision
                if (hotCounter > 0 && Timer.getFPGATimestamp() > startTime + 4.0) {
                    System.out.println("Hot...shooting now");
                    statusCount++;
                } else if (Timer.getFPGATimestamp() > startTime + 7) {
                    System.out.println("Cold...waited for shot");
                    statusCount++;
                }
                break;
            case 4 :  // Start throw
                thrower.startThrow();
                statusCount++;
                break;
            case 5 :  // Wait for thrower arm to home
                if (thrower.getStatus() == Constants.THROWER_STATUS_HOME) {
                    statusCount = 99;
                }
                break;
        }
        // Thrower must be updated every loop
        thrower.update();
        dt.arcadeDrive(driveSpeed, .19);  //need just a bit of right to go straight
        
    }
    
}


