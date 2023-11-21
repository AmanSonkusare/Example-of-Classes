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
class Add
{
    int num,first_digit,last_digit,sum,sum1;
    public void setNum(int a)
    {
        num=a;
    }
    public void getAdd()
    {
        last_digit=num%10;
        sum=last_digit;
        
        first_digit=(num/1000)%10;
        sum1=sum+first_digit;
        System.out.println("sum of 1st and last num=" + sum1);
    }
}
public class FirstAndLastTest {
    public static void main(String args[])
    {
     Add a=new Add();
     a.setNum(1234);
     a.getAdd();
     
    }
}
