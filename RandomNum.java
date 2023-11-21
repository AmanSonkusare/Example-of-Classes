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
import java.util.Random;
public class RandomNum {
    public static void main(String args[])
    {
       Random r=new Random();
        System.out.println("=" + r.nextInt(10));
        System.out.println("=" + r.nextDouble());
    }
}
