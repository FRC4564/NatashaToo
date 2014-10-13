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
    boolean[] captureLight = new boolean[MAX_COUNT];
    private int captureCount = 0;
    private double captureStartTime;


    public void start() {
        captureStartTime = Timer.getFPGATimestamp();
        captureCount = 0; 
    }
    
    public void add(double x, double y, boolean extend, boolean retract,
                    boolean thrower, boolean light) {
        if (captureCount <= MAX_COUNT) {
            captureX[captureCount] = x;
            captureY[captureCount] = y;
            captureExtend[captureCount] = extend;
            captureRetract[captureCount] = retract;
            captureThrower[captureCount] = thrower;
            captureLight[captureCount] = light;
            captureCount++;
        }
    }
    
    public int count() {
        return captureCount + 1;
    }
    
    public void print() {
        System.out.println("captureCount=" + captureCount + ";");
        for (int i = 0; i <= captureCount; i++) {
            System.out.print("captureX["+i+"]="+captureX[i] + "; ");
            System.out.print("captureY["+i+"]="+captureY[i] + "; ");
            System.out.print("captureExtend["+i+"]="+captureExtend[i] + "; ");
            System.out.print("captureRetract["+i+"]="+captureRetract[i] + "; ");
            System.out.print("captureThrower["+i+"]="+captureThrower[i] + "; ");
            System.out.print("captureLight["+i+"]="+captureLight[i] + "; ");
            System.out.println();
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
        return captureRetract[i];
    }

    public boolean thrower(int i) {
        return captureThrower[i];
    }
    
    public boolean light(int i) {
        return captureLight[i];
    }
    public void load() {
        captureCount=0;
    }
}
