import java.util.Scanner;
public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to the bank");
        System.out.println("Enter Your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        int accountType;
        double savingsBalance=10000;
        double currentAccBalance =10000;
        do{
            System.out.println("Select your account type: ");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice");
            accountType = sc.nextInt();
            switch (accountType) {
                case 1:{
                        System.out.println("You have selected Savings Account");
                        System.out.println("Enter your choice");
                        int savingsChoice;
                        do{
                            System.out.println("1. Check Balance");
                            System.out.println("2. Desposit balance");
                            System.out.println("3. Withdraw Balance");
                            System.out.println("4. Return to Account");
                            savingsChoice=sc.nextInt();
                            switch (savingsChoice) {
                               case 1:{
                                System.out.println("Your Balance is: " + savingsBalance);
                                break;
                               }
                               case 2:{
                                System.out.println("Enter Amount to Deposite");
                                double deposite = sc.nextDouble();
                                savingsBalance += deposite;
                                System.out.println("Your total Balance is: " + savingsBalance);
                                break;
                               }
                               case 3:{
                                System.out.println("Enter Amount to Withdraw");
                                double withdraw = sc.nextDouble();
                                if(savingsBalance<withdraw){
                                    System.out.println("Insufficient Balance");
                                }else{
                                    savingsBalance-=withdraw;
                                    System.out.println("Your total Balance is: " + savingsBalance);
                                }
                                break;
                               }
                               case 4:{
                                System.out.println("Returning to Acoount");
                                break;
                               }
                               default:{
                                System.out.println("Invalid Operation");
                               }
                            }

                        }while(savingsChoice!=4);
                        break;
                }
                case 2:{
                    System.out.println("You have selected Current Account");
                     System.out.println("Enter your choice");
                        int currentChoice;
                        do{
                            System.out.println("1. Check Balance");
                            System.out.println("2. Desposit balance");
                            System.out.println("3. Withdraw Balance");
                            System.out.println("4. Return to Account");
                            currentChoice=sc.nextInt();
                            switch (currentChoice) {
                               case 1:{
                                System.out.println("Your Balance is: " + currentAccBalance);
                                break;
                               }
                               case 2:{
                                System.out.println("Enter Amount to Deposite");
                                double deposite = sc.nextDouble();
                                currentAccBalance += deposite;
                                System.out.println("Your total Balance is: " + currentAccBalance);
                                break;
                               }
                               case 3:{
                                System.out.println("Enter Amount to Withdraw");
                                double withdraw = sc.nextDouble();
                                if(currentAccBalance<withdraw){
                                    System.out.println("Insufficient Balance");
                                }else{
                                    currentAccBalance-=withdraw;
                                    System.out.println("Your total Balance is: " + currentAccBalance);
                                }
                                break;
                               }
                               case 4:{
                                System.out.println("Returning to Acoount");
                                break;
                               }
                               default:{
                                System.out.println("Invalid Operation");
                               }
                            }

                        }while(currentChoice!=4);
                        break;
                }
                case 3:{
                    System.out.println("Thanks for coming to this bank");
                    break;
                
                }
                default:{
                    System.out.println("Invalid Option");
                }
            }

        }while(accountType!=3);

        sc.close();
    }
}
