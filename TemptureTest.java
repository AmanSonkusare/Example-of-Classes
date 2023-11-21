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
class Tempture
{
    float fahrenheit_degree;
    double centigrade_degree;
    public void setDegree(float a)
    {
        fahrenheit_degree=a;
    }
    public void getTempture()
    {
        centigrade_degree=(fahrenheit_degree-32)/1.8;
        System.out.println(centigrade_degree);
    }
}
public class TemptureTest {
    public static void main(String args[])
    {
        Tempture city=new Tempture();
        city.setDegree(40);
        city.getTempture();
    }
    
}
