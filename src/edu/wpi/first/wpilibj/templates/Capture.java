/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Team4564
 */
public class Capture {
    
    private final static int MAX_COUNT = 1000;
    double[] captureX = new double[MAX_COUNT];
    double[] captureY = new double[MAX_COUNT];
    boolean[] captureExtend = new boolean[MAX_COUNT];
    boolean[] captureRetract = new boolean[MAX_COUNT];
    boolean[] captureThrower = new boolean[MAX_COUNT];
    private int captureCount = 0;
    private double captureStartTime;


    public void start() {
        captureStartTime = Timer.getFPGATimestamp();
        captureCount = 0;
    }
    
    public void add(double x, double y, boolean extend,boolean retract, boolean thrower) {
        if (captureCount <= MAX_COUNT) {
            captureX[captureCount] = x;
            captureY[captureCount] = y;
            captureExtend[captureCount] = extend;
            captureExtend[captureCount] = retract;
            captureThrower[captureCount] = thrower;
            captureCount++;
        }
    }
    
    public int count() {
        return captureCount + 1;
    }
    
    public void print() {
        System.out.println("There are " + captureCount + " data points:");
        for (int i = 0; i <= captureCount; i++) {
            System.out.print(captureX[i] + ", ");
            System.out.print(captureY[i] + ", ");
            System.out.print(captureExtend[i] + ", ");
            System.out.print(captureRetract[i] + ", ");
            System.out.println(captureThrower[i]);
        }
    }
    
    public double x(int i) {
        return captureX[i];
        
    }
    
    public double y(int i){
        return captureY[i];
    }
    
    public boolean extend(int i) {
        return captureExtend[i];
    }

    public boolean retract(int i) {
        return captureExtend[i];
    }

    public boolean thrower(int i) {
        return captureThrower[i];
    }
}
