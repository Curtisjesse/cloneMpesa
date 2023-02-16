/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
//package Mpesa;

//import java.util.Scanner;

/**
 *
 * @author curtis
 */
public class mpesa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mpesaProj obj1 = new mpesaProj("curtis", "3690");
        obj1.showMenu();
    }
    
}

//package mpesa;



class mpesaProj {
    
    int balance;
    String customerName;
    String customerId;
    
    mpesaProj(String cname,String cid)
    {
        customerName = cname;
        customerId =cid;
    }
     
    void deposit(int amount){
        if(amount!=0)
        {
            balance = balance + amount;
        }
    }
    void withdraw(int amount)
    {
        if(amount!=0)
        {
            balance = balance - amount;
        }
    }
    void sendMoney(int amount)
    {
          if(amount!=0)
        {
            balance = balance - amount;
        }
    }
    void lipaNaMpesa(int amount)
    {
          if(amount!=0)
        {
            balance = balance - amount;
        }
    }
    void buyAirtime(int amount)
    {
          if(amount!=0)
        {
            balance = balance - amount;
        }
    }
    void pochi(int amount)
    {
          if(amount!=0)
        {
            balance = balance - amount;
        }
    }
    void till(int amount)
    {
          if(amount!=0)
        {
            balance = balance - amount;
        }
    }
     void payBill(int amount)
    {
          if(amount!=0)
        {
            balance = balance - amount;
        }
    }
    void showMenu()
    {
       char option ='\0';
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("welcome "+customerName);
        System.out.println("your ID is "+customerId);
        System.out.println("\n");
        System.out.println("A. check balance");
        System.out.println("B. deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. send money");
        System.out.println("E. lipa na mpesa");
        System.out.println("F: buy airtime");
        System.out.println("G. exit");
        
         do
         {
             System.out.println("enter your option: ");
             option = scanner.next().charAt(0);
             //System.out.println("\n");
             
             switch(option)
             {
                 case 'A':
                     System.out.println("Balance ="+ balance);
                     System.out.println("\n");
                     break;
                 case 'B':
                     System.out.println("enter the amoun to deposit: ");
                     int amount = scanner.nextInt();
                     deposit(amount);
                     System.out.println("\n");
                     break;
                 case 'C':
                     System.out.println("enter the agent number: ");
                     int agn = scanner.nextInt();
                     System.out.println("enter amount to withdraw: ");                  
                     int amount2 = scanner.nextInt();
                     withdraw(amount2);
                     System.out.println("\n");
                     break;
                 case 'D':
                     System.out.println("enter the phone number: ");
                     int number = scanner.nextInt();
                     System.out.println("enter the amount: ");
                     int amount3 = scanner.nextInt();
                     sendMoney(amount3);
                     System.out.println("you have sent "+amount3 + "to "+ number);
                     System.out.println("...............");
                     break;
                 case 'E':
                     System.out.println("");
                  //void showMenu()
                  {
                         System.out.println("a. pay bill");
                         System.out.println("b. till number");
                         System.out.println("c. pochi la biashara");
                         System.out.println("d. exit");
                     do
                     {
                        System.out.println("enter your option: ");
                        option = scanner.next().charAt(0); 
                        
                        switch(option)
                        {
                            case'a':
                                System.out.println("enter the paybill: ");
                                int paybill =scanner.nextInt();
                                System.out.println(".........");
                                System.out.println("enter account number: ");
                                int account = scanner.nextInt();
                                System.out.println("enter the amount: ");
                                int amount4 = scanner.nextInt();
                                payBill(amount4);
                                System.out.println("you hae successfully sent money to "+ account+ "to " +amount4);
                                break;
                            case 'b':
                                System.out.println("enter the till number: ");
                                int till = scanner.nextInt();
                                System.out.println("enter the amount: ");
                                int amount5 = scanner.nextInt();
                                till(amount5);
                                System.out.println("you have sent "+amount5 + "to "+till);
                                System.out.println("..............");
                                break;
                            case 'c':
                                System.out.println("enter phone number: ");
                                int number3 = scanner.nextInt();
                                System.out.println("enter the amount: ");
                                int amount6 = scanner.nextInt();
                                pochi(amount6);
                                System.out.println(" you have sent "+ amount6 + "to " + number3);
                                System.out.println("..........");
                                break;
                            //case 'd':
                               // System.out.println(".........");
                            
                        }
                     }
                     while(option !='d');
                     {
                         System.out.println("...........");
                         //go to showMenu;
                     }
                  }
                  //lipaNaMpesa(amount);
                  break;
                 case 'F':
                     System.out.println("ener the phone number: ");
                     int number4 = scanner.nextInt();
                     System.out.println("enter amount: ");
                     int amount7 = scanner.nextInt();
                     buyAirtime(amount7);
                     System.out.println("you have successfully bought credit worth "+amount7 + "to " +number4);
                
                 case 'G':
                     System.out.println("..........");
                     break;
                 default :
                     System.out.println("check your option...");
                     break;
                     
             }
              
              
         }
         while(option !='G');
              {
                  System.out.println("thankyou");
              }
        
    }
}

/*class mpesaProj {
    
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;
    
    mpesaProj(String cname,String cid)
    {
        customerName = cname;
        customerId =cid;
    }
     
    void deposit(int amount){
        if(amount!=0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount)
    {
        if(amount!=0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void getPreviousTransaction()
    {
        if(previousTransaction > 0)
        {
            System.out.println("deposited: "+ previousTransaction);
        }
        else if(previousTransaction < 0)
        {
            System.out.println("withdrawn: "+Math.abs(previousTransaction)); 
        }
        else
        {
            System.out.println("no transaction occured");
        }
    }
    void showMenu()
    {
       char option ='\0';
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("welcome "+customerName);
        System.out.println("your ID is "+customerId);
        System.out.println("\n");
        System.out.println("A. check balance");
        System.out.println("B. deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. previous transaction");
        System.out.println("E. exit");
        
         do
         {
             System.out.println("enter your option: ");
             System.out.println("........................");
             option = scanner.next().charAt(0);
             System.out.println("\n");
             
             switch(option)
             {
                 case 'A':
                     System.out.println("Balance ="+ balance);
                     System.out.println("\n");
                     break;
                 case 'B':
                     System.out.println("enter the amoun to deposit: ");
                     int amount = scanner.nextInt();
                     deposit(amount);
                     System.out.println("\n");
                     break;
                 case 'C':
                     System.out.println("enter amount to withdraw: ");
                     System.out.println("..........");
                     int amount2 = scanner.nextInt();
                     withdraw(amount2);
                     System.out.println("\n");
                     break;
                 case 'D':
                     System.out.println(".,.........");
                     getPreviousTransaction();
                     System.out.println("\n");
                     break;
                 case 'E':
                     System.out.println(".............");
                     break;
                 default :
                     System.out.println("check your option...");
                     break;
                     
             }
              
              
         }
         while(option !='E');
              {
                  System.out.println("thankyou");
              }
        
    }
}*/