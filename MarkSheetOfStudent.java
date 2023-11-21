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
class StudentResult
        {
    int m1,m2,m3,m4,m5,total;
    int rollno;
    String name,coll_name;
    double percentage;
    String grade,welcome,to,RTMNU,Student,Details;
    
    public void setStudentDetails( int a,int b, int c,int d,int e,int r,String n,
            String cn)
    {
        m1=a;
        m2=b;
        m3=c;
        m4=d;
        m5=e;
        rollno=r;
        name=n;
        coll_name=cn;     
    }  
    public void getResult()
    {
        if(m1<0||m1>100||m2<0||m2>100||m3<0||m3>100||m4<0||m4>100||m5<0||m5>100)
        System.out.println("please check marks invalid entry");
        
        //else if(m1>40 && m2>40 && m3>40 && m4>40 && m5>40)
         total=m1+m2+m3+m4+m5;
         percentage=total/5;
    {            
     if(percentage>=75)
        grade="Distinction";
    else if(percentage>=60&&percentage<75)
            grade="a";
    else if(percentage>=50&&percentage<60)
                grade="b";
    else grade="c";
     {
     System.out.println("------------------------------------------------------------------");
     System.out.println("                        Welcome to RTMNU                          ");
     System.out.println("------------------------------------------------------------------");
     System.out.println("                         Student details                          ");
     System.out.println("Student nae :"+name+"\t\t\t\tRollnum:"+rollno);
     System.out.println("Collage Name;"+coll_name);
     System.out.println("------------------------------------------------------------------");
     System.out.println("\tStudent\t\t Marked obtain \t\t\tOutoff");
     System.out.println("\t  m1\t\t\t"   +m1+     "\t\t\t 100");
     System.out.println("\t  m2\t\t\t"   +m2+     "\t\t\t 100");
     System.out.println("\t  m3\t\t\t"   +m3+     "\t\t\t 100");
     System.out.println("\t  m4\t\t\t"   +m4+     "\t\t\t 100");
     System.out.println("\t  m5\t\t\t"   +m5+     "\t\t\t 100");
     System.out.println("------------------------------------------------------------------");
     System.out.println("\t Total: "+total+"\t\t\t\tPercentage "+percentage);
    //System.out.println("\tResult = Pass"+"\t\t\t\tgrade="+grade);
    if (m1<40 && m2<40 && m4<40 && m4<40 && m5<40)
     System.out.println("\tResult = fail");
     else System.out.println("\tResult = Pass"+"\t\t\t\tgrade="+grade);
     System.out.println("-------------------------------------------------------------------");
     System.out.println("                       !!All The Best!!                            ");
     }
    }
    }
}
public class MarkSheetOfStudent {
    public static void main(String args[])
    {
        StudentResult s=new StudentResult();
        s.setStudentDetails(75,65,65,55,45,101,"aman","xyz");
        s.getResult();
        
    }
    
}

