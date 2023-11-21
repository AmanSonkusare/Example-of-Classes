/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/**
 *
 * @author HP_Aman
 */class Salary
 {
     int basic;
     int dareness_allowance;
     int house_rent;
     public void setAmount(int b)
     {
         basic=b;
         
     }  
     public void getSalary()
     {
        double dearness_allowance=basic*0.4;
        double rent_allowance=basic*0.2;
         
         System.out.println(basic+dearness_allowance+rent_allowance );
     }
 }
public class GrossSalaryTest {
    public static void main(String args[])
    {
        
        Salary salary=new Salary();
        salary.setAmount(50000);
        salary.getSalary();
        
    }
    
}
