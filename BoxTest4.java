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
public class BoxTest4 {
    double width;
    double height;
    double depth;
    public void setDim( double width,double height,double depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public static void main(String args[])
    {
        BoxTest4 b=new BoxTest4();
        b.setDim(7.0, 5.0, 6.0);
        System.out.println("Object referance value=" + b);// memory address 
        BoxTest4 b1=null;
        b1=b;
        System.out.println("object referance value=" + b1);
        
    }
            
    
}
