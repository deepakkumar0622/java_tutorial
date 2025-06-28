
import java.util.Scanner;



public class IfElse {
    
    public static void main(String[] args) {
        

    //Integer Comparision
        // Scanner s = new Scanner(System.in);
        // System.out.println("Value 1 :");
        // int num1=s.nextInt();
        // System.out.println("Value 2 :");
        // int num2=s.nextInt();

        // if (num1==num2) {
            
        //     System.out.println("Same");
        // }

        // else{

        //     System.out.println("Not same");
    
        // }

    //String Comparision

    //While using new keyword it creates a new object in the heap memory...        
        // String f1=new String("apple");
        // String f2=new String("apple");
        
    //String pool only stores the orange String in the heap and a1 and a2 will refered to it..
        // String a1="orange";
        // String a2="orange";
        
    //Dont use "==" for string comparision instead use "equals()" function...
        // System.out.println(f1.equals(f2));
        // System.out.println(a1.equals(a2));
        
        Scanner scan = new Scanner(System.in);
        
//Problem 1
    // System.out.println("Choice:");

    // String RCB = scan.nextLine();

    // if (RCB.equals("win")) {
    //     System.out.println("Ee sala cup namdhey");
    // }
    // else{
    //     System.out.println("cup illa");
    // }
// Problem 2
    
        String meghana = scan.nextLine();

        if (meghana.equals("dead")) {
            System.out.println("Surya meets Ramya");
        }
        else{
            System.out.println("Surya weds meghana");
        }
    
    
    }
}
