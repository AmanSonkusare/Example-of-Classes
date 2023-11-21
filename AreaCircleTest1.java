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
class Circle
{
    double radious;
    Circle()
                {
                    
                }
    Circle(double r)
    {
        radious=r;
    }
   /* Circle( Circle ob)
    {
        radious=ob.radious;
    }*/
    public double getArea()
    {
        double a=2*radious*radious;
        return a;
    }
    public double getPerimeter()
    {
        double p=2*3.14*radious;
        return p;
    }
}
public class AreaCircleTest1 {
    public static void main(String args[])
    {
        //Circle c1=new Circle();
        
        Circle c2=new Circle(10);
        
        System.out.println("Area" + c2.getArea());
           System.out.println("Perimeter" + c2.getPerimeter());
    }
}
