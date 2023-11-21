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
class Student
{
    int mark1;
    int mark2;
    int mark3;
    int mark4;
    int mark5;
    float percentage;
    public void setMarks(int a,int b,int c,int d,int e)
    {
        mark1=a;
        mark2=b;
        mark3=c;
        mark4=d;
        mark5=e;
    }
        public void getPercentage()
        {
            percentage=(mark1+mark2+mark3+mark3+mark3)*100/500;
            System.out.println(percentage);
        }
}
public class MarksTest {
    public static void main(String args[])
    {
        Student student=new Student();
        student.setMarks(90, 90, 90, 90, 90);
        student.getPercentage();
    }
    
}
