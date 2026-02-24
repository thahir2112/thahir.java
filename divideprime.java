import java.util.Scanner;
public class divideprime {
    public static void main(String args[]){
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = se.nextInt();
        if(num%1==0 && num%num==0){
         System.out.println(num+" "+"is a prime number");
        }
        else{
            System.out.println(num+" "+"is not a prime number");
        }
    }
}
