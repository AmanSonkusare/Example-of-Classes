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
class Literacy
{
    float total_lite_men,total_pop,pop;
    double  total_lite_women,total_men,total_lite,total_women,tot_ill_men,tot_ill_women; 

    public void setPop(float a)
    {
        pop=a;
    } 
    public void getilliteracy()
    {
         total_men=0.52*pop;
        total_lite=0.40*pop;
        total_women=pop-total_men;
        total_lite_men=35*pop;
         total_lite_women=total_lite - total_lite_men;
         tot_ill_men=total_men - total_lite_men;
         tot_ill_women=total_women-total_lite_women;
         System.out.println("total men=" + tot_ill_men);
          System.out.println("total women=" + tot_ill_women);
    }
           
}
public class LiteracyTest { 
    public static void main(String args[])
    {
        Literacy lite=new  Literacy();
        lite.setPop(80000);
        lite.getilliteracy();
    }    
}
