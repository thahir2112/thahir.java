import java.util.Scanner;
public class positiveornegative1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if (num>=0) {
            System.out.println("It is positive");            
        } 
        else if(num<=0){
         System.out.println("It is negative");
        } 
        else if(num==0){
            System.out.println("It is zero");
        } 
    }
}
