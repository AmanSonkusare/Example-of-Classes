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
class LeapYear
{
    int year;
    public void setYear(int a)
    {
            year=a;
}
    public void getLeapYear()
    {
        if(year%4==0)
            System.out.println("year is leap");
        else System.out.println("year is not leap");
    }
}
public class LeapYearTest {
    public static void main(String args[])
    {
        LeapYear l=new LeapYear();
        l.setYear(2);
        l.getLeapYear();
    }
    
}
