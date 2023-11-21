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
class ReverseNum
{
    int num,number;
            int r1,r2,r3,r4,r5;
            int reverse;
    public void SetNum(int a)
    {
        num=a;
        number=num;
    }
    public void getReverse()
    {
        r1=num%10;
        num=num/10;
        
        r2=num%10;
        num=num/10;
        
        r3=num%10;
        num=num/10;
        
        r4=num%10;
        num=num%10;
        
        r5=num%10;
        num=num/10;
        
      reverse=r1*10000+r2*1000+r3*100+r4*10+r5*1;
      //System.out.println(reverse +" "+number);
         if (reverse==number)
         System.out.println("Reverse num are equal");
        else System.out.println("Reverse num are not equal");
     }
}
public class ReverseNumTest {
    public static void main(String args[])
    {
       ReverseNum r=new ReverseNum();
       r.SetNum(11111);
       r.getReverse();
    }
    
}
 