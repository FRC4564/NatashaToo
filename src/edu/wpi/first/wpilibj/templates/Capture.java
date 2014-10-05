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
    
    private final static int MAX_COUNT = 500;
    double[] captureX = new double[MAX_COUNT];
    double[] captureY = new double[MAX_COUNT];
    boolean[] captureTrigger = new boolean[MAX_COUNT];
    private int captureCount = 0;
    private double captureStartTime;

    
    public void start() {
        captureStartTime = Timer.getFPGATimestamp();
        captureCount = 0;
    }
    
    public void add(double x, double y, boolean trigger) {
        if (captureCount <= MAX_COUNT) {
            captureX[captureCount] = x;
            captureY[captureCount] = y;
            captureTrigger[captureCount] = trigger;
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
            System.out.println(captureTrigger[i]);
        }
    }
    
    public double x(int i) {
        return captureX[i];
        
    }
    
    public double y(int i){
        return captureY[i];
    }
    
    public boolean trigger(int i) {
        return captureTrigger[i];
    }
}
