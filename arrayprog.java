import java.util.Scanner;

public class arrayprog {
    public static void main(String[]args){
        //Finding the minimum value from the user given values in array
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        int min = arr[0];

        for (int i = 1;i<size;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Min Value"+min);
    }
}
