import java.util.Scanner;
public class machine {
    public static void main(String args[]){
        int k=50000,total,Withdraw,Deposit,Checkbalance,amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to JAVA atm");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check balance");
        System.out.println("4.Exit");
        System.out.println("Choose your options:");
        int options = sc.nextInt(); 
        
        switch(options){
             case 1: 
            System.out.println("Enter the amount:");
            amount = sc.nextInt();
            Withdraw = k-amount;
            System.out.println("Your amount withdraw successfully");
            System.out.println("Your account balance is:"+" "+Withdraw);
            break;
            case 2:
            System.out.println("Enter the amount:");
            amount = sc.nextInt();
            Deposit = k+amount;
            System.out.println("Your deposit amount successfully");
            System.out.println("Your account balance is:"+" "+Deposit);
            break;
            case 3:
            Checkbalance = k;
            System.out.println("Your account balance is:"+" "+Checkbalance);
            break;
            case 4:
            break;
            default:
            System.out.println("Invalid option");

        }
            System.out.println("Thank you to use me");
            System.out.println("Welcome again");   
    }
}
