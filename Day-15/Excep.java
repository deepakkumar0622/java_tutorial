import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        try{
            int a=s.nextInt();
            int b = 10/0;
        }
        catch (InputMismatchException e){
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Program ended");

    }

}
