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
class CostPrice
{
    float sp,tp,cp;
    public void setValue(float a,float b)
    {
        sp=a;
        tp=b;
    }
    public void getCost()
    {
        cp=sp-tp;
        System.out.println("Cost price is=" + cp);
    }
            
}
public class CostPriceTest {
    public static void main(String args[])
    {
        CostPrice cost=new CostPrice();
        cost.setValue(15, 10);
        cost.getCost();
    }
    
}
