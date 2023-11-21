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
class Area
{
    int length;
    int breath;
    float radious;
    int area1;
    double area2;
    int perimeter;
    double circumference;
    
    public void setDim(int l,int b,float r)
    {
        length=l;
        breath=b;
        radious=r;
    }
    public void getArea()
    {
        area1=length*breath;
        perimeter=2*(length+breath);
        area2=3.14*(radious*radious);
        circumference=2*3.14*radious;
        
        System.out.println(area1);
         System.out.println(perimeter);
          System.out.println(area2);
           System.out.println(circumference);
    }
}
public class AreaTest {
    public static void main(String args[])
    {
        Area area=new Area();
        area.setDim(5, 5, 5);
        area.getArea();
    }
    
}
