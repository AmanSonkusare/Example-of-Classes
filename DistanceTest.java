/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/**
 *
 * @author HP_Aman
 */
class Distance
{
    float km;
    float meter;
    float feet;
    float inches;
    float centimeters;
    public void setDim(float k)
    {
        km=k;
        
        }
    public void getDistance()
    {
        float m=km*1000;
        float cm=m*100;
        double inch=cm/2.5;
        double ft=inch/12;
     
        System.out.println(m);
        System.out.println(cm);
        System.out.println(inch);
        System.out.println(ft);
    }
}
public class DistanceTest {
    public static void main(String args[])
            {
                Distance ds=new Distance ();
                ds.setDim(10);
                ds.getDistance();
        
    }
    
}
