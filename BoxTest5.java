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
class Box5
{
    double width;
    double height;
    double depth;
    Box5(double width ,double height ,double depth)// constractor
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public double getVolume()
    {
        double v=width*height*depth;
        return v;
    }
}
public class BoxTest5 {
    public static void main (String args[])
    {
        Box5 box=new Box5(10,7.5,6.9);
        double v=box.getVolume();
        System.out.println("vouiume of box" + v);
        // System.out.println( "volume:" +box.getVolume());//this applicable only value is return
        
                
    }
    
}
