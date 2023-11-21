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
class Triangle
{
    int angle1,angle2,angle3,sum_of_angle;
    public void setDim(int a,int b,int c)
    {
        angle1=a;
        angle2=b;
        angle3=c;
    }
    public void getTriangle()
    {
     sum_of_angle=angle1+angle2+angle3;
     if(sum_of_angle==180)
         System.out.println("triangle is valid");
     else System.out.println("triangle is not valid");
    }
}
public class TriangleTest {
    public static void main(String args[])
    {
        Triangle t=new Triangle();
        t.setDim(60, 60, 60);
        t.getTriangle();
    }
    
}
