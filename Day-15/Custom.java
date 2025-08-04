import java.util.Scanner;

class NotValidException extends Exception{
    NotValidException(String S){
        super(S);
    }
}



public class Custom {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        try{
           int a=s.nextInt();
           if (a<18){
           throw new NotValidException("Your age should be above 18");
           }
        } catch (NotValidException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }


    }

}
