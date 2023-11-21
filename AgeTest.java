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
class Age
{
    int ram,shyam,ajay;
 public void setAge(int r,int s,int a)
 {
     ram=r;
     shyam=s;
     ajay=a;
 }
    public void getYoungest()
    {
         if(ram<shyam && ram<ajay)
             System.out.println("ram is youngest");
         else if(shyam<ram && shyam<ajay)
             System.out.println("shyam is youngest" );
         else System.out.println("ajay is youngest");
    }
}       
              
public class AgeTest {
    public static void main(String args[])
    {
        Age a=new Age();
        a.setAge(10,20,30);
        a.getYoungest(); 
    }
    
}
