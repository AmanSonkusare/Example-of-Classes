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
public class Box {
    double width;
    double height;
    double depth;
    
    public static void main(String args[])
    {
        Box box = new Box();
        box.width=10;
        box.height=15;
        box.depth=7.5;
        double v=box.width*box.height*box.depth;
        System.out.println("volume of box=" + v);
    }
    
}