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
class Number
{
    int first;
    int second;
    int third;
    public void setNum(int a,int b,int c)
    {
        first=a;
        second=b;
        third=c;
    }
     public void getInterchange()
     {
         third=first;
         first=second;
         second=third;
         System.out.println(first);
         System.out.println(second);
     }
}
public class InterchangeTest {
    public static void main(String args[])
    {
      Number num=new Number();
      num.setNum(10,20,30 );
      num.getInterchange();
    }
}
