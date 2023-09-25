package DSA_WITH_JAVA;

import java.util.Scanner;

public class pizzaCounter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter what you Eat Now ");
        System.out.println("1.  Veg Pizza ");
        System.out.println("2.  Non Veg Pizza ");
        System.out.println("3.  Only Bread ");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("you eat veg pizza");
                VegPizza();
                break;
            case 2:
                System.out.println("you Eat Non veg pizza");
                NonVegPizza();
                break;
            case 3:
                System.out.println("you eat Only bread");
                plane();
                break;
        }
        System.out.println("Thanks Love from Bakers");
    }

    public static void VegPizza(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Toppings Choice");
        System.out.println("1. Adding Mushrooms + Adding Sweet corn + Baby Corn"+" Samll $20 "+" Larg $40");
        System.out.println("2. Adding Onion & capsicum + chees "+" Samll $15 "+" Larg $50");
        System.out.println("3. Mango pizza "+" Samll $30 "+" Larg $60");
        System.out.println("4. Double cheese pizza "+" Samll $25 "+" Larg $50");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter Size of pizza  1 for small and 2 for Large");
               int  size= sc.nextInt();

               if(size==1){
                   System.out.println("Your pizza with");
                   System.out.println("  Mushrooms &  Sweet corn"+"  &  Baby corn");
                   System.out.println(" is Ready ");
                   System.out.println("You pay $20");
                   int amt=sc.nextInt();
                   if(amt>=20){
                       System.out.println("Thanks for comming ");
                   }else {
                       System.out.println("please pay 20$");
                       while(true){
                           int c=sc.nextInt();
                           if(c==20){
                               break;
                           }else{
                               System.out.println("pay 20$");
                           }
                       }
                   }
               }else {
                   System.out.println("Your pizza with");
                   System.out.println("  Mushrooms &  Sweet corn"+"  &  Baby corn");
                   System.out.println(" is Ready ");
                   System.out.println("You pay $40");
                   int amt=sc.nextInt();
                   if(amt>=40){
                       System.out.println("Thanks for comming ");
                   }else {
                       System.out.println("please pay 40$");
                       while(true){
                           int c=sc.nextInt();
                           if(c==40){
                               break;
                           }else{
                               System.out.println("pay 40$");
                           }
                       }
                   }
               }
               break;
            case 2:
                System.out.println("Enter Size of pizza  1 for small and 2 for Large");
                int  s= sc.nextInt();

                if(s==1){
                    System.out.println("Your pizza with");
                    System.out.println("  Onion & capsicum"+"  &  cheese");
                    System.out.println(" is Ready ");
                    System.out.println("You pay $15");
                    int amt=sc.nextInt();
                    if(amt>=15){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 15$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==15){
                                break;
                            }else{
                                System.out.println("pay 15$");
                            }
                        }
                    }
                }else {
                    System.out.println("Your pizza with");
                    System.out.println("  Onion & capsicum"+"  &  cheese");
                    System.out.println(" is Ready ");
                    System.out.println("You pay $50");
                    int amt=sc.nextInt();
                    if(amt>=50){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 50$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==50){
                                break;
                            }else{
                                System.out.println("pay 50$");
                            }
                        }
                    }
                }
                break;
            case 3:
                System.out.println("Enter Size of pizza  1 for small and 2 for Large");
                int  si= sc.nextInt();

                if(si==1){
                    System.out.println("Your pizza with");
                    System.out.println("Mango pizza ");
                    System.out.println(" is Ready ");
                    System.out.println("You pay $30");
                    int amt=sc.nextInt();
                    if(amt>=30){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 30$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==30){
                                break;
                            }else{
                                System.out.println("pay 30$");
                            }
                        }
                    }
                }else {
                    System.out.println("Your pizza with");
                    System.out.println(" Mango");
                    System.out.println(" is Ready ");
                    System.out.println("You pay $60");
                    int amt=sc.nextInt();
                    if(amt>=60){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 60$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==60){
                                break;
                            }else{
                                System.out.println("pay 60$");
                            }
                        }
                    }
                }
                break;
                //last
            case 4:
                System.out.println("Enter Size of pizza  1 for small and 2 for Large");
                int  cho= sc.nextInt();

                if(cho==1){
                    System.out.println("Your pizza with");
                    System.out.println("Double cheese pizza");
                    System.out.println(" is Ready ");
                    System.out.println("You pay $25");
                    int amt=sc.nextInt();
                    if(amt>=25){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 25$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==25){
                                break;
                            }else{
                                System.out.println("pay 25$");
                            }
                        }
                    }
                }else {
                    System.out.println("Your pizza with");
                    System.out.println(" Mango");
                    System.out.println(" is Ready ");
                    System.out.println("You pay $50");
                    int amt=sc.nextInt();
                    if(amt>=50){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 50$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==50){
                                break;
                            }else{
                                System.out.println("pay 50$");
                            }
                        }
                    }
                }





        }
    }
    public static void NonVegPizza(){
        Scanner sc=new Scanner(System.in);

        System.out.println(" 1 for chicken pizza   small 40$ for Larg 70$");
        System.out.println("2 for pepperoni pizza   small 50$ for Larg 80$");
        System.out.println("3. for Sausages pizza   small 40$ for Larg 60$");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter Size of pizza  1 for small and 2 for Large");
                int  cho= sc.nextInt();

                if(cho==1){
                    System.out.println("Your pizza with");
                    System.out.println("Chicken ");
                    System.out.println(" is Ready ");
                    System.out.println("You pay 40$");
                    int amt=sc.nextInt();
                    if(amt>=40){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 40$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==40){
                                break;
                            }else{
                                System.out.println("pay 40$");
                            }
                        }
                    }
                }else {
                    System.out.println("Your pizza with");
                    System.out.println(" chicken");
                    System.out.println(" is Ready ");
                    System.out.println("You pay $70");
                    int amt=sc.nextInt();
                    if(amt>=70){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 70$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==70){
                                break;
                            }else{
                                System.out.println("pay 70$");
                            }
                        }
                    }
                }
                break;
            case 2:
                System.out.println("Enter Size of pizza  1 for small and 2 for Large");
                int  ch= sc.nextInt();

                if(ch==1){
                    System.out.println("Your pizza with");
                    System.out.println("Pepproni ");
                    System.out.println(" is Ready ");
                    System.out.println("You pay 50$");
                    int amt=sc.nextInt();
                    if(amt>=50){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 50$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==50){
                                break;
                            }else{
                                System.out.println("pay 50$");
                            }
                        }
                    }
                }else {
                    System.out.println("Your pizza with");
                    System.out.println(" Pepproni");
                    System.out.println(" is Ready ");
                    System.out.println("You pay $80");
                    int amt=sc.nextInt();
                    if(amt>=80){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 80$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==80){
                                break;
                            }else{
                                System.out.println("pay 80$");
                            }
                        }
                    }
                }
                break;

            case 3:
                System.out.println("Enter Size of pizza  1 for small and 2 for Large");
                int  chi= sc.nextInt();

                if(chi==1){
                    System.out.println("Your pizza with");
                    System.out.println("Sausages ");
                    System.out.println(" is Ready ");
                    System.out.println("You pay 40$");
                    int amt=sc.nextInt();
                    if(amt>=40){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 40$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==40){
                                break;
                            }else{
                                System.out.println("pay 40$");
                            }
                        }
                    }
                }else {
                    System.out.println("Your pizza with");
                    System.out.println(" Sausages");
                    System.out.println(" is Ready ");
                    System.out.println("You pay $60");
                    int amt=sc.nextInt();
                    if(amt>=60){
                        System.out.println("Thanks for comming ");
                    }else {
                        System.out.println("please pay 60$");
                        while(true){
                            int c=sc.nextInt();
                            if(c==60){
                                break;
                            }else{
                                System.out.println("pay 60$");
                            }
                        }
                    }
                }




        }
    }
    public static void plane(){
        System.out.println("You choose white bread");
        System.out.println("You pay only 10$ ");
        System.out.println("Thanks for comming");
    }
}
