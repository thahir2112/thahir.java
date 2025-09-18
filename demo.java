import java.util.Scanner;
public class demo {
    public static void main(String [] args){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary=num.nextInt();
        System.out.println("Enter your age:");
        int age=num.nextInt();
        if(salary>=20000||age<=25)
        {
            System.out.println("Eligible for loan");
            System.out.println("Enter your loan amount:");
            int loan = num.nextInt();
            if(loan<=50000){
                System.out.println("Your loan amount is transaction in your bank quickly");
            }
        }
        else{
        System.out.println("Loan is not available");
    }
    }

}
