import java.util.Scanner;
public class posneg {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num>0){
          System.out.println(num+" "+"is positive");
        }
        else if(num<0){
            System.out.println(num+" "+"is negative");
        }
        else if(num==0){
            System.out.println(num+" "+"is zero");
        }
    }
}
