import java.util.Scanner;
public class reverse {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++)
    arr[i] = sc.nextInt();
    for(int i=size-2;i>0;i--)
    System.out.print(arr[i]+" ");
}    
}
