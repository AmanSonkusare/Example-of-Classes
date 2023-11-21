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
class ProfitAndLoss
{
   float cp,sp,profit;
   
   //String  Profit,Loss;
   // boolean profit,loss,cp,sp;
    public void setCost(float s,float c)
           // public void setCost(boolean c,boolean s)
    {
         sp=s;
         cp=c;
       }
    public void getProfit()
    {
      if (sp > cp)
      {  profit=sp-cp;
      System.out.println("seller has profit=" + profit);
          System.out.println("seller has profit");
      }  
          else System.out.println("seller has loss"); 
    }
}

public class ProfitAndLossTest {
    public static void main(String args[])
    {
      ProfitAndLoss P=new ProfitAndLoss();
      P.setCost(20,10);
      P.getProfit();
    }
    
}