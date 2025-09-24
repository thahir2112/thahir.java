import java.util.Scanner;
public class evensum {
     public static void main(String args[]){
        int sumEven=0,sumOdd=0;
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = ac.nextInt();
        for(int i=0;i<n;i++){
            int num = ac.nextInt();
         if(num%2==0){
            sumEven +=num;
         }
         }
         System.out.println("The even number:"+ sumEven);
        }
    }

