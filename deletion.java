import java.util.Scanner;
public class deletion{
    public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int size = scan.nextInt();
int arr[] = new int[size+1];
for(int i=0; i<size; i++)
arr[i] = scan.nextInt();
int pos = scan.nextInt();
int ele = scan.nextInt();
for(int i=size; i>=pos;i--)
arr[i]=arr[i-1];
arr[pos-1]=ele;
    }
}
