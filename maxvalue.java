import java.util.Scanner;

public class maxvalue {
    public static void main(String[]args){
        //Finding the minimum value from the user given values in array
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        int max = arr[0];

        for (int i = 1;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max Value"+max);
    }
}
