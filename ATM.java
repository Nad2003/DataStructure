package DSA_WITH_JAVA;


import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM  {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int pin=0;
        double amount=0.0;

        System.out.println("Create  4 Digit pin ");
        while(true){
            pin=createPin();
            if(pin==-1){
                System.out.println("Create only 4 digit pin");
            }else{
                break;
            }
        }
        System.out.println("Enter created pin");
        int created =sc.nextInt();

        if(created==pin){
        while(true){
            System.out.println("Enter your choice ");
            System.out.println("1. change 4 digit pin");
            System.out.println("2.Withdrawal ");
            System.out.println("3.Deposit ");
            System.out.println("4. Check balance ");
            System.out.println("5. Enter for exit ");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter New Pin");
                pin=createPin();
            } else if (choice==2) {
                if(amount==0.0){
                    System.out.println("No Mony !!!!");
                }else{
                    System.out.println("Enter widroll amount");
                    int amt=sc.nextInt();
                    if(amt>amount){
                        System.out.println(" Sorry you have not enough balance : "+amount);
                    }else{
                        amount=amount-amt;
                        System.out.println("Your Current balance is : "+ amount);
                    }

                }
            } else if (choice==3) {
                System.out.println("Enter amount to deposit");
                int amt=sc.nextInt();
                amount=amount+amt;
                System.out.println("Net balance is : "+amount);
            } else if (choice==4) {
                System.out.println("Your Net balance is : "+ amount);
            }else if(choice==5|| choice >5) {
              break;
            }
        }

        }

        System.out.println("<-------- THANK YOU FOR COMMING ------->");
        System.out.println("*****************************************");

    }

    public static int createPin(){
        Scanner sc= new Scanner(System.in);
        int pin=sc.nextInt();
        String num=Integer.toString(pin);
        if(num.length()!=4){
            return -1;
        }else {
            return pin;
        }

    }
}
