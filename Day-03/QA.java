
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
        // System.out.println("Mark 1 :");
        // int mark1=s.nextInt();
        // System.out.println("Mark 2 :");
        // int mark2=s.nextInt();
        // System.out.println("Mark 3 :");
        // int mark3=s.nextInt();
        // System.out.println("Mark 4 :");
        // int mark4=s.nextInt();
        // System.out.println("Mark 5 :");
        // int mark5=s.nextInt();

        // int avg=(mark1+mark2+mark3+mark4+mark5)/5;


        // System.out.println("Average: " + avg);

        // if (avg<35) {
        //     System.out.println("Additional class is required");

        // }
        // else{
        //     System.out.println("yes good to go");
        // }

        // problem 3
        // System.out.println("colour :");

        // String light=s.nextLine();

        // if (light.equals("red")) {
        //     System.out.println("Stop");
        // }
        // else if(light.equals("yellow")){
        //     System.out.println("Get ready");
        // }
        // else if(light.equals("green")) {
        //     System.out.println("Go");
        // }

        // else{
        //     System.out.println("Error in input");
        // }

        // problem 4

        int salary = s.nextInt();
        int age = s.nextInt();


        if(age >= 25 || salary>=25000){
            System.out.println("Enter Your loan amount : ");
            int loan = s.nextInt();


            if (loan>=50000) {
                System.out.println("Maximum loan amount is 50000");
            }
            else{
                System.out.println("Eligible For loan");
            }

        }

        else{
            System.out.println("Your are not eligible for loan");
        }

    }



}
