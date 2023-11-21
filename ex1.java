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
public class ex1 {
    int a=10;
    int b=20;
    
    public void show()
    {
        System.out.println("print a & b="+ a +""+b);
    }
}
class ex1Test
{
    public static void main(String args[])
    {
        ex1 e=new ex1();
        e.show();
    }
}