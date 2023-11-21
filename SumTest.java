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
class Sum
{
    int num;
    int n1,n2,n3,n4,n5,sum;
    public void setNum(int a)
    {
        num=a;
    }
    public void getSum()
    {
        n1=num%10;
        num=num/10;
        
        n2=num%10;
        num=num/10;
        
        n3=num%10;
        num=num/10;
        
        n4=num%10;
        num=num/10;
        
        n5=num%10;
        num=num/10;
        
        sum=n1+n2+n3+n4+n5;
        System.out.println("sum of five digit=" + sum);
        
    }
            
}
public class SumTest {
    public static void main(String args[])
    {
       Sum digit=new  Sum();
       digit.setNum(12345);
       digit.getSum();
    }
    
}
