/*
 Define a class to represent a bank accout, Include the following members:
Data members
1. Name of the depositor
2. Account number
3. Type of account
4. Balance amount in the account
member  functions
1. To assign initial values
2. to deposit an amount
3. To withdraw an amount after checking the balance
4. To display name and balance
 */
package classesdemos;

import java.util.Scanner;

class Bank
{
    String aname;
    long ano;
    String atype;
    double balance;
    public void setAccountDetails(String aname,long ano,String atype,double balance)
    {
        this.aname = aname;
        this.ano = ano;
        this.atype = atype;
        this.balance = balance;
    }

    void withdraw(double amount) {
       if(balance - amount <0)
       {
           System.out.println("Dear Customer Please Check balance ...Insufficient Fund");
       }
       else
       {
           balance = balance - amount;
           System.out.println("Balance after Withdrawl is "+balance);
       }
    }

    void deposite(double amount) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        balance = balance + amount;
        System.out.println("Dear Customer Your Account Balance after deposite is "+balance);
    }

    void checkBalance() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Dear Customer Your Account Ballance is "+balance);
    }

    void accountDetail() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Customer Name :"+aname);
        System.out.println("Customer Account Number :"+ano);
        System.out.println("Customer Account Type :"+atype);
        System.out.println("Customer Account balance :"+balance);
    }
    
    
}
public class BankTest {
    public static void main(String[] args) {
        Bank ob1 = new Bank();
        Bank ob2 = new Bank();
        Scanner scanner = new Scanner(System.in);
        ob1.setAccountDetails("Rahul", 2021001, "saving", 2000);
        ob2.setAccountDetails("Rohan", 2021002, "current", 5000);
        System.out.println("--------------------- Welcome to YES Bank---------------------------------");
        while(true)
        {

            System.out.println("Dear Customer Please Enter Account Number!!!");
            long ano = scanner.nextLong();
            if(ano==ob1.ano)
            {
                while(true)
                {
                    System.out.println("Please Enter Account Type ");
                    String atype = scanner.next();
                    if(atype.equalsIgnoreCase("saving"))
                    {
                        System.out.println("Enter 1: Deposite \n Enter 2: Withdrawl \n Enter 3: CheckBalance \nEnter 4:AccountDetails");
                        System.out.println("Please Enter Your Choice !!");
                        int choice = scanner.nextInt();
                        if(choice==1)
                        {
                               System.out.println("Please Enter Your Amount");
                               double amount = scanner.nextDouble();
                               ob1.deposite(amount);
                        }
                        else if(choice==2)
                        {
                            System.out.println("Please Enter Your Amount");
                               double amount = scanner.nextDouble();
                               ob1.withdraw(amount);
                        }else if(choice==3)
                        {
                                
                               ob1.checkBalance();
                        }
                        else
                        {
                            ob1.accountDetail();
                        }
                }
                else
                {
                    System.out.println("Please Check Your Account Type and Try Again");
                }
                }
            }
            else
                if(ano==ob2.ano)
                {
                    while(true)
                {
                    System.out.println("Please Enter Account Type ");
                    String atype = scanner.next();
                    if(atype.equalsIgnoreCase("saving"))
                    {
                        System.out.println("Enter 1: Deposite \n Enter 2: Withdrawl \n Enter 3: CheckBalance \nEnter 4:AccountDetails");
                        System.out.println("Please Enter Your Choice !!");
                        int choice = scanner.nextInt();
                        if(choice==1)
                        {
                               System.out.println("Please Enter Your Amount");
                               double amount = scanner.nextDouble();
                               ob2.deposite(amount);
                        }
                        else if(choice==2)
                        {
                            System.out.println("Please Enter Your Amount");
                               double amount = scanner.nextDouble();
                               ob2.withdraw(amount);
                        }else if(choice==3)
                        {
                                
                               ob2.checkBalance();
                        }
                        else
                        {
                            ob2.accountDetail();
                        }
                }
                else
                {
                    System.out.println("Please Check Your Account Type and Try Again");
                }
                }
                }
            else
            {
                System.out.println("Please Check Your Account Number and Try Again!!!");
            }
            
            
        }
    }
}
