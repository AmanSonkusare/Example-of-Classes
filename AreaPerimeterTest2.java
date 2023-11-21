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
class AreaPerimeter
{
    double radious;
    public void setDim(double radious)
    {
        this.radious=radious;
    }
    public double getArea()
    {
        double a=3.14*radious*radious;
       // double p=2*3.14*radious;
        return a; 
    }
    public double getPerimeter()
    {
         double p=2*3.14*radious;
         return p;
    }
}
public class AreaPerimeterTest2 {
    public static void main (String args[])
    {
        AreaPerimeter v=new AreaPerimeter();
        v.setDim(5);
        double a=v.getArea();
        System.out.println("Arae of circle =" + a);
        double p=v.getPerimeter();
        System.out.println("perimeter of circle" + p);
    }
    
}
