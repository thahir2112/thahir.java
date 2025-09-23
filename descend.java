import java.util.*;
public class descend{
public static void main(String args[]){
    Scanner ob = new Scanner(System.in);
    int size = ob.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the numbers:");
    for(int i = 0;i < 4;i++)
    arr[i] = ob.nextInt();
    Arrays.sort(arr);
    System.out.println("The numbers in descending order:");
    for(int i = 4;i>=0;i--){
        System.out.print(i+" ");
    }
}
}
