import java.util.Scanner;
public class oddoreven{
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        int num = var.nextInt();
        if (num%2==0){
            System.out.println("it is even");
        }else {
            System.out.println("it is odd");
        }
    }
}
