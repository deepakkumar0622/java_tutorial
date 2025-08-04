import java.util.Scanner;

class invalidAgeException extends  Exception{
    invalidAgeException(String s){
            super(s);
    }
}


class AgeValidator{
    void checkAge(int age) {
        try{
            if (age<18 || age>50){
                throw new invalidAgeException("Try different age");
            }
        }
        catch (invalidAgeException e){
            System.out.println(e);
        }
    }
}


public class Task2 {
    public static void main(String[] args){

        Scanner s =new Scanner(System.in);

        int age = s.nextInt();

        AgeValidator obj = new AgeValidator();

        obj.checkAge(age);


    }

}
