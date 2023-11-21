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
//import java.util.Scanner
class Area1
{
    
    float radious;
    double area2;
    int perimeter;
    double circumference;
    double sc;
   /* public void setDim(float r)
    {
       radious=r;
}*/
    public void getArea()
    {
       
        area2=3.14*(radious*radious);
        circumference=2*3.14*radious;
        
         System.out.println(area2);
           System.out.println(circumference);
    }
}
import java.util.Scanner;
public class AreaTest1 { 
    public static void main(String args[])
    {
        Area area=new Area();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the radious");
      radious=sc.nextfloat();
      area.getArea();
      
       //System.out.println(area2,circumferance);
    
    } 
}

    

