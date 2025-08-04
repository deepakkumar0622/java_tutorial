import java.util.InputMismatchException;
import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        try{
            a=s.nextInt();
            b = s.nextInt();
            c=a/b;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (InputMismatchException e) {
            System.out.println("Inout Exception");
        }
        if (c!=0){

        System.out.println("Result "+c);
        }

    }

}
