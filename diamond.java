import java.util.Scanner;

public class diamond {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        
        int n = in.nextInt();

        for ( int row = 1 ; row <= n ; row++ ){
            for (int col = n ; col>row ;col--){
                System.out.print(" ");
            }
            for( int col = 1 ; col <=2*row-1; col++){
                System.out.print("*");
            }  
        System.out.println();
        }
        for ( int row = n-1 ; row >= 1 ; row-- ){
            for (int col = n ; col>row ;col--){
                System.out.print(" ");
            }
            for( int col = 1 ; col <=2*row-1; col++){
                System.out.print("*");
            }  
        System.out.println();
        }
        in.close();
    }
}
