import java.util.Scanner;

class divideNumber{
    void divideNumbers(int num,int dem){
        int result=0;
        try{
            result=num/dem;
            System.out.println("Divided Value : "+result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
        }
    }
}


public class Tassk1 {
    public static void main(String[] args){

        Scanner s =new Scanner(System.in);

        int n1=s.nextInt();
        int n2=s.nextInt();

        divideNumber obj= new divideNumber();
        obj.divideNumbers(n1,n2);
    }

}
