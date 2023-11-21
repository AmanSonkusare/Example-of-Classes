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
class Box1{
    double width;
    double height;
    double depth;
}
public class BoxTest1 {
    public static void main(String args[])
    {
        Box1 box=new Box1();
        box.width=10;
        box.height=15;
        box.depth=7.5;
        
        double v=box.width*box.height*box.depth;
        
        System.out.println("Volume of box=w" + v);
        
    }
    
}
