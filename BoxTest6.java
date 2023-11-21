

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
class Box6
{
    double width;
    double height;
    double depth;
    Box6()//default contructor
    {
        
    }
    Box6(double l)//one argument contructure
    {
        width=height=depth=l;
    }
    Box6(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Box6(Box6 ob)// object as a argument constructure
    {
            width=ob.width;
            height=ob.height;
            depth=ob.depth;
    }
    public double getVolume()
    {
        double v=width*height*depth;
        return v;
    }
    }
        
public class BoxTest6 {
    public static void main(String args[]){
            Box6 box1=new Box6();
     Box6 box2=new Box6(7.5);
      Box6 box3=new Box6(10,7.5,5.0);
      Box6 box4=new Box6(box3);// object constructor 
      System.out.println("volume box1 " + box1.getVolume());
       System.out.println("volume box2 " + box2.getVolume());
       System.out.println("volume box3 " + box3.getVolume());
        System.out.println("volume box4 " + box4.getVolume());
}
}
