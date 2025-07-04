
import java.util.Scanner;

public class QA {
    

    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        
        // problem-1
        
        // System.out.println("enter the score:");

        // int score=s.nextInt();

        // if (score<50) {
        //     System.out.println("You need to improve");
        // }
        // else if(score>=50 && score<=70){
        //     System.out.println("Good Job");
        // }
        // else{
        //     System.out.println("Excellent perfomance");
        // }

        // problem-2
        System.out.println("Mark 1 :");
        int mark1=s.nextInt();
        System.out.println("Mark 2 :");
        int mark2=s.nextInt();
        System.out.println("Mark 3 :");
        int mark3=s.nextInt();
        System.out.println("Mark 4 :");
        int mark4=s.nextInt();
        System.out.println("Mark 5 :");
        int mark5=s.nextInt();

        int avg=(mark1+mark2+mark3+mark4+mark5)/5;


        System.out.println("Average: " + avg);

        if (avg<35) {
            System.out.println("Additional class is required");

        }
        else{
            System.out.println("yes good to go");
        }


    }



}
