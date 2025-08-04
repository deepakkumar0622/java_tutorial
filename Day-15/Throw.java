import java.util.Scanner;

public class Throw {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        try{
           int a=s.nextInt();
           if (a<1){

           throw new ArithmeticException("Age should be greater than 1");
           }
        }
        catch (Exception e) {
            System.out.println(e);
        }


    }

}
