
import java.util.Scanner;

public class QA {
    

    public static void main(String[] args) {
        
        // problem-1

        Scanner s = new Scanner(System.in);


        System.out.println("enter the score:");

        int score=s.nextInt();

        if (score<50) {
            System.out.println("You need to improve");
        }
        else if(score>=50 && score<=70){
            System.out.println("Good Job");
        }
        else{
            System.out.println("Excellent perfomance");
        }


    }



}
