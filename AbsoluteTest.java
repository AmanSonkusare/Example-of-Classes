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
class Absolute {

    int num, num1;

    public void setNum(int a) {
        num = a;
    }

    public void getAbsolute() {
        if (num < 0) {
            {
                num1 = num * (-1);
                System.out.println("the absolute value of" + num + "" + num1);
            }
          
        }

    }
}

public class AbsoluteTest{
    public static void main(String[] args) {
        Absolute a=new Absolute();
        a.setNum(10);
        a.getAbsolute();
    }
            
}
