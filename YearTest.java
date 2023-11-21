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
class Year
{
    int year,day;
    public void setYear(int a)
    {
        year=a;
    }
    public void getDay()
    {
        day=(365/year)+((year/4)-(year/100)+(year/400));
        if(day%7==0)
            System.out.println("the day on 1 jan"+year+"is sunday");
        else  if(day%7==1)
            System.out.println("the day on 1 jan"+year+"is monday");
        else if(day%7==2)
            System.out.println("the day on 1 jan"+year+"is tuesday");
         else if(day%7==3)
            System.out.println("the day on 1 jan"+year+"is wednesday");
         else if(day%7==4)
            System.out.println("the day on 1 jan"+year+"is thrusday");
         else if(day%7==5)
            System.out.println("the day on 1 jan"+year+"is friday");
         else  
            System.out.println("the day on 1 jan"+year+"is saterday");
            
    }
}
public class YearTest {
    public static void main(String args[])
    {
        Year y=new Year();
        y.setYear(2000);
        y.getDay();
    }
}
