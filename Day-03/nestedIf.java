
import java.util.Scanner;

class nestedIf{



    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);



        // else-if

        // int score = scan.nextInt();

        // if (score>=35 && score<=60) {
            
        //     System.out.println("video game");

        // } else if(score>60 && score<=90 ) {

        //  System.out.println("Iphone");
        // }

        // else if (score>90) {
        //     System.out.println("macbook");
        // }
        // else{
        //     System.out.println("Nothing");
        // }

        // Nested if


        boolean kfc=true;

        boolean chicken=true;

        boolean pepsi=true;



        if (kfc) {
            
            System.out.println("kfc");

            if (chicken) {
                
                System.out.println("eat");



                if (pepsi) {
                    
                    System.out.println("Drunk");
                } 


            }
        }



    }


}