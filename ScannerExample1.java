/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.Scanner;

/**
 *
 * @author HP_Aman
 */
class A
{
    int y;
   // char Y;
    A(int a)
    {
    this.y=a;
    }
    public void getDim()
    {
       if (y==5)
            System.out.println("y is lowercase ");
       else System.out.println("y is not present");
    }
}
public class ScannerExample1 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int q=s.nextInt();
                
        A a=new A(q);
        a.getDim();
    }
}
