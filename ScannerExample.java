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
class X
{
    int a1;
    int a2;
    public void setDim(int a)
    {
        a1=a;
    }
    public void getDim()
    {
     if   (a1==1)
            System.out.println("number are same");
     else System.out.println("num are not same");
    }
}
public class ScannerExample {
    public static void main(String args[])
    {
       X x=new X();
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1");
        int a1=sc.nextInt();
     x.setDim(a1);
     x.getDim();
        
    }
}
