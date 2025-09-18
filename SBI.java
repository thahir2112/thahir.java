import java.util.Scanner;
public class SBI {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the applicant age:");
    int age = sc.nextInt();
    System.out.println("Enter your card applicant age:");
    int card_age = sc.nextInt();
    System.out.println("Enter the options:");
    int num = sc.nextInt();
    switch(num){
        case 1:
           System.out.println("Salaried");
           break;
        case 2:
        System.out.println("Self-employed");
        break;
    case 3:
System.out.println("Student");
break;
case 4:
System.out.println("Retired pensinor");
break;
}  
System.out.println("Enter the amount:");
int income = sc.nextInt();
if(age>=20 && age<=60 && card_age>=18 && income==300000){
    System.out.println("Yes.Your are eligible for SBI credit card");
}
else {
    System.out.println("Not eligible for SBI credit card");
}

    }
   } 

