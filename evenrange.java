import java.util.Scanner;
public class evenrange{
   public static void main(String args[]){
    Scanner os = new Scanner(System.in);
    System.out.println("Enter the start number:");
    int start = os.nextInt();
    System.out.println("Enter the end number:");
    int end = os.nextInt();
    for(int i=start;i<=end;i++){

if(i%2==0){
    System.out.print(i+" ");
}

   } 
}
}
