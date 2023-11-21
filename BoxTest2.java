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
class Box2
{
    double width;
    double height;
    double depth;
        public void setDim(double w,double h,double d)
        {
                width=w;
                height=h;
                depth=d;
    }
public void getVolume()
{
double v=width*height*depth;
System.out.println("volume of box="+v);
}
}
         
public class BoxTest2 {
    public static void main(String args[])
    {
        Box2 box = new Box2();
        box.setDim(7.5,8.0,12.0);
        box.getVolume();
    }
} 
