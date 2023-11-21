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
class Digit
{
    int num;
    int a,b,c,d,e,reverse;
    public void setDigit(int a)
    {
        num=a;
    }
    public void getReverse()
    {
        a=num%10;
         num=num/10;
         
          b=num%10;
         num=num/10;
         
          c=num%10;
         num=num/10;
         
          d=num%10;
         num=num/10;
         
          e=num%10;
         num=num/10;
         
         reverse=a*10000+b*1000+c*100+d*10+e*1;
         System.out.println("reverse num are=" + reverse);
         
    }
            
}
public class ReverseTest {
    public static void main(String args[])
    {
        Digit num=new Digit();
        num.setDigit(12345);
        num.getReverse();
    }
    
}
