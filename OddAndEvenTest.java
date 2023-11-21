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
class OddAndEven
{
    int odd,even,num;
    public void setNum(int a)
    {
        num=a;
    }
    public void getEven()
    {
        if(num%2==0)
        System.out.println("Number is even");
        else System.out.println("Number is odd");
    }
}
public class OddAndEvenTest {
    public static void main(String args[]){
        OddAndEven o=new OddAndEven();
        o.setNum(3);
        o.getEven();
    }
    
}
