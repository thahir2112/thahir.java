import java.util.*;
    public class left {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(arr)); 
        int leftr = sc.nextInt();
        for(int j=1; j<=leftr;j++){
            int temp = arr[0];
            for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];}
            arr[size-1]=temp;
        }
    System.out.println(Arrays.toString(arr));
    }
    
    }
