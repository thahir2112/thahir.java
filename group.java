import java.util.Scanner;
public class group {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Age:");
    int age = sc.nextInt();
    System.out.println("Group 1: Male under 25 years old");
    System.out.println("Group 2: Female under 25 years old");
    System.out.println("Group 3: Male between 25 - 45 years old");
    System.out.println("Group 4: Female between 25 - 45 yearss old");
    System.out.println("Group 5: All people over 45 years old");
    System.out.println("Enter the Gender code:");
    int gendercode = sc.nextInt();
    switch(gendercode){
        case 1:
        break;
        case 2:
         
         break;
         case 3:
   
         break;
         case 4:
         
         break;
         case 5:
      
         break;
         default:
         System.out.println("Invalid option");
    }
  if(gendercode==1 && age<25){
         System.out.println("Group 1");
          }
         else if(gendercode==2 && age<25){
          System.out.println("Group 2");
         }
         else if(gendercode==3 && age>25 && age<=45){
           System.out.println("Group 3");
         }
         else if(gendercode==4 && age>=25 && age<=45){
            System.out.println("Group 4");
         }
         else if(gendercode==5 && age>45){
            System.out.println("Group 5");
         }
 
}    
}

