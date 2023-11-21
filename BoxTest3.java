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
class Box3
{
    double width,depth,height;
    public void setDim(double width,double height,double depth)
    {
       /* width=width;
        height=height;
        depth=depth;*/
      this. width=width;
       this. height=height;
        this.depth=depth;
        
 }
    public double getVolume()
    {
        double v=width*height*depth;
        return v;
    }
}
public class BoxTest3 {
    public static void main(String args[])
    {
        Box3 box =new Box3();
        box.setDim(7.5,5.0,6.5);
                double v=box.getVolume();
                  System.out.println("voiume of box " + v);
    }
    
}
 