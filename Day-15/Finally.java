
import java.util.Scanner;

public class Finally {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

           int err=0;
        try{
           int a=10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
            err=1;
        }
        finally {
            if(err==1){
                System.out.println("Error Found");
            }
            else {

            System.out.println("Hi im a finally");
            }
        }
    }

}
