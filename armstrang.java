import java.util.Scanner;
public class armstrang {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int number = sc.nextInt();
    sc.close();
    int original_number = number;
    int result = 0;
    int n = String.valueOf(number).length();
    while(number>0){
        int digit = number%10;
        result+=(int)Math.pow(digit,n);
        number/=10;
    }if(result==original_number){
         System.out.println(original_number +" "+"is an armstrang");
    }else{
        System.out.println(original_number +" "+"is not an armstrang");
    }
    }
}    
