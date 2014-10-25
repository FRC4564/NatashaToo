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
captureCount=849;
captureX[0]=0.0; captureY[0]=0.078125; captureExtend[0]=false; captureRetract[0]=false; captureThrower[0]=false; captureLight[0]=false; 
captureX[1]=0.0; captureY[1]=0.09375; captureExtend[1]=false; captureRetract[1]=false; captureThrower[1]=false; captureLight[1]=false; 
captureX[2]=0.0; captureY[2]=0.125; captureExtend[2]=false; captureRetract[2]=false; captureThrower[2]=false; captureLight[2]=false; 
captureX[3]=0.0; captureY[3]=0.234375; captureExtend[3]=false; captureRetract[3]=false; captureThrower[3]=false; captureLight[3]=false; 
captureX[4]=0.0; captureY[4]=0.3046875; captureExtend[4]=false; captureRetract[4]=false; captureThrower[4]=false; captureLight[4]=false; 
captureX[5]=0.0; captureY[5]=0.453125; captureExtend[5]=false; captureRetract[5]=false; captureThrower[5]=false; captureLight[5]=false; 
captureX[6]=0.0; captureY[6]=0.6484375; captureExtend[6]=false; captureRetract[6]=false; captureThrower[6]=false; captureLight[6]=false; 
captureX[7]=0.0; captureY[7]=0.6640625; captureExtend[7]=false; captureRetract[7]=false; captureThrower[7]=false; captureLight[7]=false; 
captureX[8]=0.0; captureY[8]=0.6640625; captureExtend[8]=false; captureRetract[8]=false; captureThrower[8]=false; captureLight[8]=false; 
captureX[9]=0.0; captureY[9]=0.6640625; captureExtend[9]=false; captureRetract[9]=false; captureThrower[9]=false; captureLight[9]=false; 
captureX[10]=0.0; captureY[10]=0.6640625; captureExtend[10]=false; captureRetract[10]=false; captureThrower[10]=false; captureLight[10]=false; 
captureX[11]=0.0; captureY[11]=0.6640625; captureExtend[11]=false; captureRetract[11]=false; captureThrower[11]=false; captureLight[11]=false; 
captureX[12]=0.0; captureY[12]=0.6640625; captureExtend[12]=false; captureRetract[12]=false; captureThrower[12]=false; captureLight[12]=false; 
captureX[13]=0.0; captureY[13]=0.6640625; captureExtend[13]=false; captureRetract[13]=false; captureThrower[13]=false; captureLight[13]=false; 

captureX[14]=0.0; captureY[14]=0.6640625; captureExtend[14]=false; captureRetract[14]=false; captureThrower[14]=false; captureLight[14]=false; 
captureX[15]=0.0; captureY[15]=0.6640625; captureExtend[15]=false; captureRetract[15]=false; captureThrower[15]=false; captureLight[15]=false; 
captureX[16]=0.0; captureY[16]=0.609375; captureExtend[16]=false; captureRetract[16]=false; captureThrower[16]=false; captureLight[16]=false; 
captureX[17]=0.0; captureY[17]=0.59375; captureExtend[17]=false; captureRetract[17]=false; captureThrower[17]=false; captureLight[17]=false; 
captureX[18]=0.0; captureY[18]=0.59375; captureExtend[18]=false; captureRetract[18]=false; captureThrower[18]=false; captureLight[18]=false; 
captureX[19]=0.0; captureY[19]=0.59375; captureExtend[19]=false; captureRetract[19]=false; captureThrower[19]=false; captureLight[19]=false; 
captureX[20]=0.0; captureY[20]=0.59375; captureExtend[20]=false; captureRetract[20]=false; captureThrower[20]=false; captureLight[20]=false; 
captureX[21]=0.0; captureY[21]=0.59375; captureExtend[21]=false; captureRetract[21]=false; captureThrower[21]=false; captureLight[21]=false; 
captureX[22]=0.0; captureY[22]=0.59375; captureExtend[22]=false; captureRetract[22]=false; captureThrower[22]=false; captureLight[22]=false; 
captureX[23]=0.0; captureY[23]=0.59375; captureExtend[23]=false; captureRetract[23]=false; captureThrower[23]=false; captureLight[23]=false; 
captureX[24]=0.0; captureY[24]=0.59375; captureExtend[24]=false; captureRetract[24]=false; captureThrower[24]=false; captureLight[24]=false; 

captureX[25]=0.0; captureY[25]=0.59375; captureExtend[25]=false; captureRetract[25]=false; captureThrower[25]=false; captureLight[25]=false; 
captureX[26]=0.0; captureY[26]=0.59375; captureExtend[26]=false; captureRetract[26]=false; captureThrower[26]=false; captureLight[26]=false; 
captureX[27]=0.0; captureY[27]=0.59375; captureExtend[27]=false; captureRetract[27]=false; captureThrower[27]=false; captureLight[27]=false; 
captureX[28]=0.0; captureY[28]=0.59375; captureExtend[28]=false; captureRetract[28]=false; captureThrower[28]=false; captureLight[28]=false; 
captureX[29]=0.0; captureY[29]=0.59375; captureExtend[29]=false; captureRetract[29]=false; captureThrower[29]=false; captureLight[29]=false; 
captureX[30]=0.0; captureY[30]=0.59375; captureExtend[30]=false; captureRetract[30]=false; captureThrower[30]=false; captureLight[30]=false; 
captureX[31]=0.0; captureY[31]=0.59375; captureExtend[31]=false; captureRetract[31]=false; captureThrower[31]=false; captureLight[31]=false; 
captureX[32]=0.0; captureY[32]=0.59375; captureExtend[32]=false; captureRetract[32]=false; captureThrower[32]=false; captureLight[32]=false; 
captureX[33]=0.0; captureY[33]=0.59375; captureExtend[33]=false; captureRetract[33]=false; captureThrower[33]=false; captureLight[33]=false; 
captureX[34]=0.0; captureY[34]=0.59375; captureExtend[34]=false; captureRetract[34]=false; captureThrower[34]=false; captureLight[34]=false; 
captureX[35]=0.0; captureY[35]=0.59375; captureExtend[35]=false; captureRetract[35]=false; captureThrower[35]=false; captureLight[35]=false; 
captureX[36]=0.0; captureY[36]=0.5390625; captureExtend[36]=false; captureRetract[36]=false; captureThrower[36]=false; captureLight[36]=false; 

captureX[37]=-0.084375; captureY[37]=0.359375; captureExtend[37]=false; captureRetract[37]=false; captureThrower[37]=false; captureLight[37]=false; 
captureX[38]=-0.11953125; captureY[38]=0.21875; captureExtend[38]=false; captureRetract[38]=false; captureThrower[38]=false; captureLight[38]=false; 
captureX[39]=-0.0703125; captureY[39]=-0.11023622047244094; captureExtend[39]=false; captureRetract[39]=false; captureThrower[39]=false; captureLight[39]=false; 
captureX[40]=0.007086614173228346; captureY[40]=-0.5039370078740157; captureExtend[40]=false; captureRetract[40]=false; captureThrower[40]=false; captureLight[40]=false; 
captureX[41]=0.007086614173228346; captureY[41]=-0.7007874015748031; captureExtend[41]=false; captureRetract[41]=false; captureThrower[41]=false; captureLight[41]=false; 
captureX[42]=-0.13359375; captureY[42]=-1.0; captureExtend[42]=false; captureRetract[42]=false; captureThrower[42]=false; captureLight[42]=false; 
captureX[43]=-0.13359375; captureY[43]=-1.0; captureExtend[43]=false; captureRetract[43]=false; captureThrower[43]=false; captureLight[43]=false; 
captureX[44]=-0.13359375; captureY[44]=-1.0; captureExtend[44]=false; captureRetract[44]=false; captureThrower[44]=false; captureLight[44]=false; 
captureX[45]=-0.1546875; captureY[45]=-1.0; captureExtend[45]=false; captureRetract[45]=false; captureThrower[45]=false; captureLight[45]=false; 
captureX[46]=-0.1546875; captureY[46]=-1.0; captureExtend[46]=false; captureRetract[46]=false; captureThrower[46]=false; captureLight[46]=false; 
captureX[47]=-0.16875; captureY[47]=-1.0; captureExtend[47]=false; captureRetract[47]=false; captureThrower[47]=false; captureLight[47]=false; 

captureX[48]=-0.18281250000000002; captureY[48]=-1.0; captureExtend[48]=false; captureRetract[48]=false; captureThrower[48]=false; captureLight[48]=false; 
captureX[49]=-0.253125; captureY[49]=-1.0; captureExtend[49]=false; captureRetract[49]=false; captureThrower[49]=false; captureLight[49]=false; 
captureX[50]=-0.31640625; captureY[50]=-0.7244094488188977; captureExtend[50]=false; captureRetract[50]=false; captureThrower[50]=false; captureLight[50]=false;
captureX[51]=-0.31640625; captureY[51]=-0.7244094488188977; captureExtend[51]=false; captureRetract[51]=false; captureThrower[51]=false; captureLight[51]=false;
captureX[52]=-0.31640625; captureY[52]=-0.3937007874015748; captureExtend[52]=false; captureRetract[52]=false; captureThrower[52]=false; captureLight[52]=false; 
captureX[53]=-0.8296875; captureY[53]=-0.3937007874015748; captureExtend[53]=false; captureRetract[53]=false; captureThrower[53]=false; captureLight[53]=false; 
captureX[54]=-0.8296875; captureY[54]=-0.4566929133858268; captureExtend[54]=false; captureRetract[54]=false; captureThrower[54]=false; captureLight[54]=false; 
captureX[55]=-0.8296875; captureY[55]=-0.4566929133858268; captureExtend[55]=false; captureRetract[55]=false; captureThrower[55]=false; captureLight[55]=false; 
captureX[56]=-0.8296875; captureY[56]=-0.4566929133858268; captureExtend[56]=false; captureRetract[56]=false; captureThrower[56]=false; captureLight[56]=false; 
captureX[57]=-0.8296875; captureY[57]=-0.4566929133858268; captureExtend[57]=false; captureRetract[57]=false; captureThrower[57]=false; captureLight[57]=true; 

captureX[58]=-0.75234375; captureY[58]=-0.5039370078740157; captureExtend[58]=false; captureRetract[58]=false; captureThrower[58]=false; captureLight[58]=true; 
captureX[59]=-0.75234375; captureY[59]=-0.5196850393700787; captureExtend[59]=false; captureRetract[59]=false; captureThrower[59]=false; captureLight[59]=true; 
captureX[60]=-0.61875; captureY[60]=-0.5196850393700787; captureExtend[60]=false; captureRetract[60]=false; captureThrower[60]=false; captureLight[60]=true; 
captureX[61]=-0.36562500000000003; captureY[61]=-0.5433070866141733; captureExtend[61]=false; captureRetract[61]=false; captureThrower[61]=false; captureLight[61]=true; 
captureX[62]=-0.3515625; captureY[62]=-0.5826771653543307; captureExtend[62]=false; captureRetract[62]=false; captureThrower[62]=false; captureLight[62]=true; 
captureX[63]=-0.31640625; captureY[63]=-0.6062992125984252; captureExtend[63]=false; captureRetract[63]=false; captureThrower[63]=false; captureLight[63]=false; 
captureX[64]=-0.31640625; captureY[64]=-0.6220472440944882; captureExtend[64]=false; captureRetract[64]=false; captureThrower[64]=false; captureLight[64]=false; 
captureX[65]=-0.38671875; captureY[65]=-0.6456692913385826; captureExtend[65]=false; captureRetract[65]=false; captureThrower[65]=false; captureLight[65]=false; 
captureX[66]=-0.38671875; captureY[66]=-0.6456692913385826; captureExtend[66]=false; captureRetract[66]=false; captureThrower[66]=false; captureLight[66]=false; 
captureX[67]=-0.41484375; captureY[67]=-0.6456692913385826; captureExtend[67]=false; captureRetract[67]=false; captureThrower[67]=false; captureLight[67]=true; 

captureX[68]=-0.56953125; captureY[68]=-0.6456692913385826; captureExtend[68]=false; captureRetract[68]=false; captureThrower[68]=false; captureLight[68]=true; 
captureX[69]=-0.78046875; captureY[69]=-0.5826771653543307; captureExtend[69]=false; captureRetract[69]=false; captureThrower[69]=false; captureLight[69]=true; 
captureX[70]=-0.86484375; captureY[70]=-0.5196850393700787; captureExtend[70]=false; captureRetract[70]=false; captureThrower[70]=false; captureLight[70]=true; 
captureX[71]=-0.86484375; captureY[71]=-0.5196850393700787; captureExtend[71]=false; captureRetract[71]=false; captureThrower[71]=false; captureLight[71]=true; 
captureX[72]=-0.86484375; captureY[72]=-0.5826771653543307; captureExtend[72]=false; captureRetract[72]=false; captureThrower[72]=false; captureLight[72]=true; 
captureX[73]=-0.86484375; captureY[73]=-0.6062992125984252; captureExtend[73]=false; captureRetract[73]=false; captureThrower[73]=false; captureLight[73]=false; 
captureX[74]=-0.86484375; captureY[74]=-0.6220472440944882; captureExtend[74]=false; captureRetract[74]=false; captureThrower[74]=false; captureLight[74]=false; 
captureX[75]=-0.8859375; captureY[75]=-0.6220472440944882; captureExtend[75]=false; captureRetract[75]=false; captureThrower[75]=false; captureLight[75]=false; 
captureX[76]=-0.8859375; captureY[76]=-0.6220472440944882; captureExtend[76]=false; captureRetract[76]=false; captureThrower[76]=false; captureLight[76]=false; 
captureX[77]=-0.8859375; captureY[77]=-0.6220472440944882; captureExtend[77]=false; captureRetract[77]=false; captureThrower[77]=false; captureLight[77]=true; 

captureX[78]=-0.8859375; captureY[78]=-0.6220472440944882; captureExtend[78]=false; captureRetract[78]=false; captureThrower[78]=false; captureLight[78]=true; 
captureX[79]=-0.8859375; captureY[79]=-0.6220472440944882; captureExtend[79]=false; captureRetract[79]=false; captureThrower[79]=false; captureLight[79]=true; 
captureX[80]=-0.8859375; captureY[80]=-0.6220472440944882; captureExtend[80]=false; captureRetract[80]=false; captureThrower[80]=false; captureLight[80]=true; 
captureX[81]=-0.9; captureY[81]=-0.6614173228346457; captureExtend[81]=false; captureRetract[81]=false; captureThrower[81]=false; captureLight[81]=true; 
captureX[82]=-0.9; captureY[82]=-0.7244094488188977; captureExtend[82]=false; captureX[84]=-0.9; captureY[84]=-0.7401574803149606; captureExtend[84]=false; captureRetract[84]=false; captureThrower[84]=false; captureLight[84]=false; 
captureX[85]=-0.9; captureY[85]=-0.7401574803149606; captureExtend[85]=false; captureRetract[85]=false; captureThrower[85]=false; captureLight[85]=false; 
captureX[86]=-0.9; captureY[86]=-0.7401574803149606; captureExtend[86]=false; captureRetract[86]=false; captureThrower[86]=false; captureLight[86]=false; 
captureX[87]=-0.9; captureY[87]=-0.7401574803149606; captureExtend[87]=false; captureRetract[87]=false; captureThrower[87]=false; captureLight[87]=true; 
captureX[88]=-0.9; captureY[88]=-0.6850393700787402; captureExtend[88]=false; captureRetract[88]=false; captureThrower[88]=false; captureLight[88]=true; 

captureX[89]=-0.9; captureY[89]=-0.6850393700787402; captureExtend[89]=false; captureRetract[89]=false; captureThrower[89]=false; captureLight[89]=true; 
captureX[90]=-0.9; captureY[90]=-0.6850393700787402; captureExtend[90]=false; captureRetract[90]=false; captureThrower[90]=false; captureLight[90]=true; 
captureX[91]=-0.9; captureY[91]=-0.6850393700787402; captureExtend[91]=false; captureRetract[91]=false; captureThrower[91]=false; captureLight[91]=true; 
captureX[92]=-0.9; captureY[92]=-0.6850393700787402; captureExtend[92]=false; captureRetract[92]=false; captureThrower[92]=false; captureLight[92]=true; 
captureX[93]=-0.9; captureY[93]=-0.6850393700787402; captureExtend[93]=false; captureRetract[93]=false; captureThrower[93]=false; captureLight[93]=true; 
captureX[94]=-0.9; captureY[94]=-0.6614173228346457; captureExtend[94]=false; captureRetract[94]=false; captureThrower[94]=false; captureLight[94]=true; 
captureX[95]=-0.9; captureY[95]=-0.6614173228346457; captureExtend[95]=false; captureRetract[95]=false; captureThrower[95]=false; captureLight[95]=true; 
captureX[96]=-0.9; captureY[96]=-0.6614173228346457; captureExtend[96]=false; captureRetract[96]=false; captureThrower[96]=false; captureLight[96]=true; 
captureX[97]=-0.9; captureY[97]=-0.6456692913385826; captureExtend[97]=false; captureRetract[97]=false; captureThrower[97]=false; captureLight[97]=true; 
captureX[98]=-0.9; captureY[98]=-0.6220472440944882; captureExtend[98]=false; captureRetract[98]=false; captureThrower[98]=false; captureLight[98]=false; 

captureX[99]=-0.9; captureY[99]=-0.6220472440944882; captureExtend[99]=false; captureRetract[99]=false; captureThrower[99]=false; captureLight[99]=false; 
captureX[100]=-0.9; captureY[100]=-0.6220472440944882; captureExtend[100]=false; captureRetract[100]=false; captureThrower[100]=false; captureLight[100]=false; 
captureX[101]=-0.9; captureY[101]=-0.6220472440944882; captureExtend[101]=false; captureRetract[101]=false; captureThrower[101]=false; captureLight[101]=false; 
captureX[102]=-0.9; captureY[102]=-0.6062992125984252; captureExtend[102]=false; captureRetract[102]=false; captureThrower[102]=false; captureLight[102]=false; 
captureX[103]=-0.9; captureY[103]=-0.6062992125984252; captureExtend[103]=false; captureRetract[103]=false; captureThrower[103]=false; captureLight[103]=false; 
captureX[104]=-0.9; captureY[104]=-0.6062992125984252; captureExtend[104]=false; captureRetract[104]=false; captureThrower[104]=false; captureLight[104]=false; 
captureX[105]=-0.9; captureY[105]=-0.5826771653543307; captureExtend[105]=false; captureRetract[105]=false; captureThrower[105]=false; captureLight[105]=false; 
captureX[106]=-0.9; captureY[106]=-0.5826771653543307; captureExtend[106]=false; captureRetract[106]=false; captureThrower[106]=false; captureLight[106]=false; 
captureX[107]=-0.9; captureY[107]=-0.5826771653543307; captureExtend[107]=false; captureRetract[107]=false; captureThrower[107]=false; captureLight[107]=false; 
captureX[108]=-0.9; captureY[108]=-0.5826771653543307; captureExtend[108]=false; captureRetract[108]=false; captureThrower[108]=false; captureLight[108]=false; 
captureX[109]=-0.9; captureY[109]=-0.5826771653543307; captureExtend[109]=false; captureRetract[109]=false; captureThrower[109]=false; captureLight[109]=false; 

captureX[110]=-0.9; captureY[110]=-0.5826771653543307; captureExtend[110]=false; captureRetract[110]=false; captureThrower[110]=false; captureLight[110]=false; 
captureX[111]=-0.9; captureY[111]=-0.5826771653543307; captureExtend[111]=false; captureRetract[111]=false; captureThrower[111]=false; captureLight[111]=false; 
captureX[112]=-0.9; captureY[112]=-0.5826771653543307; captureExtend[112]=false; captureRetract[112]=false; captureThrower[112]=false; captureLight[112]=false; 
captureX[113]=-0.9; captureY[113]=-0.5826771653543307; captureExtend[113]=false; captureRetract[113]=false; captureThrower[113]=false; captureLight[113]=false; 
captureX[114]=-0.9; captureY[114]=-0.5826771653543307; captureExtend[114]=false; captureRetract[114]=false; captureThrower[114]=false; captureLight[114]=false; 
captureX[115]=-0.9; captureY[115]=-0.5826771653543307; captureExtend[115]=false; captureRetract[115]=false; captureThrower[115]=false; captureLight[115]=false; 
captureX[116]=-0.9; captureY[116]=-0.5826771653543307; captureExtend[116]=false; captureRetract[116]=false; captureThrower[116]=false; captureLight[116]=false; 
captureX[117]=-0.9; captureY[117]=-0.5826771653543307; captureExtend[117]=false; captureRetract[117]=false; captureThrower[117]=false; captureLight[117]=false; 
captureX[118]=-0.9; captureY[118]=-0.5826771653543307; captureExtend[118]=false; captureRetract[118]=false; captureThrower[118]=false; captureLight[118]=false; 
captureX[119]=-0.9; captureY[119]=-0.5826771653543307; captureExtend[119]=false; captureRetract[119]=false; captureThrower[119]=false; captureLight[119]=false; 

captureX[120]=-0.9; captureY[120]=-0.5826771653543307; captureExtend[120]=false; captureRetract[120]=false; captureThrower[120]=false; captureLight[120]=false; 
captureX[121]=-0.9; captureY[121]=-0.5826771653543307; captureExtend[121]=false; captureRetract[121]=false; captureThrower[121]=false; captureLight[121]=false; 
captureX[122]=-0.9; captureY[122]=-0.5826771653543307; captureExtend[122]=false; captureRetract[122]=false; captureThrower[122]=false; captureLight[122]=false; 
captureX[123]=-0.9; captureY[123]=-0.5826771653543307; captureExtend[123]=false; captureRetract[123]=false; captureThrower[123]=false; captureLight[123]=true; 
captureX[124]=-0.9; captureY[124]=-0.5826771653543307; captureExtend[124]=false; captureRetract[124]=false; captureThrower[124]=false; captureLight[124]=true; 
captureX[125]=-0.9; captureY[125]=-0.5826771653543307; captureExtend[125]=false; captureRetract[125]=false; captureThrower[125]=false; captureLight[125]=true; 
captureX[126]=-0.9; captureY[126]=-0.5590551181102362; captureExtend[126]=false; captureRetract[126]=false; captureThrower[126]=false; captureLight[126]=false; 
captureX[127]=-0.9; captureY[127]=-0.5590551181102362; captureExtend[127]=false; captureRetract[127]=false; captureThrower[127]=false; captureLight[127]=false; 
captureX[128]=-0.9; captureY[128]=-0.5590551181102362; captureExtend[128]=false; captureRetract[128]=false; captureThrower[128]=false; captureLight[128]=true; 
captureX[129]=-0.9; captureY[129]=-0.5433070866141733; captureExtend[129]=false; captureRetract[129]=false; captureThrower[129]=false; captureLight[129]=true; 

captureX[130]=-0.9; captureY[130]=-0.5433070866141733; captureExtend[130]=false; captureRetract[130]=false; captureThrower[130]=false; captureLight[130]=true; 
captureX[131]=-0.9; captureY[131]=-0.5433070866141733; captureExtend[131]=false; captureRetract[131]=false; captureThrower[131]=false; captureLight[131]=true; 
captureX[132]=-0.9; captureY[132]=-0.5433070866141733; captureExtend[132]=false; captureRetract[132]=false; captureThrower[132]=false; captureLight[132]=true; 
captureX[133]=-0.9; captureY[133]=-0.5196850393700787; captureExtend[133]=false; captureRetract[133]=false; captureThrower[133]=false; captureLight[133]=true; 
captureX[134]=-0.9; captureY[134]=-0.5196850393700787; captureExtend[134]=false; captureRetract[134]=false; captureThrower[134]=false; captureLight[134]=true; 
captureX[135]=-0.9; captureY[135]=-0.5196850393700787; captureExtend[135]=false; captureRetract[135]=false; captureThrower[135]=false; captureLight[135]=false; 
captureX[136]=-0.9; captureY[136]=-0.5196850393700787; captureExtend[136]=false; captureRetract[136]=false; captureThrower[136]=false; captureLight[136]=false; 
captureX[137]=-0.9; captureY[137]=-0.5196850393700787; captureExtend[137]=false; captureRetract[137]=false; captureThrower[137]=false; captureLight[137]=false; 
captureX[138]=-0.9; captureY[138]=-0.5196850393700787; captureExtend[138]=false; captureRetract[138]=false; captureThrower[138]=false; captureLight[138]=true; 
captureX[139]=-0.9; captureY[139]=-0.5196850393700787; captureExtend[139]=false; captureRetract[139]=false; captureThrower[139]=false; captureLight[139]=true; 

captureX[140]=-0.9; captureY[140]=-0.5196850393700787; captureExtend[140]=false; captureRetract[140]=false; captureThrower[140]=false; captureLight[140]=true; 
captureX[141]=-0.9; captureY[141]=-0.5196850393700787; captureExtend[141]=false; captureRetract[141]=false; captureThrower[141]=false; captureLight[141]=true; 
captureX[142]=-0.9; captureY[142]=-0.5196850393700787; captureExtend[142]=false; captureRetract[142]=false; captureThrower[142]=false; captureLight[142]=true; 
captureX[143]=-0.9; captureY[143]=-0.5196850393700787; captureExtend[143]=false; captureRetract[143]=false; captureThrower[143]=false; captureLight[143]=true; 
captureX[144]=-0.9; captureY[144]=-0.5196850393700787; captureExtend[144]=false; captureRetract[144]=false; captureThrower[144]=false; captureLight[144]=true; 
captureX[145]=-0.9; captureY[145]=-0.5196850393700787; captureExtend[145]=false; captureRetract[145]=false; captureThrower[145]=false; captureLight[145]=true; 
captureX[146]=-0.9; captureY[146]=-0.5196850393700787; captureExtend[146]=false; captureRetract[146]=false; captureThrower[146]=false; captureLight[146]=true; 
captureX[147]=-0.9; captureY[147]=-0.5196850393700787; captureExtend[147]=false; captureRetract[147]=false; captureThrower[147]=false; captureLight[147]=true; 
captureX[148]=-0.9; captureY[148]=-0.5196850393700787; captureExtend[148]=false; captureRetract[148]=false; captureThrower[148]=false; captureLight[148]=true; 
captureX[149]=-0.9; captureY[149]=-0.5196850393700787; captureExtend[149]=false; captureRetract[149]=false; captureThrower[149]=false; captureLight[149]=true; 

captureX[150]=-0.9; captureY[150]=-0.5826771653543307; captureExtend[150]=false; captureRetract[150]=false; captureThrower[150]=false; captureLight[150]=true; 
captureX[151]=-0.9; captureY[151]=-0.5826771653543307; captureExtend[151]=false; captureRetract[151]=false; captureThrower[151]=false; captureLight[151]=true; 
captureX[152]=-0.9; captureY[152]=-0.5826771653543307; captureExtend[152]=false; captureRetract[152]=false; captureThrower[152]=false; captureLight[152]=true; 
captureX[153]=-0.9; captureY[153]=-0.5826771653543307; captureExtend[153]=false; captureRetract[153]=false; captureThrower[153]=false; captureLight[153]=true; 
captureX[154]=-0.9; captureY[154]=-0.5826771653543307; captureExtend[154]=false; captureRetract[154]=false; captureThrower[154]=false; captureLight[154]=true; 
captureX[155]=-0.9; captureY[155]=-0.5826771653543307; captureExtend[155]=false; captureRetract[155]=false; captureThrower[155]=false; captureLight[155]=true; 
captureX[156]=-0.9; captureY[156]=-0.5826771653543307; captureExtend[156]=false; captureRetract[156]=false; captureThrower[156]=false; captureLight[156]=true; 
captureX[157]=-0.9; captureY[157]=-0.5826771653543307; captureExtend[157]=false; captureRetract[157]=false; captureThrower[157]=false; captureLight[157]=true; 
captureX[158]=-0.9; captureY[158]=-0.5826771653543307; captureExtend[158]=false; captureRetract[158]=false; captureThrower[158]=false; captureLight[158]=true; 
captureX[159]=-0.9; captureY[159]=-0.5826771653543307; captureExtend[159]=false; captureRetract[159]=false; captureThrower[159]=false; captureLight[159]=true; 

captureX[160]=-0.9; captureY[160]=-0.5826771653543307; captureExtend[160]=false; captureRetract[160]=false; captureThrower[160]=false; captureLight[160]=true; 
captureX[161]=-0.9; captureY[161]=-0.5826771653543307; captureExtend[161]=false; captureRetract[161]=false; captureThrower[161]=false; captureLight[161]=true; 
captureX[162]=-0.9; captureY[162]=-0.5826771653543307; captureExtend[162]=false; captureRetract[162]=false; captureThrower[162]=false; captureLight[162]=false; 
captureX[163]=-0.9; captureY[163]=-0.5826771653543307; captureExtend[163]=false; captureRetract[163]=false; captureThrower[163]=false; captureLight[163]=false; 
captureX[164]=-0.9; captureY[164]=-0.5826771653543307; captureExtend[164]=false; captureRetract[164]=false; captureThrower[164]=false; captureLight[164]=false; 
captureX[165]=-0.9; captureY[165]=-0.5826771653543307; captureExtend[165]=false; captureRetract[165]=false; captureThrower[165]=false; captureLight[165]=false; 
captureX[166]=-0.9; captureY[166]=-0.6062992125984252; captureExtend[166]=false; captureRetract[166]=false; captureThrower[166]=false; captureLight[166]=false; 
captureX[167]=-0.9; captureY[167]=-0.6062992125984252; captureExtend[167]=false; captureRetract[167]=false; captureThrower[167]=false; captureLight[167]=true; 
captureX[168]=-0.9; captureY[168]=-0.6062992125984252; captureExtend[168]=false; captureRetract[168]=false; captureThrower[168]=false; captureLight[168]=true; 
captureX[169]=-0.9; captureY[169]=-0.6062992125984252; captureExtend[169]=false; captureRetract[169]=false; captureThrower[169]=false; captureLight[169]=true; 

captureX[170]=-0.9; captureY[170]=-0.6850393700787402; captureExtend[170]=true; captureRetract[170]=false; captureThrower[170]=false; captureLight[170]=true; 
captureX[171]=-0.9; captureY[171]=-0.7007874015748031; captureExtend[171]=true; captureRetract[171]=false; captureThrower[171]=false; captureLight[171]=true; 
captureX[172]=-0.85078125; captureY[172]=-0.6456692913385826; captureExtend[172]=true; captureRetract[172]=false; captureThrower[172]=false; captureLight[172]=false; 
captureX[173]=-0.75234375; captureY[173]=-0.5433070866141733; captureExtend[173]=true; captureRetract[173]=false; captureThrower[173]=false; captureLight[173]=false; 
captureX[174]=-0.61875; captureY[174]=-0.41732283464566927; captureExtend[174]=false; captureRetract[174]=false; captureThrower[174]=false; captureLight[174]=false; 
captureX[175]=-0.253125; captureY[175]=-0.1732283464566929; captureExtend[175]=false; captureRetract[175]=false; captureThrower[175]=false; captureLight[175]=false; 
captureX[176]=-0.084375; captureY[176]=-0.0; captureExtend[176]=false; captureRetract[176]=false; captureThrower[176]=false; captureLight[176]=false; 
captureX[177]=-0.11953125; captureY[177]=0.0078125; captureExtend[177]=false; captureRetract[177]=false; captureThrower[177]=false; captureLight[177]=true; 
captureX[178]=-0.18281250000000002; captureY[178]=0.0078125; captureExtend[178]=false; captureRetract[178]=false; captureThrower[178]=false; captureLight[178]=true; 
captureX[179]=-0.084375; captureY[179]=0.0078125; captureExtend[179]=false; captureRetract[179]=false; captureThrower[179]=false; captureLight[179]=true; 

captureX[180]=-0.05625; captureY[180]=0.0078125; captureExtend[180]=false; captureRetract[180]=false; captureThrower[180]=false; captureLight[180]=true; 
captureX[181]=-0.05625; captureY[181]=-0.05511811023622047; captureExtend[181]=false; captureRetract[181]=false; captureThrower[181]=false; captureLight[181]=true; 
captureX[182]=-0.03515625; captureY[182]=-0.05511811023622047; captureExtend[182]=false; captureRetract[182]=false; captureThrower[182]=false; captureLight[182]=true; 
captureX[183]=-0.10546875; captureY[183]=-0.0; captureExtend[183]=false; captureRetract[183]=true; captureThrower[183]=false; captureLight[183]=false; 
captureX[184]=-0.10546875; captureY[184]=0.0390625; captureExtend[184]=false; captureRetract[184]=true; captureThrower[184]=false; captureLight[184]=false; 
captureX[185]=-0.05625; captureY[185]=0.0546875; captureExtend[185]=false; captureRetract[185]=true; captureThrower[185]=false; captureLight[185]=false; 
captureX[186]=-0.00703125; captureY[186]=-0.0; captureExtend[186]=false; captureRetract[186]=false; captureThrower[186]=false; captureLight[186]=false; 
captureX[187]=-0.00703125; captureY[187]=-0.0; captureExtend[187]=false; captureRetract[187]=false; captureThrower[187]=false; captureLight[187]=true; 
captureX[188]=-0.00703125; captureY[188]=-0.0; captureExtend[188]=false; captureRetract[188]=false; captureThrower[188]=false; captureLight[188]=true; 
captureX[189]=0.0; captureY[189]=-0.05511811023622047; captureExtend[189]=false; captureRetract[189]=false; captureThrower[189]=false; captureLight[189]=true; 
captureX[190]=0.0; captureY[190]=-0.05511811023622047; captureExtend[190]=false; captureRetract[190]=false; captureThrower[190]=false; captureLight[190]=true; 

captureX[191]=0.0; captureY[191]=-0.05511811023622047; captureExtend[191]=false; captureRetract[191]=false; captureThrower[191]=false; captureLight[191]=true; 
captureX[192]=0.0; captureY[192]=-0.05511811023622047; captureExtend[192]=false; captureRetract[192]=false; captureThrower[192]=false; captureLight[192]=true; 
captureX[193]=0.0; captureY[193]=-0.05511811023622047; captureExtend[193]=false; captureRetract[193]=false; captureThrower[193]=false; captureLight[193]=false; 
captureX[194]=0.0; captureY[194]=-0.05511811023622047; captureExtend[194]=false; captureRetract[194]=false; captureThrower[194]=false; captureLight[194]=false; 
captureX[195]=0.0; captureY[195]=-0.05511811023622047; captureExtend[195]=false; captureRetract[195]=false; captureThrower[195]=false; captureLight[195]=false; 
captureX[196]=0.0; captureY[196]=-0.13385826771653545; captureExtend[196]=true; captureRetract[196]=false; captureThrower[196]=false; captureLight[196]=false; 
captureX[197]=-0.10546875; captureY[197]=-0.1732283464566929; captureExtend[197]=true; captureRetract[197]=false; captureThrower[197]=false; captureLight[197]=true; 
captureX[198]=-0.11953125; captureY[198]=-0.07086614173228346; captureExtend[198]=true; captureRetract[198]=false; captureThrower[198]=false; captureLight[198]=true; 
captureX[199]=-0.13359375; captureY[199]=-0.015748031496062992; captureExtend[199]=true; captureRetract[199]=false; captureThrower[199]=false; captureLight[199]=true; 
captureX[200]=-0.1546875; captureY[200]=-0.0; captureExtend[200]=false; captureRetract[200]=false; captureThrower[200]=false; captureLight[200]=true; 

captureX[201]=-0.1546875; captureY[201]=-0.0; captureExtend[201]=false; captureRetract[201]=false; captureThrower[201]=false; captureLight[201]=true; 
captureX[202]=-0.1546875; captureY[202]=-0.0; captureExtend[202]=false; captureRetract[202]=false; captureThrower[202]=false; captureLight[202]=false; 
captureX[203]=-0.1546875; captureY[203]=-0.0; captureExtend[203]=false; captureRetract[203]=false; captureThrower[203]=false; captureLight[203]=false; 
captureX[204]=-0.1546875; captureY[204]=-0.0; captureExtend[204]=false; captureRetract[204]=false; captureThrower[204]=false; captureLight[204]=false; 
captureX[205]=-0.1546875; captureY[205]=-0.0; captureExtend[205]=false; captureRetract[205]=true; captureThrower[205]=false; captureLight[205]=false; 
captureX[206]=-0.1546875; captureY[206]=-0.0; captureExtend[206]=false; captureRetract[206]=true; captureThrower[206]=false; captureLight[206]=false; 
captureX[207]=-0.10546875; captureY[207]=0.0078125; captureExtend[207]=false; captureRetract[207]=true; captureThrower[207]=false; captureLight[207]=true; 
captureX[208]=-0.10546875; captureY[208]=0.0078125; captureExtend[208]=false; captureRetract[208]=true; captureThrower[208]=false; captureLight[208]=true; 
captureX[209]=-0.084375; captureY[209]=0.0078125; captureExtend[209]=false; captureRetract[209]=true; captureThrower[209]=false; captureLight[209]=true; 
captureX[210]=-0.084375; captureY[210]=0.0078125; captureExtend[210]=false; captureRetract[210]=false; captureThrower[210]=false; captureLight[210]=false; 
captureX[211]=-0.084375; captureY[211]=0.0078125; captureExtend[211]=false; captureRetract[211]=false; captureThrower[211]=false; captureLight[211]=false; 

captureX[212]=-0.0703125; captureY[212]=0.0078125; captureExtend[212]=false; captureRetract[212]=false; captureThrower[212]=false; captureLight[212]=false; 
captureX[213]=-0.05625; captureY[213]=0.0078125; captureExtend[213]=false; captureRetract[213]=false; captureThrower[213]=false; captureLight[213]=false; 
captureX[214]=-0.03515625; captureY[214]=-0.05511811023622047; captureExtend[214]=false; captureRetract[214]=false; captureThrower[214]=false; captureLight[214]=false; 
captureX[215]=-0.03515625; captureY[215]=-0.07086614173228346; captureExtend[215]=false; captureRetract[215]=false; captureThrower[215]=false; captureLight[215]=false; 
captureX[216]=-0.03515625; captureY[216]=-0.09448818897637795; captureExtend[216]=false; captureRetract[216]=false; captureThrower[216]=false; captureLight[216]=false; 
captureX[217]=-0.03515625; captureY[217]=-0.11023622047244094; captureExtend[217]=false; captureRetract[217]=false; captureThrower[217]=false; captureLight[217]=true; 
captureX[218]=-0.084375; captureY[218]=-0.15748031496062992; captureExtend[218]=true; captureRetract[218]=false; captureThrower[218]=false; captureLight[218]=true; 
captureX[219]=-0.10546875; captureY[219]=-0.1732283464566929; captureExtend[219]=true; captureRetract[219]=false; captureThrower[219]=false; captureLight[219]=true; 
captureX[220]=-0.11953125; captureY[220]=-0.09448818897637795; captureExtend[220]=true; captureRetract[220]=false; captureThrower[220]=false; captureLight[220]=true; 
captureX[221]=-0.13359375; captureY[221]=-0.031496062992125984; captureExtend[221]=true; captureRetract[221]=false; captureThrower[221]=false; captureLight[221]=true; 

captureX[222]=-0.13359375; captureY[222]=-0.031496062992125984; captureExtend[222]=false; captureRetract[222]=false; captureThrower[222]=false; captureLight[222]=true; 
captureX[223]=-0.13359375; captureY[223]=-0.031496062992125984; captureExtend[223]=false; captureRetract[223]=false; captureThrower[223]=false; captureLight[223]=true; 
captureX[224]=-0.1546875; captureY[224]=-0.015748031496062992; captureExtend[224]=false; captureRetract[224]=false; captureThrower[224]=false; captureLight[224]=true; 
captureX[225]=-0.1546875; captureY[225]=-0.015748031496062992; captureExtend[225]=false; captureRetract[225]=false; captureThrower[225]=false; captureLight[225]=true; 
captureX[226]=-0.1546875; captureY[226]=-0.0; captureExtend[226]=false; captureRetract[226]=true; captureThrower[226]=false; captureLight[226]=true; 
captureX[227]=-0.1546875; captureY[227]=-0.0; captureExtend[227]=false; captureRetract[227]=true; captureThrower[227]=false; captureLight[227]=true; 
captureX[228]=-0.1546875; captureY[228]=0.0078125; captureExtend[228]=false; captureRetract[228]=true; captureThrower[228]=false; captureLight[228]=true; 
captureX[229]=-0.1546875; captureY[229]=0.0078125; captureExtend[229]=false; captureRetract[229]=true; captureThrower[229]=false; captureLight[229]=true; 
captureX[230]=-0.084375; captureY[230]=0.0078125; captureExtend[230]=false; captureRetract[230]=false; captureThrower[230]=false; captureLight[230]=true; 
captureX[231]=-0.084375; captureY[231]=0.0078125; captureExtend[231]=false; captureRetract[231]=false; captureThrower[231]=false; captureLight[231]=true; 

captureX[232]=-0.084375; captureY[232]=0.0078125; captureExtend[232]=false; captureRetract[232]=false; captureThrower[232]=false; captureLight[232]=true; 
captureX[233]=-0.0703125; captureY[233]=0.0078125; captureExtend[233]=false; captureRetract[233]=false; captureThrower[233]=false; captureLight[233]=false; 
captureX[234]=-0.02109375; captureY[234]=0.0078125; captureExtend[234]=false; captureRetract[234]=false; captureThrower[234]=false; captureLight[234]=false; 
captureX[235]=0.0; captureY[235]=0.0078125; captureExtend[235]=false; captureRetract[235]=false; captureThrower[235]=false; captureLight[235]=true; 
captureX[236]=0.02125984251968504; captureY[236]=-0.05511811023622047; captureExtend[236]=false; captureRetract[236]=false; captureThrower[236]=false; captureLight[236]=true; 
captureX[237]=0.09921259842519685; captureY[237]=-0.07086614173228346; captureExtend[237]=false; captureRetract[237]=false; captureThrower[237]=false; captureLight[237]=true; 
captureX[238]=0.11338582677165354; captureY[238]=-0.015748031496062992; captureExtend[238]=false; captureRetract[238]=false; captureThrower[238]=false; captureLight[238]=true; 
captureX[239]=0.11338582677165354; captureY[239]=-0.0; captureExtend[239]=false; captureRetract[239]=false; captureThrower[239]=false; captureLight[239]=true; 
captureX[240]=0.1700787401574803; captureY[240]=-0.0; captureExtend[240]=false; captureRetract[240]=false; captureThrower[240]=false; captureLight[240]=true; 
captureX[241]=0.35433070866141736; captureY[241]=-0.0; captureExtend[241]=false; captureRetract[241]=false; captureThrower[241]=false; captureLight[241]=true; 

captureX[242]=0.5881889763779528; captureY[242]=0.0546875; captureExtend[242]=false; captureRetract[242]=false; captureThrower[242]=false; captureLight[242]=false; 
captureX[243]=0.7653543307086614; captureY[243]=0.078125; captureExtend[243]=false; captureRetract[243]=false; captureThrower[243]=false; captureLight[243]=false; 
captureX[244]=0.9; captureY[244]=0.109375; captureExtend[244]=false; captureRetract[244]=false; captureThrower[244]=false; captureLight[244]=false; 
captureX[245]=0.9; captureY[245]=0.109375; captureExtend[245]=false; captureRetract[245]=false; captureThrower[245]=false; captureLight[245]=true; 
captureX[246]=0.9; captureY[246]=0.109375; captureExtend[246]=false; captureRetract[246]=false; captureThrower[246]=false; captureLight[246]=true; 
captureX[247]=0.9; captureY[247]=0.109375; captureExtend[247]=false; captureRetract[247]=false; captureThrower[247]=false; captureLight[247]=true; 
captureX[248]=0.9; captureY[248]=0.109375; captureExtend[248]=false; captureRetract[248]=false; captureThrower[248]=false; captureLight[248]=true; 
captureX[249]=0.9; captureY[249]=0.109375; captureExtend[249]=false; captureRetract[249]=false; captureThrower[249]=false; captureLight[249]=true; 
captureX[250]=0.9; captureY[250]=0.0546875; captureExtend[250]=false; captureRetract[250]=false; captureThrower[250]=false; captureLight[250]=true; 
captureX[251]=0.9; captureY[251]=0.0234375; captureExtend[251]=false; captureRetract[251]=false; captureThrower[251]=false; captureLight[251]=false; 
captureX[252]=0.7653543307086614; captureY[252]=-0.0; captureExtend[252]=false; captureRetract[252]=false; captureThrower[252]=false; captureLight[252]=false; 

captureX[253]=0.5598425196850394; captureY[253]=-0.09448818897637795; captureExtend[253]=false; captureRetract[253]=false; captureThrower[253]=false; captureLight[253]=false; 
captureX[254]=0.5598425196850394; captureY[254]=-0.09448818897637795; captureExtend[254]=false; captureRetract[254]=false; captureThrower[254]=false; captureLight[254]=false; 
captureX[255]=0.510236220472441; captureY[255]=-0.09448818897637795; captureExtend[255]=false; captureRetract[255]=false; captureThrower[255]=false; captureLight[255]=true; 
captureX[256]=0.45354330708661417; captureY[256]=-0.1968503937007874; captureExtend[256]=true; captureRetract[256]=false; captureThrower[256]=false; captureLight[256]=true; 
captureX[257]=0.3968503937007874; captureY[257]=-0.23622047244094488; captureExtend[257]=true; captureRetract[257]=false; captureThrower[257]=false; captureLight[257]=true; 
captureX[258]=0.21968503937007874; captureY[258]=-0.07086614173228346; captureExtend[258]=true; captureRetract[258]=false; captureThrower[258]=false; captureLight[258]=true; 
captureX[259]=0.02125984251968504; captureY[259]=0.0234375; captureExtend[259]=false; captureRetract[259]=false; captureThrower[259]=false; captureLight[259]=true; 
captureX[260]=-0.0703125; captureY[260]=0.09375; captureExtend[260]=false; captureRetract[260]=false; captureThrower[260]=false; captureLight[260]=true; 
captureX[261]=-0.11953125; captureY[261]=0.1484375; captureExtend[261]=false; captureRetract[261]=false; captureThrower[261]=false; captureLight[261]=true; 
captureX[262]=-0.0703125; captureY[262]=0.078125; captureExtend[262]=false; captureRetract[262]=false; captureThrower[262]=false; captureLight[262]=true; 
captureX[263]=-0.02109375; captureY[263]=0.0078125; captureExtend[263]=false; captureRetract[263]=false; captureThrower[263]=false; captureLight[263]=true; 

captureX[264]=-0.084375; captureY[264]=-0.0; captureExtend[264]=false; captureRetract[264]=false; captureThrower[264]=false; captureLight[264]=true; 
captureX[265]=0.0; captureY[265]=-0.031496062992125984; captureExtend[265]=false; captureRetract[265]=true; captureThrower[265]=false; captureLight[265]=true; 
captureX[266]=0.0; captureY[266]=-0.031496062992125984; captureExtend[266]=false; captureRetract[266]=true; captureThrower[266]=false; captureLight[266]=true; 
captureX[267]=0.0; captureY[267]=-0.031496062992125984; captureExtend[267]=false; captureRetract[267]=true; captureThrower[267]=false; captureLight[267]=true; 
captureX[268]=0.0; captureY[268]=-0.031496062992125984; captureExtend[268]=false; captureRetract[268]=false; captureThrower[268]=false; captureLight[268]=true; 
captureX[269]=0.0; captureY[269]=-0.07086614173228346; captureExtend[269]=false; captureRetract[269]=false; captureThrower[269]=false; captureLight[269]=true; 
captureX[270]=0.0; captureY[270]=-0.11023622047244094; captureExtend[270]=false; captureRetract[270]=false; captureThrower[270]=false; captureLight[270]=true; 
captureX[271]=0.0; captureY[271]=-0.11023622047244094; captureExtend[271]=false; captureRetract[271]=false; captureThrower[271]=false; captureLight[271]=true; 
captureX[272]=0.0; captureY[272]=-0.11023622047244094; captureExtend[272]=false; captureRetract[272]=false; captureThrower[272]=false; captureLight[272]=true; 

captureX[273]=0.0; captureY[273]=-0.11023622047244094; captureExtend[273]=false; captureRetract[273]=false; captureThrower[273]=false; captureLight[273]=false; 
captureX[274]=0.0; captureY[274]=-0.11023622047244094; captureExtend[274]=false; captureRetract[274]=false; captureThrower[274]=false; captureLight[274]=false; 
captureX[275]=0.0; captureY[275]=-0.11023622047244094; captureExtend[275]=false; captureRetract[275]=false; captureThrower[275]=false; captureLight[275]=false; 
captureX[276]=0.0; captureY[276]=-0.11023622047244094; captureExtend[276]=false; captureRetract[276]=false; captureThrower[276]=false; captureLight[276]=true; 
captureX[277]=0.0; captureY[277]=-0.11023622047244094; captureExtend[277]=false; captureRetract[277]=false; captureThrower[277]=false; captureLight[277]=true; 
captureX[278]=0.0; captureY[278]=-0.11023622047244094; captureExtend[278]=false; captureRetract[278]=false; captureThrower[278]=false; captureLight[278]=true; 
captureX[279]=0.0; captureY[279]=-0.11023622047244094; captureExtend[279]=false; captureRetract[279]=false; captureThrower[279]=false; captureLight[279]=true; 
captureX[280]=0.0; captureY[280]=-0.11023622047244094; captureExtend[280]=false; captureRetract[280]=false; captureThrower[280]=false; captureLight[280]=true; 
captureX[281]=0.0; captureY[281]=-0.11023622047244094; captureExtend[281]=false; captureRetract[281]=false; captureThrower[281]=false; captureLight[281]=true; 
captureX[282]=0.0; captureY[282]=-0.11023622047244094; captureExtend[282]=true; captureRetract[282]=false; captureThrower[282]=false; captureLight[282]=false; 

captureX[283]=0.0; captureY[283]=-0.031496062992125984; captureExtend[283]=true; captureRetract[283]=false; captureThrower[283]=false; captureLight[283]=false; 
captureX[284]=0.0; captureY[284]=-0.031496062992125984; captureExtend[284]=true; captureRetract[284]=false; captureThrower[284]=false; captureLight[284]=false; 
captureX[285]=0.0; captureY[285]=-0.015748031496062992; captureExtend[285]=true; captureRetract[285]=false; captureThrower[285]=false; captureLight[285]=false; 
captureX[286]=0.0; captureY[286]=-0.0; captureExtend[286]=true; captureRetract[286]=false; captureThrower[286]=false; captureLight[286]=true; 
captureX[287]=-0.05625; captureY[287]=0.0078125; captureExtend[287]=false; captureRetract[287]=false; captureThrower[287]=false; captureLight[287]=false; 
captureX[288]=-0.10546875; captureY[288]=0.0078125; captureExtend[288]=false; captureRetract[288]=false; captureThrower[288]=false; captureY[290]=0.0078125; captureExtend[290]=false; captureRetract[290]=false; captureThrower[290]=false; captureLight[290]=true; 
captureX[291]=-0.0703125; captureY[291]=0.0078125; captureExtend[291]=false; captureRetract[291]=false; captureThrower[291]=false; captureLight[291]=true; 
captureX[292]=-0.0703125; captureY[292]=0.0078125; captureExtend[292]=false; captureRetract[292]=true; captureThrower[292]=false; captureLight[292]=true; 
captureX[293]=-0.11953125; captureY[293]=0.0078125; captureExtend[293]=false; captureRetract[293]=true; captureThrower[293]=false; captureLight[293]=false; 

captureX[294]=-0.11953125; captureY[294]=0.0078125; captureExtend[294]=false; captureRetract[294]=true; captureThrower[294]=false; captureLight[294]=false; 
captureX[295]=-0.0703125; captureY[295]=0.0078125; captureExtend[295]=false; captureRetract[295]=true; captureThrower[295]=false; captureLight[295]=true; 
captureX[296]=-0.0703125; captureY[296]=0.0078125; captureExtend[296]=false; captureRetract[296]=false; captureThrower[296]=false; captureLight[296]=true; 
captureX[297]=-0.05625; captureY[297]=0.0078125; captureExtend[297]=false; captureRetract[297]=false; captureThrower[297]=false; captureLight[297]=true; 
captureX[298]=-0.03515625; captureY[298]=0.0078125; captureExtend[298]=false; captureRetract[298]=false; captureThrower[298]=false; captureLight[298]=true; 
captureX[299]=-0.02109375; captureY[299]=0.0078125; captureExtend[299]=false; captureRetract[299]=false; captureThrower[299]=false; captureLight[299]=true; 
captureX[300]=-0.00703125; captureY[300]=0.0078125; captureExtend[300]=false; captureRetract[300]=false; captureThrower[300]=false; captureLight[300]=true; 
captureX[301]=-0.00703125; captureY[301]=-0.07086614173228346; captureExtend[301]=false; captureRetract[301]=false; captureThrower[301]=false; captureLight[301]=true; 
captureX[302]=0.0; captureY[302]=-0.11023622047244094; captureExtend[302]=false; captureRetract[302]=false; captureThrower[302]=false; captureLight[302]=true; 
captureX[303]=0.0; captureY[303]=-0.11023622047244094; captureExtend[303]=false; captureRetract[303]=false; captureThrower[303]=false; captureLight[303]=true; 

captureX[304]=0.0; captureY[304]=-0.11023622047244094; captureExtend[304]=false; captureRetract[304]=false; captureThrower[304]=false; captureLight[304]=true; 
captureX[305]=0.0; captureY[305]=-0.11023622047244094; captureExtend[305]=false; captureRetract[305]=false; captureThrower[305]=false; captureLight[305]=true; 
captureX[306]=0.02125984251968504; captureY[306]=-0.13385826771653545; captureExtend[306]=false; captureRetract[306]=false; captureThrower[306]=false; captureLight[306]=true; 
captureX[307]=0.049606299212598425; captureY[307]=-0.15748031496062992; captureExtend[307]=false; captureRetract[307]=false; captureThrower[307]=false; captureLight[307]=true; 
captureX[308]=0.14173228346456693; captureY[308]=-0.15748031496062992; captureExtend[308]=false; captureRetract[308]=false; captureThrower[308]=false; captureLight[308]=true; 
captureX[309]=0.21968503937007874; captureY[309]=-0.05511811023622047; captureExtend[309]=false; captureRetract[309]=false; captureThrower[309]=false; captureLight[309]=true; 
captureX[310]=0.5881889763779528; captureY[310]=0.0078125; captureExtend[310]=false; captureRetract[310]=false; captureThrower[310]=false; captureLight[310]=true; 
captureX[311]=0.8149606299212598; captureY[311]=0.0546875; captureExtend[311]=false; captureRetract[311]=false; captureThrower[311]=false; captureLight[311]=true; 
captureX[312]=0.9; captureY[312]=0.078125; captureExtend[312]=false; captureRetract[312]=false; captureThrower[312]=false; captureLight[312]=false; 
captureX[313]=0.9; captureY[313]=0.078125; captureExtend[313]=false; captureRetract[313]=false; captureThrower[313]=false; captureLight[313]=false; 

captureX[314]=0.9; captureY[314]=0.078125; captureExtend[314]=false; captureRetract[314]=false; captureThrower[314]=false; captureLight[314]=false; 
captureX[315]=0.9; captureY[315]=0.078125; captureExtend[315]=false; captureRetract[315]=false; captureThrower[315]=false; captureLight[315]=true; 
captureX[316]=0.9; captureY[316]=0.078125; captureExtend[316]=false; captureRetract[316]=false; captureThrower[316]=false; captureLight[316]=true; 
captureX[317]=0.9; captureY[317]=0.078125; captureExtend[317]=false; captureRetract[317]=false; captureThrower[317]=false; captureLight[317]=true; 
captureX[318]=0.9; captureY[318]=0.078125; captureExtend[318]=false; captureRetract[318]=false; captureThrower[318]=false; captureLight[318]=true; 
captureX[319]=0.9; captureY[319]=0.078125; captureExtend[319]=false; captureRetract[319]=false; captureThrower[319]=false; captureLight[319]=true; 
captureX[320]=0.9; captureY[320]=0.078125; captureExtend[320]=false; captureRetract[320]=false; captureThrower[320]=false; captureLight[320]=true; 
captureX[321]=0.9; captureY[321]=0.078125; captureExtend[321]=false; captureRetract[321]=false; captureThrower[321]=false; captureLight[321]=true; 
captureX[322]=0.9; captureY[322]=0.078125; captureExtend[322]=false; captureRetract[322]=false; captureThrower[322]=false; captureLight[322]=false; 
captureX[323]=0.9; captureY[323]=0.09375; captureExtend[323]=false; captureRetract[323]=false; captureThrower[323]=false; captureLight[323]=false; 
captureX[324]=0.9; captureY[324]=0.09375; captureExtend[324]=false; captureRetract[324]=false; captureThrower[324]=false; captureLight[324]=false; 

captureX[325]=0.9; captureY[325]=0.09375; captureExtend[325]=false; captureRetract[325]=false; captureThrower[325]=false; captureLight[325]=true; 
captureX[326]=0.694488188976378; captureY[326]=0.0078125; captureExtend[326]=false; captureRetract[326]=false; captureThrower[326]=false; captureLight[326]=true; 
captureX[327]=0.3968503937007874; captureY[327]=-0.0; captureExtend[327]=false; captureRetract[327]=false; captureThrower[327]=false; captureLight[327]=true; 
captureX[328]=-0.00703125; captureY[328]=-0.13385826771653545; captureExtend[328]=false; captureRetract[328]=false; captureThrower[328]=false; captureLight[328]=true; 
captureX[329]=-0.084375; captureY[329]=-0.05511811023622047; captureExtend[329]=false; captureRetract[329]=false; captureThrower[329]=false; captureLight[329]=true; 
captureX[330]=-0.00703125; captureY[330]=-0.0; captureExtend[330]=false; captureRetract[330]=false; captureThrower[330]=false; captureLight[330]=true; 
captureX[331]=-0.084375; captureY[331]=-0.07086614173228346; captureExtend[331]=true; captureRetract[331]=false; captureThrower[331]=false; captureLight[331]=true; 
captureX[332]=-0.11953125; captureY[332]=-0.13385826771653545; captureExtend[332]=true; captureRetract[332]=false; captureThrower[332]=false; captureLight[332]=false; 
captureX[333]=-0.13359375; captureY[333]=-0.07086614173228346; captureExtend[333]=true; captureRetract[333]=false; captureThrower[333]=false; captureLight[333]=false; 
captureX[334]=-0.13359375; captureY[334]=-0.031496062992125984; captureExtend[334]=true; captureRetract[334]=false; captureThrower[334]=false; captureLight[334]=false; 

captureX[335]=-0.13359375; captureY[335]=-0.031496062992125984; captureExtend[335]=false; captureRetract[335]=false; captureThrower[335]=false; captureLight[335]=true; 
captureX[336]=-0.13359375; captureY[336]=-0.11023622047244094; captureExtend[336]=false; captureRetract[336]=false; captureThrower[336]=false; captureLight[336]=true; 
captureX[337]=-0.0703125; captureY[337]=-0.11023622047244094; captureExtend[337]=false; captureRetract[337]=false; captureThrower[337]=false; captureLight[337]=true; 
captureX[338]=-0.0703125; captureY[338]=-0.13385826771653545; captureExtend[338]=false; captureRetract[338]=false; captureThrower[338]=false; captureLight[338]=true; 
captureX[339]=-0.05625; captureY[339]=-0.13385826771653545; captureExtend[339]=false; captureRetract[339]=false; captureThrower[339]=false; captureLight[339]=true; 
captureX[340]=-0.05625; captureY[340]=-0.13385826771653545; captureExtend[340]=false; captureRetract[340]=false; captureThrower[340]=false; captureLight[340]=true; 
captureX[341]=-0.05625; captureY[341]=-0.05511811023622047; captureExtend[341]=false; captureRetract[341]=true; captureThrower[341]=false; captureLight[341]=true; 
captureX[342]=-0.05625; captureY[342]=-0.015748031496062992; captureExtend[342]=false; captureRetract[342]=true; captureThrower[342]=false; captureLight[342]=true; 
captureX[343]=-0.05625; captureY[343]=-0.0; captureExtend[343]=false; captureRetract[343]=true; captureThrower[343]=false; captureLight[343]=true; 
captureX[344]=-0.05625; captureY[344]=-0.0; captureExtend[344]=false; captureRetract[344]=false; captureThrower[344]=false; captureLight[344]=true; 
captureX[345]=-0.05625; captureY[345]=-0.11023622047244094; captureExtend[345]=false; captureRetract[345]=false; captureThrower[345]=false; captureLight[345]=true; 

captureX[346]=-0.05625; captureY[346]=-0.15748031496062992; captureExtend[346]=false; captureRetract[346]=false; captureThrower[346]=false; captureLight[346]=true; 
captureX[347]=-0.05625; captureY[347]=-0.15748031496062992; captureExtend[347]=false; captureRetract[347]=false; captureThrower[347]=false; captureLight[347]=true; 
captureX[348]=-0.03515625; captureY[348]=-0.15748031496062992; captureExtend[348]=false; captureRetract[348]=false; captureThrower[348]=false; captureLight[348]=true; 
captureX[349]=-0.03515625; captureY[349]=-0.15748031496062992; captureExtend[349]=false; captureRetract[349]=false; captureThrower[349]=false; captureLight[349]=true; 
captureX[350]=-0.03515625; captureY[350]=-0.15748031496062992; captureExtend[350]=false; captureRetract[350]=false; captureThrower[350]=false; captureLight[350]=true; 
captureX[351]=-0.03515625; captureY[351]=-0.15748031496062992; captureExtend[351]=false; captureRetract[351]=false; captureThrower[351]=false; captureLight[351]=false; 
captureX[352]=-0.03515625; captureY[352]=-0.15748031496062992; captureExtend[352]=false; captureRetract[352]=false; captureThrower[352]=false; captureLight[352]=false; 
captureX[353]=-0.03515625; captureY[353]=-0.15748031496062992; captureExtend[353]=false; captureRetract[353]=false; captureThrower[353]=false; captureLight[353]=false; 
captureX[354]=-0.03515625; captureY[354]=-0.15748031496062992; captureExtend[354]=false; captureRetract[354]=false; captureThrower[354]=false; captureLight[354]=false; 

captureX[355]=-0.084375; captureY[355]=-0.15748031496062992; captureExtend[355]=false; captureRetract[355]=false; captureThrower[355]=false; captureLight[355]=true; 
captureX[356]=-0.084375; captureY[356]=-0.15748031496062992; captureExtend[356]=false; captureRetract[356]=false; captureThrower[356]=false; captureLight[356]=true; 
captureX[357]=-0.084375; captureY[357]=-0.1732283464566929; captureExtend[357]=false; captureRetract[357]=false; captureThrower[357]=false; captureLight[357]=true; 
captureX[358]=-0.084375; captureY[358]=-0.1732283464566929; captureExtend[358]=true; captureRetract[358]=false; captureThrower[358]=false; captureLight[358]=true; 
captureX[359]=-0.03515625; captureY[359]=-0.1968503937007874; captureExtend[359]=true; captureRetract[359]=false; captureThrower[359]=false; captureLight[359]=true; 
captureX[360]=-0.00703125; captureY[360]=-0.1968503937007874; captureExtend[360]=true; captureRetract[360]=false; captureThrower[360]=false; captureLight[360]=true; 
captureX[361]=-0.00703125; captureY[361]=-0.1968503937007874; captureExtend[361]=true; captureRetract[361]=false; captureThrower[361]=false; captureLight[361]=true; 
captureX[362]=-0.00703125; captureY[362]=-0.1968503937007874; captureExtend[362]=false; captureRetract[362]=false; captureThrower[362]=false; captureLight[362]=true; 
captureX[363]=0.0; captureY[363]=-0.1968503937007874; captureExtend[363]=false; captureRetract[363]=false; captureThrower[363]=false; captureLight[363]=true; 
captureX[364]=0.0; captureY[363]=-0.1968503937007874; captureExtend[364]=false; captureRetract[364]=false; captureThrower[364]=false; captureLight[364]=true; 

captureX[365]=0.0; captureY[365]=-0.1968503937007874; captureExtend[365]=false; captureRetract[365]=false; captureThrower[365]=false; captureLight[365]=true; 
captureX[366]=0.0; captureY[366]=-0.1968503937007874; captureExtend[366]=false; captureRetract[366]=false; captureThrower[366]=false; captureLight[366]=true; 
captureX[367]=0.0; captureY[367]=-0.09448818897637795; captureExtend[367]=false; captureRetract[367]=true; captureThrower[367]=false; captureLight[367]=true; 
captureX[368]=0.0; captureY[368]=-0.05511811023622047; captureExtend[368]=false; captureRetract[368]=true; captureThrower[368]=false; captureLight[368]=true; 
captureX[369]=0.0; captureY[369]=-0.031496062992125984; captureExtend[369]=false; captureRetract[369]=true; captureThrower[369]=false; captureLight[369]=true; 
captureX[370]=0.0; captureY[370]=-0.031496062992125984; captureExtend[370]=false; captureRetract[370]=true; captureThrower[370]=false; captureLight[370]=true; 
captureX[371]=0.0; captureY[371]=-0.031496062992125984; captureExtend[371]=false; captureRetract[371]=false; captureThrower[371]=false; captureLight[371]=false; 
captureX[372]=-0.05625; captureY[372]=-0.15748031496062992; captureExtend[372]=false; captureRetract[372]=false; captureThrower[372]=false; captureLight[372]=false; 
captureX[373]=-0.0703125; captureY[373]=-0.1732283464566929; captureExtend[373]=false; captureRetract[373]=false; captureThrower[373]=false; captureLight[373]=false; 
captureX[374]=-0.084375; captureY[374]=-0.1732283464566929; captureExtend[374]=false; captureRetract[374]=false; captureThrower[374]=false; captureLight[374]=true; 
captureX[375]=-0.084375; captureY[375]=-0.1732283464566929; captureExtend[375]=false; captureRetract[375]=false; captureThrower[375]=false; captureLight[375]=true; 

captureX[376]=-0.084375; captureY[376]=-0.1732283464566929; captureExtend[376]=false; captureRetract[376]=false; captureThrower[376]=false; captureLight[376]=true; 
captureX[377]=-0.084375; captureY[377]=-0.1732283464566929; captureExtend[377]=false; captureRetract[377]=false; captureThrower[377]=false; captureLight[377]=true; 
captureX[378]=-0.084375; captureY[378]=-0.1732283464566929; captureExtend[378]=false; captureRetract[378]=false; captureThrower[378]=false; captureLight[378]=true; 
captureX[379]=-0.084375; captureY[379]=-0.1732283464566929; captureExtend[379]=false; captureRetract[379]=false; captureThrower[379]=false; captureLight[379]=true; 
captureX[380]=-0.10546875; captureY[380]=-0.1732283464566929; captureExtend[380]=false; captureRetract[380]=false; captureThrower[380]=false; captureLight[380]=false; 
captureX[381]=-0.10546875; captureY[381]=-0.1732283464566929; captureExtend[381]=false; captureRetract[381]=false; captureThrower[381]=false; captureLight[381]=false; 
captureX[382]=-0.10546875; captureY[382]=-0.1732283464566929; captureExtend[382]=true; captureRetract[382]=false; captureThrower[382]=false; captureLight[382]=false; 
captureX[383]=-0.10546875; captureY[383]=-0.1732283464566929; captureExtend[383]=true; captureRetract[383]=false; captureThrower[383]=false; captureLight[383]=false; 
captureX[384]=-0.10546875; captureY[384]=-0.1732283464566929; captureExtend[384]=true; captureRetract[384]=false; captureThrower[384]=false; captureLight[384]=false; 
captureX[385]=-0.02109375; captureY[385]=-0.1732283464566929; captureExtend[385]=true; captureRetract[385]=false; captureThrower[385]=false; captureLight[385]=true; 

captureX[386]=-0.02109375; captureY[386]=-0.1732283464566929; captureExtend[386]=true; captureRetract[386]=false; captureThrower[386]=false; captureLight[386]=true; 
captureX[387]=-0.02109375; captureY[387]=-0.1732283464566929; captureExtend[387]=false; captureRetract[387]=false; captureThrower[387]=false; captureLight[387]=true; 
captureX[388]=-0.00703125; captureY[388]=-0.1732283464566929; captureExtend[388]=false; captureRetract[388]=false; captureThrower[388]=false; captureLight[388]=true; 
captureX[389]=-0.00703125; captureY[389]=-0.1732283464566929; captureExtend[389]=false; captureRetract[389]=false; captureThrower[389]=false; captureLight[389]=true; 
captureX[390]=-0.00703125; captureY[390]=-0.1732283464566929; captureExtend[390]=false; captureRetract[390]=false; captureThrower[390]=false; captureLight[390]=true; 
captureX[391]=-0.00703125; captureY[391]=-0.1732283464566929; captureExtend[391]=false; captureRetract[391]=false; captureThrower[391]=false; captureLight[391]=false; 
captureX[392]=-0.00703125; captureY[392]=-0.1732283464566929; captureExtend[392]=false; captureRetract[392]=false; captureThrower[392]=false; captureLight[392]=false; 
captureX[393]=-0.00703125; captureY[393]=-0.09448818897637795; captureExtend[393]=false; captureRetract[393]=true; captureThrower[393]=false; captureLight[393]=true; 
captureX[394]=0.0; captureY[394]=-0.09448818897637795; captureExtend[394]=false; captureRetract[394]=true; captureThrower[394]=false; captureLight[394]=true; 

captureX[395]=0.0; captureY[395]=-0.07086614173228346; captureExtend[395]=false; captureRetract[395]=true; captureThrower[395]=false; captureLight[395]=true; 
captureX[396]=0.0; captureY[396]=-0.07086614173228346; captureExtend[396]=false; captureRetract[396]=true; captureThrower[396]=false; captureLight[396]=true; 
captureX[397]=0.0; captureY[397]=-0.07086614173228346; captureExtend[397]=false; captureRetract[397]=false; captureThrower[397]=false; captureLight[397]=true; 
captureX[398]=0.0; captureY[398]=-0.07086614173228346; captureExtend[398]=false; captureRetract[398]=false; captureThrower[398]=false; captureLight[398]=true; 
captureX[399]=0.0; captureY[399]=-0.1732283464566929; captureExtend[399]=false; captureRetract[399]=false; captureThrower[399]=false; captureLight[399]=true; 
captureX[400]=-0.0703125; captureY[400]=-0.1732283464566929; captureExtend[400]=false; captureRetract[400]=false; captureThrower[400]=false; captureLight[400]=false; 
captureX[401]=-0.13359375; captureY[401]=-0.1732283464566929; captureExtend[401]=false; captureRetract[401]=false; captureThrower[401]=false; captureLight[401]=false; 
captureX[402]=-0.20390625; captureY[402]=-0.1732283464566929; captureExtend[402]=false; captureRetract[402]=false; captureThrower[402]=false; captureLight[402]=false; 
captureX[403]=-0.21796875000000002; captureY[403]=-0.09448818897637795; captureExtend[403]=false; captureRetract[403]=false; captureThrower[403]=false; captureLight[403]=false; 
captureX[404]=-0.21796875000000002; captureY[404]=-0.09448818897637795; captureExtend[404]=false; captureRetract[404]=false; captureThrower[404]=false; captureLight[404]=true; 

captureX[405]=-0.16875; captureY[405]=-0.09448818897637795; captureExtend[405]=false; captureRetract[405]=false; captureThrower[405]=false; captureLight[405]=true; 
captureX[406]=-0.0703125; captureY[406]=-0.05511811023622047; captureExtend[406]=false; captureRetract[406]=false; captureThrower[406]=false; captureLight[406]=true; 
captureX[407]=0.0; captureY[407]=-0.031496062992125984; captureExtend[407]=false; captureRetract[407]=false; captureThrower[407]=false; captureLight[407]=false; 
captureX[408]=0.11338582677165354; captureY[408]=-0.0; captureExtend[408]=false; captureRetract[408]=false; captureThrower[408]=false; captureLight[408]=false; 
captureX[409]=0.23385826771653542; captureY[409]=-0.0; captureExtend[409]=false; captureRetract[409]=false; captureThrower[409]=false; captureLight[409]=false; 
captureX[410]=0.4322834645669291; captureY[410]=0.0078125; captureExtend[410]=false; captureRetract[410]=false; captureThrower[410]=false; captureLight[410]=true; 
captureX[411]=0.6448818897637795; captureY[411]=0.078125; captureExtend[411]=false; captureRetract[411]=false; captureThrower[411]=false; captureLight[411]=true; 
captureX[412]=0.8291338582677166; captureY[412]=0.09375; captureExtend[412]=false; captureRetract[412]=false; captureThrower[412]=false; captureLight[412]=true; 
captureX[413]=0.9; captureY[413]=0.0390625; captureExtend[413]=false; captureRetract[413]=false; captureThrower[413]=false; captureLight[413]=false; 
captureX[414]=0.9; captureY[414]=0.0390625; captureExtend[414]=false; captureRetract[414]=false; captureThrower[414]=false; captureLight[414]=false; 
captureX[415]=0.9; captureY[415]=0.0234375; captureExtend[415]=false; captureRetract[415]=false; captureThrower[415]=false; captureLight[415]=true; 

captureX[416]=0.9; captureY[416]=0.0234375; captureExtend[416]=false; captureRetract[416]=false; captureThrower[416]=false; captureLight[416]=true; 
captureX[417]=0.9; captureY[417]=0.0078125; captureExtend[417]=false; captureRetract[417]=false; captureThrower[417]=false; captureLight[417]=true; 
captureX[418]=0.9; captureY[418]=0.0078125; captureExtend[418]=false; captureRetract[418]=false; captureThrower[418]=false; captureLight[418]=true; 
captureX[419]=0.9; captureY[419]=0.0078125; captureExtend[419]=false; captureRetract[419]=false; captureThrower[419]=false; captureLight[419]=true; 
captureX[420]=0.9; captureY[420]=0.0078125; captureExtend[420]=false; captureRetract[420]=false; captureThrower[420]=false; captureLight[420]=true; 
captureX[421]=0.9; captureY[421]=0.0078125; captureExtend[421]=false; captureRetract[421]=false; captureThrower[421]=false; captureLight[421]=true; 
captureX[422]=0.8291338582677166; captureY[422]=-0.0; captureExtend[422]=false; captureRetract[422]=false; captureThrower[422]=false; captureLight[422]=true; 
captureX[423]=0.7370078740157481; captureY[423]=-0.0; captureExtend[423]=true; captureRetract[423]=false; captureThrower[423]=false; captureLight[423]=false; 
captureX[424]=0.48188976377952764; captureY[424]=-0.09448818897637795; captureExtend[424]=true; captureRetract[424]=false; captureThrower[424]=false; captureLight[424]=true; 
captureX[425]=0.21968503937007874; captureY[425]=-0.09448818897637795; captureExtend[425]=true; captureRetract[425]=false; captureThrower[425]=false; captureLight[425]=true; 

captureX[426]=0.0; captureY[426]=-0.0; captureExtend[426]=false; captureRetract[426]=false; captureThrower[426]=false; captureLight[426]=true; 
captureX[427]=-0.00703125; captureY[427]=0.0078125; captureExtend[427]=false; captureRetract[427]=false; captureThrower[427]=false; captureLight[427]=true; 
captureX[428]=-0.03515625; captureY[428]=0.0078125; captureExtend[428]=false; captureRetract[428]=false; captureThrower[428]=false; captureLight[428]=true; 
captureX[429]=-0.03515625; captureY[429]=0.0078125; captureExtend[429]=false; captureRetract[429]=false; captureThrower[429]=false; captureLight[429]=true; 
captureX[430]=-0.03515625; captureY[430]=0.0078125; captureExtend[430]=false; captureRetract[430]=false; captureThrower[430]=false; captureLight[430]=true; 
captureX[431]=-0.03515625; captureY[431]=0.0078125; captureExtend[431]=false; captureRetract[431]=false; captureThrower[431]=false; captureLight[431]=false; 
captureX[432]=-0.03515625; captureY[432]=0.0078125; captureExtend[432]=false; captureRetract[432]=false; captureThrower[432]=false; captureLight[432]=false; 
captureX[433]=-0.03515625; captureY[433]=0.0078125; captureExtend[433]=false; captureRetract[433]=true; captureThrower[433]=false; captureLight[433]=false; 
captureX[434]=-0.03515625; captureY[434]=0.0078125; captureExtend[434]=false; captureRetract[434]=true; captureThrower[434]=false; captureLight[434]=false; 
captureX[435]=-0.03515625; captureY[435]=0.0234375; captureExtend[435]=false; captureRetract[435]=true; captureThrower[435]=false; captureLight[435]=true; 
captureX[436]=-0.03515625; captureY[436]=0.0234375; captureExtend[436]=false; captureRetract[436]=false; captureThrower[436]=false; captureLight[436]=true; 

captureX[437]=-0.03515625; captureY[437]=0.0234375; captureExtend[437]=false; captureRetract[437]=false; captureThrower[437]=false; captureLight[437]=true; 
captureX[438]=-0.03515625; captureY[438]=0.0234375; captureExtend[438]=false; captureRetract[438]=false; captureThrower[438]=false; captureLight[438]=true; 
captureX[439]=-0.03515625; captureY[439]=0.0234375; captureExtend[439]=false; captureRetract[439]=false; captureThrower[439]=false; captureLight[439]=true; 
captureX[440]=-0.03515625; captureY[440]=0.0234375; captureExtend[440]=false; captureRetract[440]=false; captureThrower[440]=false; captureLight[440]=true; 
captureX[441]=-0.03515625; captureY[441]=0.0234375; captureExtend[441]=false; captureRetract[441]=false; captureThrower[441]=false; captureLight[441]=false; 
captureX[442]=-0.03515625; captureY[442]=0.0234375; captureExtend[442]=false; captureRetract[442]=false; captureThrower[442]=false; captureLight[442]=false; 
captureX[443]=-0.03515625; captureY[443]=0.0234375; captureExtend[443]=false; captureRetract[443]=false; captureThrower[443]=false; captureLight[443]=false; 
captureX[444]=-0.03515625; captureY[444]=0.0234375; captureExtend[444]=false; captureRetract[444]=false; captureThrower[444]=false; captureLight[444]=true; 
captureX[445]=-0.03515625; captureY[445]=0.0234375; captureExtend[445]=false; captureRetract[445]=false; captureThrower[445]=false; captureLight[445]=true; 
captureX[446]=-0.03515625; captureY[446]=0.0234375; captureExtend[446]=false; captureRetract[446]=false; captureThrower[446]=false; captureLight[446]=true; 

captureX[447]=-0.03515625; captureY[447]=0.0234375; captureExtend[447]=false; captureRetract[447]=false; captureThrower[447]=false; captureLight[447]=true; 
captureX[448]=-0.03515625; captureY[448]=0.0234375; captureExtend[448]=false; captureRetract[448]=false; captureThrower[448]=false; captureLight[448]=true; 
captureX[449]=-0.03515625; captureY[449]=0.0234375; captureExtend[449]=false; captureRetract[449]=false; captureThrower[449]=false; captureLight[449]=true; 
captureX[450]=-0.03515625; captureY[450]=0.0234375; captureExtend[450]=false; captureRetract[450]=false; captureThrower[450]=false; captureLight[450]=true; 
captureX[451]=-0.03515625; captureY[451]=0.0234375; captureExtend[451]=false; captureRetract[451]=false; captureThrower[451]=false; captureLight[451]=false; 
captureX[452]=-0.03515625; captureY[452]=0.0234375; captureExtend[452]=true; captureRetract[452]=false; captureThrower[452]=false; captureLight[452]=false; 
captureX[453]=0.007086614173228346; captureY[453]=-0.05511811023622047; captureExtend[453]=true; captureRetract[453]=false; captureThrower[453]=false; captureLight[453]=false; 
captureX[454]=0.007086614173228346; captureY[454]=-0.07086614173228346; captureExtend[454]=true; captureRetract[454]=false; captureThrower[454]=false; captureLight[454]=true; 
captureX[455]=0.007086614173228346; captureY[455]=-0.07086614173228346; captureExtend[455]=true; captureRetract[455]=false; captureThrower[455]=false; captureLight[455]=true; 
captureX[456]=0.007086614173228346; captureY[456]=-0.07086614173228346; captureExtend[456]=false; captureRetract[456]=false; captureThrower[456]=false; captureLight[456]=true; 

captureX[457]=0.007086614173228346; captureY[457]=-0.09448818897637795; captureExtend[457]=false; captureRetract[457]=false; captureThrower[457]=false; captureLight[457]=true; 
captureX[458]=0.007086614173228346; captureY[458]=-0.09448818897637795; captureExtend[458]=false; captureRetract[458]=false; captureThrower[458]=false; captureLight[458]=true; 
captureX[459]=0.007086614173228346; captureY[459]=-0.09448818897637795; captureExtend[459]=false; captureRetract[459]=false; captureThrower[459]=false; captureLight[459]=true; 
captureX[460]=0.007086614173228346; captureY[460]=-0.09448818897637795; captureExtend[460]=false; captureRetract[460]=false; captureThrower[460]=false; captureLight[460]=false; 
captureX[461]=0.007086614173228346; captureY[461]=-0.09448818897637795; captureExtend[461]=false; captureRetract[461]=false; captureThrower[461]=false; captureLight[461]=false; 
captureX[462]=0.007086614173228346; captureY[462]=-0.031496062992125984; captureExtend[462]=false; captureRetract[462]=false; captureThrower[462]=false; captureLight[462]=false; 
captureX[463]=0.007086614173228346; captureY[463]=-0.015748031496062992; captureExtend[463]=false; captureRetract[463]=true; captureThrower[463]=false; captureLight[463]=true; 
captureX[464]=0.007086614173228346; captureY[464]=-0.015748031496062992; captureExtend[464]=false; captureRetract[464]=true; captureThrower[464]=false; captureLight[464]=true; 
captureX[465]=0.007086614173228346; captureY[465]=-0.015748031496062992; captureExtend[465]=false; captureRetract[465]=true; captureThrower[465]=false; captureLight[465]=true; 

captureX[466]=0.007086614173228346; captureY[466]=-0.015748031496062992; captureExtend[466]=false; captureRetract[466]=true; captureThrower[466]=false; captureLight[466]=true; 
captureX[467]=0.007086614173228346; captureY[467]=-0.0; captureExtend[467]=false; captureRetract[467]=true; captureThrower[467]=false; captureLight[467]=true; 
captureX[468]=0.007086614173228346; captureY[468]=-0.0; captureExtend[468]=false; captureRetract[468]=false; captureThrower[468]=false; captureLight[468]=true; 
captureX[469]=0.007086614173228346; captureY[469]=-0.0; captureExtend[469]=false; captureRetract[469]=false; captureThrower[469]=false; captureLight[469]=false; 
captureX[470]=0.007086614173228346; captureY[470]=-0.0; captureExtend[470]=false; captureRetract[470]=false; captureThrower[470]=false; captureLight[470]=false; 
captureX[471]=0.007086614173228346; captureY[471]=-0.0; captureExtend[471]=false; captureRetract[471]=false; captureThrower[471]=false; captureLight[471]=false; 
captureX[472]=0.007086614173228346; captureY[472]=-0.0; captureExtend[472]=false; captureRetract[472]=false; captureThrower[472]=false; captureLight[472]=false; 
captureX[473]=0.007086614173228346; captureY[473]=-0.05511811023622047; captureExtend[473]=false; captureRetract[473]=false; captureThrower[473]=false; captureLight[473]=true; 
captureX[474]=0.007086614173228346; captureY[474]=-0.07086614173228346; captureExtend[474]=false; captureRetract[474]=false; captureThrower[474]=false; captureLight[474]=true; 
captureX[475]=0.007086614173228346; captureY[475]=-0.07086614173228346; captureExtend[475]=false; captureRetract[475]=false; captureThrower[475]=false; captureLight[475]=false; 

captureX[476]=0.007086614173228346; captureY[476]=-0.07086614173228346; captureExtend[476]=false; captureRetract[476]=false; captureThrower[476]=false; captureLight[476]=false; 
captureX[477]=0.007086614173228346; captureY[477]=-0.07086614173228346; captureExtend[477]=false; captureRetract[477]=false; captureThrower[477]=false; captureLight[477]=false; 
captureX[478]=0.007086614173228346; captureY[478]=-0.07086614173228346; captureExtend[478]=false; captureRetract[478]=false; captureThrower[478]=false; captureLight[478]=true; 
captureX[479]=0.007086614173228346; captureY[479]=-0.07086614173228346; captureExtend[479]=false; captureRetract[479]=false; captureThrower[479]=false; captureLight[479]=true; 
captureX[480]=0.007086614173228346; captureY[480]=-0.015748031496062992; captureExtend[480]=false; captureRetract[480]=false; captureThrower[480]=false; captureLight[480]=true; 
captureX[481]=0.12755905511811025; captureY[481]=-0.0; captureExtend[481]=false; captureRetract[481]=false; captureThrower[481]=false; captureLight[481]=false; 
captureX[482]=0.21968503937007874; captureY[482]=-0.0; captureExtend[482]=false; captureRetract[482]=false; captureThrower[482]=false; captureLight[482]=false; 
captureX[483]=0.4322834645669291; captureY[483]=0.078125; captureExtend[483]=false; captureRetract[483]=false; captureThrower[483]=false; captureLight[483]=true; 
captureX[484]=0.49606299212598426; captureY[484]=0.09375; captureExtend[484]=false; captureRetract[484]=false; captureThrower[484]=false; captureLight[484]=true; 

captureX[485]=0.3968503937007874; captureY[485]=0.0078125; captureExtend[485]=false; captureRetract[485]=false; captureThrower[485]=false; captureLight[485]=true; 
captureX[486]=0.24803149606299213; captureY[486]=-0.0; captureExtend[486]=false; captureRetract[486]=false; captureThrower[486]=false; captureLight[486]=false; 
captureX[487]=-0.1546875; captureY[487]=-0.0; captureExtend[487]=false; captureRetract[487]=false; captureThrower[487]=false; captureLight[487]=false; 
captureX[488]=0.02125984251968504; captureY[488]=-0.0; captureExtend[488]=false; captureRetract[488]=false; captureThrower[488]=false; captureLight[488]=false; 
captureX[489]=-0.03515625; captureY[489]=-0.0; captureExtend[489]=false; captureRetract[489]=false; captureThrower[489]=false; captureLight[489]=true; 
captureX[490]=0.0; captureY[490]=-0.0; captureExtend[490]=false; captureRetract[490]=false; captureThrower[490]=false; captureLight[490]=true; 
captureX[491]=0.0; captureY[491]=-0.0; captureExtend[491]=false; captureRetract[491]=false; captureThrower[491]=false; captureLight[491]=true; 
captureX[492]=0.0; captureY[492]=-0.0; captureExtend[492]=false; captureRetract[492]=false; captureThrower[492]=false; captureLight[492]=false; 
captureX[493]=0.0; captureY[493]=-0.0; captureExtend[493]=false; captureRetract[493]=false; captureThrower[493]=false; captureLight[493]=false; 
captureX[494]=0.0; captureY[494]=-0.0; captureExtend[494]=false; captureRetract[494]=false; captureThrower[494]=false; captureLight[494]=true; 
captureX[495]=0.0; captureY[495]=-0.0; captureExtend[495]=false; captureRetract[495]=false; captureThrower[495]=false; captureLight[495]=true; 

captureX[496]=0.0; captureY[496]=-0.0; captureExtend[496]=false; captureRetract[496]=false; captureThrower[496]=false; captureLight[496]=true; 
captureX[497]=0.0; captureY[497]=-0.0; captureExtend[497]=false; captureRetract[497]=false; captureThrower[497]=false; captureLight[497]=true; 
captureX[498]=0.0; captureY[498]=-0.0; captureExtend[498]=false; captureRetract[498]=false; captureThrower[498]=false; captureLight[498]=true; 
captureX[499]=0.0; captureY[499]=-0.0; captureExtend[499]=false; captureRetract[499]=false; captureThrower[499]=false; captureLight[499]=true; 
captureX[500]=0.0; captureY[500]=-0.0; captureExtend[500]=false; captureRetract[500]=false; captureThrower[500]=false; captureLight[500]=true; 
captureX[501]=0.0; captureY[501]=-0.0; captureExtend[501]=false; captureRetract[501]=false; captureThrower[501]=false; captureLight[501]=true; 
captureX[502]=0.0; captureY[502]=-0.0; captureExtend[502]=false; captureRetract[502]=false; captureThrower[502]=false; captureLight[502]=true; 
captureX[503]=0.0; captureY[503]=-0.0; captureExtend[503]=false; captureRetract[503]=false; captureThrower[503]=false; captureLight[503]=true; 
captureX[504]=0.0; captureY[504]=-0.0; captureExtend[504]=false; captureRetract[504]=false; captureThrower[504]=false; captureLight[504]=true; 
captureX[505]=0.0; captureY[505]=-0.0; captureExtend[505]=false; captureRetract[505]=false; captureThrower[505]=false; captureLight[505]=true; 
captureX[506]=0.0; captureY[506]=-0.0; captureExtend[506]=false; captureRetract[506]=false; captureThrower[506]=false; captureLight[506]=true; 
captureX[507]=0.0; captureY[507]=-0.0; captureExtend[507]=false; captureRetract[507]=false; captureThrower[507]=false; captureLight[507]=true; 

captureX[508]=0.0; captureY[508]=-0.0; captureExtend[508]=false; captureRetract[508]=false; captureThrower[508]=false; captureLight[508]=true; 
captureX[509]=0.0; captureY[509]=-0.0; captureExtend[509]=false; captureRetract[509]=false; captureThrower[509]=false; captureLight[509]=true; 
captureX[510]=0.0; captureY[510]=-0.0; captureExtend[510]=false; captureRetract[510]=false; captureThrower[510]=false; captureLight[510]=true; 
captureX[511]=0.0; captureY[511]=-0.0; captureExtend[511]=false; captureRetract[511]=false; captureThrower[511]=false; captureLight[511]=true; 
captureX[512]=0.0; captureY[512]=-0.0; captureExtend[512]=false; captureRetract[512]=false; captureThrower[512]=false; captureLight[512]=true; 
captureX[513]=0.0; captureY[513]=-0.0; captureExtend[513]=false; captureRetract[513]=false; captureThrower[513]=false; captureLight[513]=true; 
captureX[514]=0.0; captureY[514]=-0.0; captureExtend[514]=false; captureRetract[514]=false; captureThrower[514]=true; captureLight[514]=true; 
captureX[515]=0.0; captureY[515]=-0.0; captureExtend[515]=false; captureRetract[515]=false; captureThrower[515]=true; captureLight[515]=true; 
captureX[516]=0.0; captureY[516]=-0.0; captureExtend[516]=false; captureRetract[516]=false; captureThrower[516]=true; captureLight[516]=true; 
captureX[517]=0.0; captureY[517]=-0.0; captureExtend[517]=false; captureRetract[517]=false; captureThrower[517]=true; captureLight[517]=true; 
captureX[518]=0.0; captureY[518]=-0.0; captureExtend[518]=false; captureRetract[518]=false; captureThrower[518]=true; captureLight[518]=true; 
captureX[519]=0.0; captureY[519]=-0.0; captureExtend[519]=false; captureRetract[519]=false; captureThrower[519]=true; captureLight[519]=false; 

captureX[520]=0.0; captureY[520]=-0.0; captureExtend[520]=false; captureRetract[520]=false; captureThrower[520]=true; captureLight[520]=false; 
captureX[521]=0.0; captureY[521]=-0.0; captureExtend[521]=false; captureRetract[521]=false; captureThrower[521]=true; captureLight[521]=false; 
captureX[522]=0.0; captureY[522]=-0.0; captureExtend[522]=false; captureRetract[522]=false; captureThrower[522]=true; captureLight[522]=false; 
captureX[523]=0.0; captureY[523]=-0.0; captureExtend[523]=false; captureRetract[523]=false; captureThrower[523]=true; captureLight[523]=true; 
captureX[524]=0.0; captureY[524]=-0.0; captureExtend[524]=false; captureRetract[524]=false; captureThrower[524]=true; captureLight[524]=true; 
captureX[525]=0.0; captureY[525]=-0.0; captureExtend[525]=false; captureRetract[525]=false; captureThrower[525]=true; captureLight[525]=true; 
captureX[526]=0.0; captureY[526]=-0.0; captureExtend[526]=false; captureRetract[526]=false; captureThrower[526]=true; captureLight[526]=true; 
captureX[527]=0.0; captureY[527]=-0.0; captureExtend[527]=false; captureRetract[527]=false; captureThrower[527]=false; captureLight[527]=true; 
captureX[528]=0.0; captureY[528]=-0.0; captureExtend[528]=false; captureRetract[528]=false; captureThrower[528]=false; captureLight[528]=false; 
captureX[529]=0.0; captureY[529]=-0.0; captureExtend[529]=false; captureRetract[529]=false; captureThrower[529]=false; captureLight[529]=false; 
captureX[530]=0.0; captureY[530]=-0.0; captureExtend[530]=false; captureRetract[530]=false; captureThrower[530]=false; captureLight[530]=false; 

captureX[531]=0.0; captureY[531]=-0.0; captureExtend[531]=false; captureRetract[531]=false; captureThrower[531]=false; captureLight[531]=false; 
captureX[532]=0.0; captureY[532]=-0.0; captureExtend[532]=false; captureRetract[532]=false; captureThrower[532]=false; captureLight[532]=false; 
captureX[533]=0.0; captureY[533]=-0.0; captureExtend[533]=false; captureRetract[533]=false; captureThrower[533]=false; captureLight[533]=true; 
captureX[534]=0.0; captureY[534]=-0.0; captureExtend[534]=false; captureRetract[534]=false; captureThrower[534]=false; captureLight[534]=true; 
captureX[535]=0.0; captureY[535]=-0.0; captureExtend[535]=false; captureRetract[535]=false; captureThrower[535]=false; captureLight[535]=true; 
captureX[536]=-0.05625; captureY[536]=0.0078125; captureExtend[536]=false; captureRetract[536]=false; captureThrower[536]=false; captureLight[536]=true; 
captureX[537]=-0.084375; captureY[537]=0.0078125; captureExtend[537]=false; captureRetract[537]=false; captureThrower[537]=false; captureLight[537]=true; 
captureX[538]=-0.13359375; captureY[538]=0.0078125; captureExtend[538]=false; captureRetract[538]=false; captureThrower[538]=false; captureLight[538]=true; 
captureX[539]=-0.0703125; captureY[539]=-0.05511811023622047; captureExtend[539]=false; captureRetract[539]=false; captureThrower[539]=false; captureLight[539]=true; 
captureX[540]=-0.0703125; captureY[540]=-0.05511811023622047; captureExtend[540]=false; captureRetract[540]=false; captureThrower[540]=false; captureLight[540]=false; 
captureX[541]=-0.0703125; captureY[541]=-0.0; captureExtend[541]=false; captureRetract[541]=false; captureThrower[541]=false; captureLight[541]=false; 

captureX[542]=-0.0703125; captureY[542]=-0.0; captureExtend[542]=false; captureRetract[542]=false; captureThrower[542]=false; captureLight[542]=false; 
captureX[543]=-0.13359375; captureY[543]=-0.0; captureExtend[543]=false; captureRetract[543]=false; captureThrower[543]=false; captureLight[543]=false; 
captureX[544]=-0.13359375; captureY[544]=0.0078125; captureExtend[544]=true; captureRetract[544]=false; captureThrower[544]=false; captureLight[544]=true; 
captureX[545]=-0.13359375; captureY[545]=0.0078125; captureExtend[545]=true; captureRetract[545]=false; captureThrower[545]=false; captureLight[545]=true; 
captureX[546]=-0.0703125; captureY[546]=0.0078125; captureExtend[546]=true; captureRetract[546]=false; captureThrower[546]=false; captureLight[546]=true; 
captureX[547]=-0.0703125; captureY[547]=0.0078125; captureExtend[547]=false; captureRetract[547]=false; captureThrower[547]=false; captureLight[547]=true; 
captureX[548]=-0.05625; captureY[548]=0.0078125; captureExtend[548]=false; captureRetract[548]=false; captureThrower[548]=false; captureLight[548]=true; 
captureX[549]=-0.05625; captureY[549]=0.0078125; captureExtend[549]=false; captureRetract[549]=false; captureThrower[549]=false; captureLight[549]=true; 
captureX[550]=-0.05625; captureY[550]=0.0078125; captureExtend[550]=false; captureRetract[550]=false; captureThrower[550]=false; captureLight[550]=false; 
captureX[551]=-0.05625; captureY[551]=0.0078125; captureExtend[551]=false; captureRetract[551]=false; captureThrower[551]=false; captureLight[551]=false; 
captureX[552]=-0.05625; captureY[552]=0.0078125; captureExtend[552]=false; captureRetract[552]=false; captureThrower[552]=false; captureLight[552]=false; 

captureX[553]=-0.05625; captureY[553]=0.0078125; captureExtend[553]=false; captureRetract[553]=false; captureThrower[553]=false; captureLight[553]=false; 
captureX[554]=-0.05625; captureY[554]=0.0078125; captureExtend[554]=false; captureRetract[554]=false; captureThrower[554]=false; captureLight[554]=true; 
captureX[555]=-0.02109375; captureY[555]=0.0078125; captureExtend[555]=false; captureRetract[555]=true; captureThrower[555]=false; captureLight[555]=true; 
captureX[556]=-0.00703125; captureY[556]=0.0078125; captureExtend[556]=false; captureRetract[556]=true; captureThrower[556]=false; captureLight[556]=true; 
captureX[557]=-0.0703125; captureY[557]=0.0078125; captureExtend[557]=false; captureRetract[557]=true; captureThrower[557]=false; captureLight[557]=true; 
captureX[558]=-0.084375; captureY[558]=0.0078125; captureExtend[558]=false; captureRetract[558]=true; captureThrower[558]=false; captureLight[558]=true; 
captureX[559]=-0.084375; captureY[559]=0.0078125; captureExtend[559]=false; captureRetract[559]=true; captureThrower[559]=false; captureLight[559]=true; 
captureX[560]=-0.084375; captureY[560]=0.0078125; captureExtend[560]=false; captureRetract[560]=false; captureThrower[560]=false; captureLight[560]=false; 
captureX[561]=-0.084375; captureY[561]=0.0078125; captureExtend[561]=false; captureRetract[561]=false; captureThrower[561]=false; captureLight[561]=false; 
captureX[562]=-0.00703125; captureY[562]=-0.13385826771653545; captureExtend[562]=false; captureRetract[562]=false; captureThrower[562]=false; captureLight[562]=false; 

captureX[563]=-0.00703125; captureY[563]=-0.15748031496062992; captureExtend[563]=false; captureRetract[563]=false; captureThrower[563]=false; captureLight[563]=false; 
captureX[564]=-0.00703125; captureY[564]=-0.15748031496062992; captureExtend[564]=false; captureRetract[564]=false; captureThrower[564]=false; captureLight[564]=true; 
captureX[565]=-0.00703125; captureY[565]=-0.15748031496062992; captureExtend[565]=false; captureRetract[565]=false; captureThrower[565]=false; captureLight[565]=true; 
captureX[566]=-0.00703125; captureY[566]=-0.15748031496062992; captureExtend[566]=false;  captureRetract[566]=false; captureThrower[566]=false; captureLight[566]=true;  
captureX[567]=-0.00703125; captureY[567]=-0.15748031496062992; captureExtend[567]=false;  captureRetract[567]=false; captureThrower[567]=false; captureLight[567]=true;  
captureX[568]=-0.0703125; captureY[568]=-0.07086614173228346; captureExtend[568]=false; captureRetract[568]=false; captureThrower[568]=false; captureLight[568]=false; 
captureX[569]=-0.084375; captureY[569]=-0.07086614173228346; captureExtend[569]=false; captureRetract[569]=false; captureThrower[569]=false; captureLight[569]=false; 
captureX[570]=-0.084375; captureY[570]=-0.07086614173228346; captureExtend[570]=true; captureRetract[570]=false; captureThrower[570]=false; captureLight[570]=false; 
captureX[571]=-0.084375; captureY[571]=-0.07086614173228346; captureExtend[571]=true; captureRetract[571]=false; captureThrower[571]=false; captureLight[571]=false; 
captureX[572]=-0.084375; captureY[572]=-0.07086614173228346; captureExtend[572]=true; captureRetract[572]=false; captureThrower[572]=false; captureLight[572]=false; 

captureX[573]=-0.084375; captureY[573]=-0.07086614173228346; captureExtend[573]=true; captureRetract[573]=false; captureThrower[573]=false; captureLight[573]=false; 
captureX[574]=-0.00703125; captureY[574]=-0.13385826771653545; captureExtend[574]=true; captureRetract[574]=false; captureThrower[574]=false; captureLight[574]=true; 
captureX[575]=-0.00703125; captureY[575]=-0.11023622047244094; captureExtend[575]=false; captureRetract[575]=false; captureThrower[575]=false; captureLight[575]=true; 
captureX[576]=-0.00703125; captureY[576]=-0.11023622047244094; captureExtend[576]=false; captureRetract[576]=false; captureThrower[576]=false; captureLight[576]=true; 
captureX[577]=-0.00703125; captureY[577]=-0.11023622047244094; captureExtend[577]=false; captureRetract[577]=false; captureThrower[577]=false; captureLight[577]=true; 
captureX[578]=-0.00703125; captureY[578]=-0.11023622047244094; captureExtend[578]=false; captureRetract[578]=false; captureThrower[578]=false; captureLight[578]=true; 
captureX[579]=-0.00703125; captureY[579]=-0.11023622047244094; captureExtend[579]=false; captureRetract[579]=false; captureThrower[579]=false; captureLight[579]=true; 
captureX[580]=-0.00703125; captureY[580]=-0.11023622047244094; captureExtend[580]=false; captureRetract[580]=false; captureThrower[580]=false; captureLight[580]=true; 
captureX[581]=-0.00703125; captureY[581]=-0.11023622047244094; captureExtend[581]=false; captureRetract[581]=false; captureThrower[581]=false; captureLight[581]=true; 
captureX[582]=-0.00703125; captureY[582]=-0.09448818897637795; captureExtend[582]=false; captureRetract[582]=false; captureThrower[582]=false; captureLight[582]=true; 

captureX[583]=-0.00703125; captureY[583]=-0.07086614173228346; captureExtend[583]=false; captureRetract[583]=false; captureThrower[583]=false; captureLight[583]=true; 
captureX[584]=-0.0052734375; captureY[584]=-0.015748031496062992; captureExtend[584]=false; captureRetract[584]=true; captureThrower[584]=false; captureLight[584]=true; 
captureX[585]=0.0; captureY[585]=-0.0; captureExtend[585]=false; captureRetract[585]=true; captureThrower[585]=false; captureLight[585]=true; 
captureX[586]=0.0; captureY[586]=0.0078125; captureExtend[586]=false; captureRetract[586]=true; captureThrower[586]=false; captureLight[586]=true; 
captureX[587]=0.0; captureY[587]=0.0078125; captureExtend[587]=false; captureRetract[587]=true; captureThrower[587]=false; captureLight[587]=true; 
captureX[588]=-0.0703125; captureY[588]=0.0078125; captureExtend[588]=false; captureRetract[588]=true; captureThrower[588]=false; captureLight[588]=true; 
captureX[589]=-0.0703125; captureY[589]=0.0078125; captureExtend[589]=false; captureRetract[589]=false; captureThrower[589]=false; captureLight[589]=true; 
captureX[590]=-0.0703125; captureY[590]=-0.05511811023622047; captureExtend[590]=false; captureRetract[590]=false; captureThrower[590]=false; captureLight[590]=true; 
captureX[591]=-0.02109375; captureY[591]=-0.07086614173228346; captureExtend[591]=false; captureRetract[591]=false; captureThrower[591]=false; captureLight[591]=false; 
captureX[592]=-0.02109375; captureY[592]=-0.07086614173228346; captureExtend[592]=false; captureRetract[592]=false; captureThrower[592]=false; captureLight[592]=false; 

captureX[593]=-0.02109375; captureY[593]=-0.07086614173228346; captureExtend[593]=false; captureRetract[593]=false; captureThrower[593]=false; captureLight[593]=false; 
captureX[594]=-0.02109375; captureY[594]=-0.07086614173228346; captureExtend[594]=false; captureRetract[594]=false; captureThrower[594]=false; captureLight[594]=false; 
captureX[595]=-0.00703125; captureY[595]=-0.07086614173228346; captureExtend[595]=false; captureRetract[595]=false; captureThrower[595]=false; captureLight[595]=true; 
captureX[596]=-0.00703125; captureY[596]=-0.07086614173228346; captureExtend[596]=false; captureRetract[596]=false; captureThrower[596]=false; captureLight[596]=true; 
captureX[597]=-0.00703125; captureY[597]=-0.07086614173228346; captureExtend[597]=true; captureRetract[597]=false; captureThrower[597]=false; captureLight[597]=false; 
captureX[598]=-0.00703125; captureY[598]=-0.11023622047244094; captureExtend[598]=true; captureRetract[598]=false; captureThrower[598]=false; captureLight[598]=false; 
captureX[599]=-0.00703125; captureY[599]=-0.11023622047244094; captureExtend[599]=true; captureRetract[599]=false; captureThrower[599]=false; captureLight[599]=false; 
captureX[600]=-0.00703125; captureY[600]=-0.11023622047244094; captureExtend[600]=true; captureRetract[600]=false; captureThrower[600]=false; captureLight[600]=true; 
captureX[601]=-0.00703125; captureY[601]=-0.13385826771653545; captureExtend[601]=false; captureRetract[601]=false; captureThrower[601]=false; captureLight[601]=true; 
captureX[602]=-0.00703125; captureY[602]=-0.15748031496062992; captureExtend[602]=false; captureRetract[602]=false; captureThrower[602]=false; captureLight[602]=false; 

captureX[603]=-0.00703125; captureY[603]=-0.15748031496062992; captureExtend[603]=false; captureRetract[603]=false; captureThrower[603]=false; captureLight[603]=false; 
captureX[604]=-0.00703125; captureY[604]=-0.15748031496062992; captureExtend[604]=false; captureRetract[604]=false; captureThrower[604]=false; captureLight[604]=false; 
captureX[605]=-0.00703125; captureY[605]=-0.15748031496062992; captureExtend[605]=false; captureRetract[605]=false; captureThrower[605]=false; captureLight[605]=true; 
captureX[606]=-0.00703125; captureY[606]=-0.15748031496062992; captureExtend[606]=false; captureRetract[606]=false; captureThrower[606]=false; captureLight[606]=true; 
captureX[607]=-0.00703125; captureY[607]=-0.15748031496062992; captureExtend[607]=false; captureRetract[607]=false; captureThrower[607]=false; captureLight[607]=true; 
captureX[608]=-0.00703125; captureY[608]=-0.09448818897637795; captureExtend[608]=false; captureRetract[608]=false; captureThrower[608]=false; captureLight[608]=true; 
captureX[609]=-0.00703125; captureY[609]=-0.07086614173228346; captureExtend[609]=false; captureRetract[609]=false; captureThrower[609]=false; captureLight[609]=true; 
captureX[610]=-0.00703125; captureY[610]=-0.015748031496062992; captureExtend[610]=false; captureRetract[610]=true; captureThrower[610]=false; captureLight[610]=true; 
captureX[611]=-0.00703125; captureY[611]=-0.0; captureExtend[611]=false; captureRetract[611]=true; captureThrower[611]=false; captureLight[611]=false; 
captureX[612]=0.0; captureY[612]=-0.0; captureExtend[612]=false; captureRetract[612]=true; captureThrower[612]=false; captureLight[612]=false; 

captureX[613]=0.0; captureY[613]=-0.0; captureExtend[613]=false; captureRetract[613]=true; captureThrower[613]=false; captureLight[613]=false; 
captureX[614]=0.0; captureY[614]=-0.07086614173228346; captureExtend[614]=false; captureRetract[614]=false; captureThrower[614]=false; captureLight[614]=true; 
captureX[615]=0.0; captureY[615]=-0.11023622047244094; captureExtend[615]=false; captureRetract[615]=false; captureThrower[615]=false; captureLight[615]=true; 
captureX[616]=0.0; captureY[616]=-0.13385826771653545; captureExtend[616]=false; captureRetract[616]=false; captureThrower[616]=false; captureLight[616]=true; 
captureX[617]=0.0; captureY[617]=-0.13385826771653545; captureExtend[617]=false; captureRetract[617]=false; captureThrower[617]=false; captureLight[617]=true;
captureX[618]=0.0; captureY[618]=-0.13385826771653545; captureExtend[618]=false; captureRetract[618]=false; captureThrower[618]=false; captureLight[618]=true; 
captureX[619]=0.0; captureY[619]=-0.13385826771653545; captureExtend[619]=false; captureRetract[619]=false; captureThrower[619]=false; captureLight[619]=true; 
captureX[620]=0.0; captureY[620]=-0.13385826771653545; captureExtend[620]=false; captureRetract[620]=false; captureThrower[620]=false; captureLight[620]=true; 
captureX[621]=0.0; captureY[621]=-0.13385826771653545; captureExtend[621]=false; captureRetract[621]=false; captureThrower[621]=false; captureLight[621]=true; 
captureX[622]=0.0; captureY[622]=-0.07086614173228346; captureExtend[622]=false; captureRetract[622]=false; captureThrower[622]=false; captureLight[622]=true; 

captureX[623]=0.11338582677165354; captureY[623]=-0.0; captureExtend[623]=false; captureRetract[623]=false; captureThrower[623]=false; captureLight[623]=true; 
captureX[624]=0.6448818897637795; captureY[624]=0.1640625; captureExtend[624]=false; captureRetract[624]=false; captureThrower[624]=false; captureLight[624]=true; 
captureX[625]=0.9; captureY[625]=0.21875; captureExtend[625]=false; captureRetract[625]=false; captureThrower[625]=false; captureLight[625]=true; 
captureX[626]=0.9; captureY[626]=0.109375; captureExtend[626]=false; captureRetract[626]=false; captureThrower[626]=false; captureLight[626]=true; 
captureX[627]=0.9; captureY[627]=0.109375; captureExtend[627]=false; captureRetract[627]=false; captureThrower[627]=false; captureLight[627]=true; 
captureX[628]=0.9; captureY[628]=0.109375; captureExtend[628]=false; captureRetract[628]=false; captureThrower[628]=false; captureLight[628]=true; 
captureX[629]=0.9; captureY[629]=0.109375; captureExtend[629]=false; captureRetract[629]=false; captureThrower[629]=false; captureLight[629]=true; 
captureX[630]=0.9; captureY[630]=0.109375; captureExtend[630]=false; captureRetract[630]=false; captureThrower[630]=false; captureLight[630]=true; 
captureX[631]=0.9; captureY[631]=0.109375; captureExtend[631]=false; captureRetract[631]=false; captureThrower[631]=false; captureLight[631]=true; 
captureX[632]=0.9; captureY[632]=0.109375; captureExtend[632]=false; captureRetract[632]=false; captureThrower[632]=false; captureLight[632]=false; 
captureX[633]=0.9; captureY[633]=0.109375; captureExtend[633]=false; captureRetract[633]=false; captureThrower[633]=false; captureLight[633]=false; 

captureX[634]=0.9; captureY[634]=0.109375; captureExtend[634]=false; captureRetract[634]=false; captureThrower[634]=false; captureLight[634]=true; 
captureX[635]=0.9; captureY[635]=0.109375; captureExtend[635]=false; captureRetract[635]=false; captureThrower[635]=false; captureLight[635]=true; 
captureX[636]=0.9; captureY[636]=0.109375; captureExtend[636]=false; captureRetract[636]=false; captureThrower[636]=false; captureLight[636]=true; 
captureX[637]=0.9; captureY[637]=0.109375; captureExtend[637]=false; captureRetract[637]=false; captureThrower[637]=false; captureLight[637]=true; 
captureX[638]=0.9; captureY[638]=0.109375; captureExtend[638]=false; captureRetract[638]=false; captureThrower[638]=false; captureLight[638]=true; 
captureX[639]=0.9; captureY[639]=0.109375; captureExtend[639]=false; captureRetract[639]=false; captureThrower[639]=false; captureLight[639]=true; 
captureX[640]=0.9; captureY[640]=0.109375; captureExtend[640]=false; captureRetract[640]=false; captureThrower[640]=false; captureLight[640]=true; 
captureX[641]=0.9; captureY[641]=0.109375; captureExtend[641]=false; captureRetract[641]=false; captureThrower[641]=false; captureLight[641]=false; 
captureX[642]=0.9; captureY[642]=0.109375; captureExtend[642]=false; captureRetract[642]=false; captureThrower[642]=false; captureLight[642]=false; 
captureX[643]=0.9; captureY[643]=0.109375; captureExtend[643]=false; captureRetract[643]=false; captureThrower[643]=false; captureLight[643]=false; 
captureX[644]=0.9; captureY[644]=0.109375; captureExtend[644]=false; captureRetract[644]=false; captureThrower[644]=false; captureLight[644]=true; 

captureX[645]=0.9; captureY[645]=0.109375; captureExtend[645]=false; captureRetract[645]=false; captureThrower[645]=false; captureLight[645]=true; 
captureX[646]=0.9; captureY[646]=0.109375; captureExtend[646]=false; captureRetract[646]=false; captureThrower[646]=false; captureLight[646]=true; 
captureX[647]=0.9; captureY[647]=0.109375; captureExtend[647]=false; captureRetract[647]=false; captureThrower[647]=false; captureLight[647]=true; 
captureX[648]=0.9; captureY[648]=0.109375; captureExtend[648]=false; captureRetract[648]=false; captureThrower[648]=false; captureLight[648]=true; 
captureX[649]=0.9; captureY[649]=0.109375; captureExtend[649]=false; captureRetract[649]=false; captureThrower[649]=false; captureLight[649]=false; 
captureX[650]=0.9; captureY[650]=0.109375; captureExtend[650]=false; captureRetract[650]=false; captureThrower[650]=false; captureLight[650]=false; 
captureX[651]=0.9; captureY[651]=0.109375; captureExtend[651]=false; captureRetract[651]=false; captureThrower[651]=false; captureLight[651]=false; 
captureX[652]=0.9; captureY[652]=0.109375; captureExtend[652]=false; captureRetract[652]=false; captureThrower[652]=false; captureLight[652]=false; 
captureX[653]=0.9; captureY[653]=0.109375; captureExtend[653]=false; captureRetract[653]=false; captureThrower[653]=false; captureLight[653]=true; 
captureX[654]=0.9; captureY[654]=0.109375; captureExtend[654]=false; captureRetract[654]=false; captureThrower[654]=false; captureLight[654]=true; 
captureX[655]=0.9; captureY[655]=0.109375; captureExtend[655]=false; captureRetract[655]=false; captureThrower[655]=false; captureLight[655]=true; 

captureX[656]=0.9; captureY[656]=0.109375; captureExtend[656]=false; captureRetract[656]=false; captureThrower[656]=false; captureLight[656]=true; 
captureX[657]=0.9; captureY[657]=0.109375; captureExtend[657]=false; captureRetract[657]=false; captureThrower[657]=false; captureLight[657]=true; 
captureX[658]=0.9; captureY[658]=0.109375; captureExtend[658]=false; captureRetract[658]=false; captureThrower[658]=false; captureLight[658]=true; 
captureX[659]=0.9; captureY[659]=0.109375; captureExtend[659]=false; captureRetract[659]=false; captureThrower[659]=false; captureLight[659]=false; 
captureX[660]=0.9; captureY[660]=0.109375; captureExtend[660]=false; captureRetract[660]=false; captureThrower[660]=false; captureLight[660]=false; 
captureX[661]=0.9; captureY[661]=0.109375; captureExtend[661]=false; captureRetract[661]=false; captureThrower[661]=false; captureLight[661]=false; 
captureX[662]=0.9; captureY[662]=0.109375; captureExtend[662]=false; captureRetract[662]=false; captureThrower[662]=false; captureLight[662]=true; 
captureX[663]=0.9; captureY[663]=0.109375; captureExtend[663]=false; captureRetract[663]=false; captureThrower[663]=false; captureLight[663]=true; 
captureX[664]=0.9; captureY[664]=0.109375; captureExtend[664]=false; captureRetract[664]=false; captureThrower[664]=false; captureLight[664]=true; 
captureX[665]=0.9; captureY[665]=0.09375; captureExtend[665]=false; captureRetract[665]=false; captureThrower[665]=false; captureLight[665]=true; 
captureX[666]=0.9; captureY[666]=0.09375; captureExtend[666]=false; captureRetract[666]=false; captureThrower[666]=false; captureLight[666]=true; 

captureX[667]=0.9; captureY[667]=0.09375; captureExtend[667]=false; captureRetract[667]=false; captureThrower[667]=false; captureLight[667]=true; 
captureX[668]=0.9; captureY[668]=0.09375; captureExtend[668]=false; captureRetract[668]=false; captureThrower[668]=false; captureLight[668]=true; 
captureX[669]=0.9; captureY[669]=0.09375; captureExtend[669]=false; captureRetract[669]=false; captureThrower[669]=false; captureLight[669]=true; 
captureX[670]=0.9; captureY[670]=0.09375; captureExtend[670]=false; captureRetract[670]=false; captureThrower[670]=false; captureLight[670]=false; 
captureX[671]=0.9; captureY[671]=0.09375; captureExtend[671]=false; captureRetract[671]=false; captureThrower[671]=false; captureLight[671]=false; 
captureX[672]=0.9; captureY[672]=0.09375; captureExtend[672]=false; captureRetract[672]=false; captureThrower[672]=false; captureLight[672]=false; 
captureX[673]=0.9; captureY[673]=0.09375; captureExtend[673]=false; captureRetract[673]=false; captureThrower[673]=false; captureLight[673]=true; 
captureX[674]=0.9; captureY[674]=0.09375; captureExtend[674]=false; captureRetract[674]=false; captureThrower[674]=false; captureLight[674]=true; 
captureX[675]=0.9; captureY[675]=0.09375; captureExtend[675]=false; captureRetract[675]=false; captureThrower[675]=false; captureLight[675]=true; 
captureX[676]=0.9; captureY[676]=0.09375; captureExtend[676]=false; captureRetract[676]=false; captureThrower[676]=false; captureLight[676]=true; 
captureX[677]=0.9; captureY[677]=0.09375; captureExtend[677]=false; captureRetract[677]=false; captureThrower[677]=false; captureLight[677]=true; 

captureX[678]=0.9; captureY[678]=0.09375; captureExtend[678]=false; captureRetract[678]=false; captureThrower[678]=false; captureLight[678]=true; 
captureX[679]=0.9; captureY[679]=0.09375; captureExtend[679]=false; captureRetract[679]=false; captureThrower[679]=false; captureLight[679]=true; 
captureX[680]=0.9; captureY[680]=0.09375; captureExtend[680]=false; captureRetract[680]=false; captureThrower[680]=false; captureLight[680]=true; 
captureX[681]=0.9; captureY[681]=0.078125; captureExtend[681]=false; captureRetract[681]=false; captureThrower[681]=false; captureLight[681]=true; 
captureX[682]=0.9; captureY[682]=0.0390625; captureExtend[682]=false; captureRetract[682]=false; captureThrower[682]=false; captureLight[682]=false; 
captureX[683]=0.9; captureY[683]=0.0078125; captureExtend[683]=false; captureRetract[683]=false; captureThrower[683]=false; captureLight[683]=true; 
captureX[684]=0.9; captureY[684]=0.0078125; captureExtend[684]=false; captureRetract[684]=false; captureThrower[684]=false; captureLight[684]=true; 
captureX[685]=0.9; captureY[685]=0.0078125; captureExtend[685]=false; captureRetract[685]=false; captureThrower[685]=false; captureLight[685]=true; 
captureX[686]=0.9; captureY[686]=0.0078125; captureExtend[686]=false; captureRetract[686]=false; captureThrower[686]=false; captureLight[686]=true; 
captureX[687]=0.9; captureY[687]=0.0078125; captureExtend[687]=false; captureRetract[687]=false; captureThrower[687]=false; captureLight[687]=true; 
captureX[688]=0.9; captureY[688]=0.0078125; captureExtend[688]=false; captureRetract[688]=false; captureThrower[688]=false; captureLight[688]=true; 

captureX[689]=0.9; captureY[689]=0.0078125; captureExtend[689]=false; captureRetract[689]=false; captureThrower[689]=false; captureLight[689]=false; 
captureX[690]=0.9; captureY[690]=0.0078125; captureExtend[690]=false; captureRetract[690]=false; captureThrower[690]=false; captureLight[690]=false; 
captureX[691]=0.9; captureY[691]=0.0078125; captureExtend[691]=false; captureRetract[691]=false; captureThrower[691]=false; captureLight[691]=false; 
captureX[692]=0.9; captureY[692]=0.0078125; captureExtend[692]=false; captureRetract[692]=false; captureThrower[692]=false; captureLight[692]=false; 
captureX[693]=0.9; captureY[693]=0.0078125; captureExtend[693]=false; captureRetract[693]=false; captureThrower[693]=false; captureLight[693]=false; 
captureX[694]=0.9; captureY[694]=0.0078125; captureExtend[694]=false; captureRetract[694]=false; captureThrower[694]=false; captureLight[694]=true; 
captureX[695]=0.9; captureY[695]=0.0078125; captureExtend[695]=false; captureRetract[695]=false; captureThrower[695]=false; captureLight[695]=true; 
captureX[696]=0.9; captureY[696]=0.0078125; captureExtend[696]=false; captureRetract[696]=false; captureThrower[696]=false; captureLight[696]=false; 
captureX[697]=0.9; captureY[697]=0.0078125; captureExtend[697]=false; captureRetract[697]=false; captureThrower[697]=false; captureLight[697]=false; 
captureX[698]=0.9; captureY[698]=0.0078125; captureExtend[698]=false; captureRetract[698]=false; captureThrower[698]=false; captureLight[698]=false; 
captureX[699]=0.9; captureY[699]=0.0078125; captureExtend[699]=false; captureRetract[699]=false; captureThrower[699]=false; captureLight[699]=true; 

captureX[700]=0.9; captureY[700]=0.0078125; captureExtend[700]=false; captureRetract[700]=false; captureThrower[700]=false; captureLight[700]=true; 
captureX[701]=0.9; captureY[701]=0.0078125; captureExtend[701]=false; captureRetract[701]=false; captureThrower[701]=false; captureLight[701]=false; 
captureX[702]=0.9; captureY[702]=0.0078125; captureExtend[702]=false; captureRetract[702]=false; captureThrower[702]=false; captureLight[702]=false; 
captureX[703]=0.9; captureY[703]=0.0078125; captureExtend[703]=false; captureRetract[703]=false; captureThrower[703]=false; captureLight[703]=false; 
captureX[704]=0.9; captureY[704]=0.0078125; captureExtend[704]=false; captureRetract[704]=false; captureThrower[704]=false; captureLight[704]=true; 
captureX[705]=0.9; captureY[705]=-0.0; captureExtend[705]=false; captureRetract[705]=false; captureThrower[705]=false; captureLight[705]=true; 
captureX[706]=0.9; captureY[706]=-0.0; captureExtend[706]=false; captureRetract[706]=false; captureThrower[706]=false; captureLight[706]=true; 
captureX[707]=0.9; captureY[707]=-0.0; captureExtend[707]=false; captureRetract[707]=false; captureThrower[707]=false; captureLight[707]=false; 
captureX[708]=0.9; captureY[708]=-0.0; captureExtend[708]=false; captureRetract[708]=false; captureThrower[708]=false; captureLight[708]=false; 
captureX[709]=0.9; captureY[709]=-0.0; captureExtend[709]=false; captureRetract[709]=false; captureThrower[709]=false; captureLight[709]=false; 
captureX[710]=0.9; captureY[710]=-0.0; captureExtend[710]=false; captureRetract[710]=false; captureThrower[710]=false; captureLight[710]=true; 

captureX[711]=0.9; captureY[711]=-0.0; captureExtend[711]=false; captureRetract[711]=false; captureThrower[711]=false; captureLight[711]=true; 
captureX[712]=0.9; captureY[712]=-0.0; captureExtend[712]=false; captureRetract[712]=false; captureThrower[712]=false; captureLight[712]=true; 
captureX[713]=0.9; captureY[713]=-0.0; captureExtend[713]=false; captureRetract[713]=false; captureThrower[713]=false; captureLight[713]=false; 
captureX[714]=0.9; captureY[714]=-0.0; captureExtend[714]=false; captureRetract[714]=false; captureThrower[714]=false; captureLight[714]=false; 
captureX[715]=0.9; captureY[715]=-0.0; captureExtend[715]=false; captureRetract[715]=false; captureThrower[715]=false; captureLight[715]=true; 
captureX[716]=0.9; captureY[716]=-0.0; captureExtend[716]=false; captureRetract[716]=false; captureThrower[716]=false; captureLight[716]=true; 
captureX[717]=0.9; captureY[717]=-0.0; captureExtend[717]=false; captureRetract[717]=false; captureThrower[717]=false; captureLight[717]=true; 
captureX[718]=0.9; captureY[718]=-0.0; captureExtend[718]=false; captureRetract[718]=false; captureThrower[718]=false; captureLight[718]=false; 
captureX[719]=0.9; captureY[719]=-0.0; captureExtend[719]=false; captureRetract[719]=false; captureThrower[719]=false; captureLight[719]=false; 
captureX[720]=0.9; captureY[720]=-0.0; captureExtend[720]=false; captureRetract[720]=false; captureThrower[720]=false; captureLight[720]=true; 
captureX[721]=0.9; captureY[721]=-0.0; captureExtend[721]=false; captureRetract[721]=false; captureThrower[721]=false; captureLight[721]=true; 

captureX[722]=0.9; captureY[722]=-0.0; captureExtend[722]=false; captureRetract[722]=false; captureThrower[722]=false; captureLight[722]=false; 
captureX[723]=0.9; captureY[723]=-0.0; captureExtend[723]=false; captureRetract[723]=false; captureThrower[723]=false; captureLight[723]=false; 
captureX[724]=0.9; captureY[724]=-0.0; captureExtend[724]=false; captureRetract[724]=false; captureThrower[724]=false; captureLight[724]=false; 
captureX[725]=0.9; captureY[725]=-0.0; captureExtend[725]=false; captureRetract[725]=false; captureThrower[725]=false; captureLight[725]=true; 
captureX[726]=0.9; captureY[726]=-0.0; captureExtend[726]=false; captureRetract[726]=false; captureThrower[726]=false; captureLight[726]=true; 
captureX[727]=0.9; captureY[727]=-0.0; captureExtend[727]=false; captureRetract[727]=false; captureThrower[727]=false; captureLight[727]=false; 
captureX[728]=0.9; captureY[728]=-0.0; captureExtend[728]=false; captureRetract[728]=false; captureThrower[728]=false; captureLight[728]=false; 
captureX[729]=0.9; captureY[729]=-0.0; captureExtend[729]=false; captureRetract[729]=false; captureThrower[729]=false; captureLight[729]=false; 
captureX[730]=0.9; captureY[730]=-0.0; captureExtend[730]=false; captureRetract[730]=false; captureThrower[730]=false; captureLight[730]=true; 
captureX[731]=0.9; captureY[731]=-0.0; captureExtend[731]=false; captureRetract[731]=false; captureThrower[731]=false; captureLight[731]=true; 
captureX[732]=0.9; captureY[732]=-0.0; captureExtend[732]=false; captureRetract[732]=false; captureThrower[732]=false; captureLight[732]=false; 
captureX[733]=0.9; captureY[733]=-0.0; captureExtend[733]=false; captureRetract[733]=false; captureThrower[733]=false; captureLight[733]=false; 

captureX[734]=0.9; captureY[734]=-0.0; captureExtend[734]=false; captureRetract[734]=false; captureThrower[734]=false; captureLight[734]=true; 
captureX[735]=0.9; captureY[735]=-0.07086614173228346; captureExtend[735]=false; captureRetract[735]=false; captureThrower[735]=false; captureLight[735]=true; 
captureX[736]=0.9; captureY[736]=-0.1732283464566929; captureExtend[736]=false; captureRetract[736]=false; captureThrower[736]=false; captureLight[736]=true; 
captureX[737]=0.9; captureY[737]=-0.4330708661417323; captureExtend[737]=false; captureRetract[737]=false; captureThrower[737]=false; captureLight[737]=true; 
captureX[738]=0.9; captureY[738]=-0.33070866141732286; captureExtend[738]=false; captureRetract[738]=false; captureThrower[738]=false; captureLight[738]=false; 
captureX[739]=0.9; captureY[739]=-0.23622047244094488; captureExtend[739]=false; captureRetract[739]=false; captureThrower[739]=false; captureLight[739]=false; 
captureX[740]=0.9; captureY[740]=-0.23622047244094488; captureExtend[740]=false; captureRetract[740]=false; captureThrower[740]=false; captureLight[740]=true; 
captureX[741]=0.9; captureY[741]=-0.23622047244094488; captureExtend[741]=false; captureRetract[741]=false; captureThrower[741]=false; captureLight[741]=true; 
captureX[742]=0.9; captureY[742]=-0.23622047244094488; captureExtend[742]=false; captureRetract[742]=false; captureThrower[742]=false; captureLight[742]=false; 
captureX[743]=0.9; captureY[743]=-0.23622047244094488; captureExtend[743]=false; captureRetract[743]=false; captureThrower[743]=false; captureLight[743]=false; 

captureX[744]=0.9; captureY[744]=-0.23622047244094488; captureExtend[744]=false; captureRetract[744]=false; captureThrower[744]=false; captureLight[744]=false; 
captureX[745]=0.9; captureY[745]=-0.23622047244094488; captureExtend[745]=false; captureRetract[745]=false; captureThrower[745]=false; captureLight[745]=true; 
captureX[746]=0.9; captureY[746]=-0.23622047244094488; captureExtend[746]=false; captureRetract[746]=false; captureThrower[746]=false; captureLight[746]=true; 
captureX[747]=0.9; captureY[747]=-0.23622047244094488; captureExtend[747]=false; captureRetract[747]=false; captureThrower[747]=false; captureLight[747]=true; 
captureX[748]=0.9; captureY[748]=-0.29133858267716534; captureExtend[748]=false; captureRetract[748]=false; captureThrower[748]=false; captureLight[748]=false; 
captureX[749]=0.9; captureY[749]=-0.29133858267716534; captureExtend[749]=false; captureRetract[749]=false; captureThrower[749]=false; captureLight[749]=true; 
captureX[750]=0.9; captureY[750]=-0.31496062992125984; captureExtend[750]=false; captureRetract[750]=false; captureThrower[750]=false; captureLight[750]=true; 
captureX[751]=0.9; captureY[751]=-0.31496062992125984; captureExtend[751]=false; captureRetract[751]=false; captureThrower[751]=false; captureLight[751]=true; 
captureX[752]=0.9; captureY[752]=-0.31496062992125984; captureExtend[752]=false; captureRetract[752]=false; captureThrower[752]=false; captureLight[752]=false; 
captureX[753]=0.9; captureY[753]=-0.31496062992125984; captureExtend[753]=false; captureRetract[753]=false; captureThrower[753]=false; captureLight[753]=false; 

captureX[754]=0.9; captureY[754]=-0.31496062992125984; captureExtend[754]=false; captureRetract[754]=false; captureThrower[754]=false; captureLight[754]=false; 
captureX[755]=0.9; captureY[755]=-0.31496062992125984; captureExtend[755]=false; captureRetract[755]=false; captureThrower[755]=false; captureLight[755]=true; 
captureX[756]=0.9; captureY[756]=-0.31496062992125984; captureExtend[756]=false; captureRetract[756]=false; captureThrower[756]=false; captureLight[756]=true; 
captureX[757]=0.9; captureY[757]=-0.3543307086614173; captureExtend[757]=false; captureRetract[757]=false; captureThrower[757]=false; captureLight[757]=true; 
captureX[758]=0.9; captureY[758]=-0.3779527559055118; captureExtend[758]=false; captureRetract[758]=false; captureThrower[758]=false; captureLight[758]=false; 
captureX[759]=0.9; captureY[759]=-0.3937007874015748; captureExtend[759]=false; captureRetract[759]=false; captureThrower[759]=false; captureLight[759]=true; 
captureX[760]=0.9; captureY[760]=-0.5196850393700787; captureExtend[760]=false; captureRetract[760]=false; captureThrower[760]=false; captureLight[760]=true; 
captureX[761]=0.9; captureY[761]=-0.5433070866141733; captureExtend[761]=false; captureRetract[761]=false; captureThrower[761]=false; captureLight[761]=true; 
captureX[762]=0.9; captureY[762]=-0.4566929133858268; captureExtend[762]=false; captureRetract[762]=false; captureThrower[762]=false; captureLight[762]=false; 
captureX[763]=0.6803149606299213; captureY[763]=-0.07086614173228346; captureExtend[763]=false; captureRetract[763]=false; captureThrower[763]=false; captureLight[763]=false; 
captureX[764]=-0.6328125; captureY[764]=-0.0; captureExtend[764]=false; captureRetract[764]=false; captureThrower[764]=false; captureLight[764]=true; 

captureX[765]=0.1700787401574803; captureY[765]=-0.07086614173228346; captureExtend[765]=false; captureRetract[765]=false; captureThrower[765]=false; captureLight[765]=true; 
captureX[766]=-0.2390625; captureY[766]=-0.09448818897637795; captureExtend[766]=false; captureRetract[766]=false; captureThrower[766]=false; captureLight[766]=true; 
captureX[767]=0.07086614173228346; captureY[767]=-0.0; captureExtend[767]=false; captureRetract[767]=false; captureThrower[767]=false; captureLight[767]=false; 
captureX[768]=-0.0703125; captureY[768]=-0.0; captureExtend[768]=false; captureRetract[768]=false; captureThrower[768]=false; captureLight[768]=false; 
captureX[769]=0.0; captureY[769]=-0.0; captureExtend[769]=false; captureRetract[769]=false; captureThrower[769]=false; captureLight[769]=false; 
captureX[770]=0.0; captureY[770]=-0.0; captureExtend[770]=false; captureRetract[770]=false; captureThrower[770]=false; captureLight[770]=true; 
captureX[771]=0.0; captureY[771]=-0.0; captureExtend[771]=false; captureRetract[771]=false; captureThrower[771]=false; captureLight[771]=true; 
captureX[772]=0.0; captureY[772]=-0.0; captureExtend[772]=false; captureRetract[772]=false; captureThrower[772]=false; captureLight[772]=false; 
captureX[773]=0.0; captureY[773]=-0.0; captureExtend[773]=false; captureRetract[773]=false; captureThrower[773]=false; captureLight[773]=false; 
captureX[774]=0.0; captureY[774]=-0.0; captureExtend[774]=false; captureRetract[774]=false; captureThrower[774]=true; captureLight[774]=false; 

captureX[775]=0.0; captureY[775]=-0.0; captureExtend[775]=false; captureRetract[775]=false; captureThrower[775]=true; captureLight[775]=true; 
captureX[776]=0.0; captureY[776]=-0.0; captureExtend[776]=false; captureRetract[776]=false; captureThrower[776]=true; captureLight[776]=true; 
captureX[777]=0.0; captureY[777]=-0.0; captureExtend[777]=false; captureRetract[777]=false; captureThrower[777]=true; captureLight[777]=false; 
captureX[778]=0.0; captureY[778]=-0.0; captureExtend[778]=false; captureRetract[778]=false; captureThrower[778]=true; captureLight[778]=false; 
captureX[779]=0.0; captureY[779]=-0.0; captureExtend[779]=false; captureRetract[779]=false; captureThrower[779]=true; captureLight[779]=true; 
captureX[780]=0.0; captureY[780]=-0.0; captureExtend[780]=false; captureRetract[780]=false; captureThrower[780]=true; captureLight[780]=true; 
captureX[781]=0.0; captureY[781]=-0.0; captureExtend[781]=false; captureRetract[781]=false; captureThrower[781]=true; captureLight[781]=true; 
captureX[782]=0.0; captureY[782]=-0.0; captureExtend[782]=false; captureRetract[782]=false; captureThrower[782]=true; captureLight[782]=true; 
captureX[783]=0.0; captureY[783]=-0.0; captureExtend[783]=false; captureRetract[783]=false; captureThrower[783]=true; captureLight[783]=false; 
captureX[784]=0.0; captureY[784]=-0.0; captureExtend[784]=false; captureRetract[784]=false; captureThrower[784]=true; captureLight[784]=false; 
captureX[785]=0.0; captureY[785]=-0.0; captureExtend[785]=false; captureRetract[785]=false; captureThrower[785]=true; captureLight[785]=true; 
captureX[786]=0.0; captureY[786]=-0.0; captureExtend[786]=false; captureRetract[786]=false; captureThrower[786]=true; captureLight[786]=true; 

captureX[787]=0.0; captureY[787]=-0.0; captureExtend[787]=false; captureRetract[787]=false; captureThrower[787]=true; captureLight[787]=true; 
captureX[788]=0.0; captureY[788]=-0.0; captureExtend[788]=false; captureRetract[788]=false; captureThrower[788]=true; captureLight[788]=true; 
captureX[789]=0.0; captureY[789]=-0.0; captureExtend[789]=false; captureRetract[789]=false; captureThrower[789]=true; captureLight[789]=true; 
captureX[790]=0.0; captureY[790]=-0.0; captureExtend[790]=false; captureRetract[790]=false; captureThrower[790]=true; captureLight[790]=true; 
captureX[791]=0.0; captureY[791]=-0.0; captureExtend[791]=false; captureRetract[791]=false; captureThrower[791]=false; captureLight[791]=true; 
captureX[792]=0.0; captureY[792]=-0.0; captureExtend[792]=false; captureRetract[792]=false; captureThrower[792]=false; captureLight[792]=false; 
captureX[793]=0.0; captureY[793]=-0.0; captureExtend[793]=false; captureRetract[793]=false; captureThrower[793]=false; captureLight[793]=false; 
captureX[794]=0.0; captureY[794]=-0.0; captureExtend[794]=false; captureRetract[794]=false; captureThrower[794]=false; captureLight[794]=true; 
captureX[795]=-0.05625; captureY[795]=0.0078125; captureExtend[795]=false; captureRetract[795]=false; captureThrower[795]=false; captureLight[795]=true; 
captureX[796]=-0.10546875; captureY[796]=0.0078125; captureExtend[796]=false; captureRetract[796]=false; captureThrower[796]=false; captureLight[796]=true; 
captureX[797]=-0.05625; captureY[797]=0.0078125; captureExtend[797]=true; captureRetract[797]=false; captureThrower[797]=false; captureLight[797]=true; 

captureX[798]=-0.00703125; captureY[798]=-0.07086614173228346; captureExtend[798]=true; captureRetract[798]=false; captureThrower[798]=false; captureLight[798]=true; 
captureX[799]=-0.02109375; captureY[799]=-0.1968503937007874; captureExtend[799]=true; captureRetract[799]=false; captureThrower[799]=false; captureLight[799]=true; 
captureX[800]=0.028346456692913385; captureY[800]=-0.05511811023622047; captureExtend[800]=false; captureRetract[800]=false; captureThrower[800]=false; captureLight[800]=true; 
captureX[801]=-0.084375; captureY[801]=-0.09448818897637795; captureExtend[801]=false; captureRetract[801]=false; captureThrower[801]=false; captureLight[801]=false; 
captureX[802]=-0.00703125; captureY[802]=-0.031496062992125984; captureExtend[802]=false; captureRetract[802]=false; captureThrower[802]=false; captureLight[802]=false; 
captureX[803]=0.0; captureY[803]=-0.0; captureExtend[803]=false; captureRetract[803]=false; captureThrower[803]=false; captureLight[803]=false; 
captureX[804]=0.0; captureY[804]=-0.0; captureExtend[804]=false; captureRetract[804]=false; captureThrower[804]=false; captureLight[804]=true; 
captureX[805]=0.0; captureY[805]=-0.0; captureExtend[805]=false; captureRetract[805]=false; captureThrower[805]=false; captureLight[805]=true; 
captureX[806]=0.0; captureY[806]=-0.0; captureExtend[806]=false; captureRetract[806]=false; captureThrower[806]=false; captureLight[806]=true; 
captureX[807]=0.0; captureY[807]=-0.0; captureExtend[807]=false; captureRetract[807]=false; captureThrower[807]=false; captureLight[807]=true; 
captureX[808]=0.0; captureY[808]=-0.0; captureExtend[808]=false; captureRetract[808]=false; captureThrower[808]=false; captureLight[808]=true; 

captureX[809]=0.0; captureY[809]=-0.0; captureExtend[809]=false; captureRetract[809]=false; captureThrower[809]=false; captureLight[809]=true; 
captureX[810]=0.0; captureY[810]=-0.0; captureExtend[810]=false; captureRetract[810]=false; captureThrower[810]=false; captureLight[810]=true; 
captureX[811]=0.0; captureY[811]=-0.0; captureExtend[811]=false; captureRetract[811]=false; captureThrower[811]=false; captureLight[811]=true; 
captureX[812]=0.0; captureY[812]=-0.0; captureExtend[812]=false; captureRetract[812]=false; captureThrower[812]=false; captureLight[812]=false; 
captureX[813]=0.0; captureY[813]=-0.0; captureExtend[813]=false; captureRetract[813]=false; captureThrower[813]=false; captureLight[813]=false; 
captureX[814]=0.0; captureY[814]=-0.0; captureExtend[814]=false; captureRetract[814]=false; captureThrower[814]=false; captureLight[814]=true; 
captureX[815]=0.0; captureY[815]=-0.0; captureExtend[815]=false; captureRetract[815]=false; captureThrower[815]=false; captureLight[815]=true; 
captureX[816]=0.0; captureY[816]=-0.0; captureExtend[816]=false; captureRetract[816]=false; captureThrower[816]=false; captureLight[816]=true; 
captureX[817]=0.0; captureY[817]=-0.0; captureExtend[817]=false; captureRetract[817]=false; captureThrower[817]=false; captureLight[817]=true; 
captureX[818]=0.0; captureY[818]=-0.0; captureExtend[818]=false; captureRetract[818]=false; captureThrower[818]=false; captureLight[818]=true; 
captureX[819]=0.0; captureY[819]=-0.0; captureExtend[819]=false; captureRetract[819]=false; captureThrower[819]=false; captureLight[819]=true; 

captureX[820]=0.0; captureY[820]=-0.0; captureExtend[820]=false; captureRetract[820]=false; captureThrower[820]=false; captureLight[820]=true; 
captureX[821]=0.0; captureY[821]=-0.0; captureExtend[821]=false; captureRetract[821]=false; captureThrower[821]=false; captureLight[821]=true; 
captureX[822]=0.0; captureY[822]=-0.0; captureExtend[822]=false; captureRetract[822]=false; captureThrower[822]=false; captureLight[822]=true; 
captureX[823]=0.0; captureY[823]=-0.0; captureExtend[823]=false; captureRetract[823]=false; captureThrower[823]=false; captureLight[823]=false; 
captureX[824]=0.0; captureY[824]=-0.0; captureExtend[824]=false; captureRetract[824]=false; captureThrower[824]=false; captureLight[824]=false; 
captureX[825]=0.0; captureY[825]=-0.0; captureExtend[825]=false; captureRetract[825]=false; captureThrower[825]=false; captureLight[825]=false; 
captureX[826]=0.0; captureY[826]=-0.0; captureExtend[826]=false; captureRetract[826]=false; captureThrower[826]=false; captureLight[826]=false; 
captureX[827]=0.0; captureY[827]=-0.0; captureExtend[827]=false; captureRetract[827]=false; captureThrower[827]=false; captureLight[827]=false; 
captureX[828]=0.0; captureY[828]=-0.0; captureExtend[828]=false; captureRetract[828]=false; captureThrower[828]=false; captureLight[828]=false; 
captureX[829]=0.0; captureY[829]=-0.0; captureExtend[829]=false; captureRetract[829]=false; captureThrower[829]=false; captureLight[829]=false; 
captureX[830]=0.0; captureY[830]=-0.0; captureExtend[830]=false; captureRetract[830]=false; captureThrower[830]=false; captureLight[830]=false; 

captureX[831]=0.0; captureY[831]=-0.0; captureExtend[831]=false; captureRetract[831]=false; captureThrower[831]=false; captureLight[831]=false; 
captureX[832]=0.0; captureY[832]=-0.0; captureExtend[832]=false; captureRetract[832]=false; captureThrower[832]=false; captureLight[832]=false; 
captureX[833]=0.0; captureY[833]=-0.0; captureExtend[833]=false; captureRetract[833]=false; captureThrower[833]=false; captureLight[833]=false; 
captureX[834]=0.0; captureY[834]=-0.0; captureExtend[834]=false; captureRetract[834]=false; captureThrower[834]=false; captureLight[834]=false; 
captureX[835]=0.0; captureY[835]=-0.0; captureExtend[835]=false; captureRetract[835]=false; captureThrower[835]=false; captureLight[835]=false; 
captureX[836]=0.0; captureY[836]=-0.0; captureExtend[836]=false; captureRetract[836]=false; captureThrower[836]=false; captureLight[836]=false; 
captureX[837]=0.0; captureY[837]=-0.0; captureExtend[837]=false; captureRetract[837]=false; captureThrower[837]=false; captureLight[837]=false; 
captureX[838]=0.0; captureY[838]=-0.0; captureExtend[838]=false; captureRetract[838]=false; captureThrower[838]=false; captureLight[838]=false; 
captureX[839]=0.0; captureY[839]=-0.0; captureExtend[839]=false; captureRetract[839]=false; captureThrower[839]=false; captureLight[839]=false; 
captureX[840]=0.0; captureY[840]=-0.0; captureExtend[840]=false; captureRetract[840]=false; captureThrower[840]=false; captureLight[840]=false; 
captureX[841]=0.0; captureY[841]=-0.0; captureExtend[841]=false; captureRetract[841]=false; captureThrower[841]=false; captureLight[841]=false; 
captureX[842]=0.0; captureY[842]=-0.0; captureExtend[842]=false; captureRetract[842]=false; captureThrower[842]=false; captureLight[842]=false; 

captureX[843]=0.0; captureY[843]=-0.0; captureExtend[843]=false; captureRetract[843]=false; captureThrower[843]=false; captureLight[843]=false; 
captureX[844]=0.0; captureY[844]=-0.0; captureExtend[844]=false; captureRetract[844]=false; captureThrower[844]=false; captureLight[844]=false; 
captureX[845]=0.0; captureY[845]=-0.0; captureExtend[845]=false; captureRetract[845]=false; captureThrower[845]=false; captureLight[845]=false; 
captureX[846]=0.0; captureY[846]=-0.0; captureExtend[846]=false; captureRetract[846]=false; captureThrower[846]=false; captureLight[846]=false; 
captureX[847]=0.0; captureY[847]=-0.0; captureExtend[847]=false; captureRetract[847]=false; captureThrower[847]=false; captureLight[847]=false; 
captureX[848]=0.0; captureY[848]=-0.0; captureExtend[848]=false; captureRetract[848]=false; captureThrower[848]=false; captureLight[848]=false; 
captureX[849]=0.0; captureY[849]=0.0; captureExtend[849]=false; captureRetract[849]=false; captureThrower[849]=false; captureLight[849]=false;
    }
}