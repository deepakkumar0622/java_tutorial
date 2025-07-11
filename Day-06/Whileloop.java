
import java.util.Random;

public  class Whileloop{
    public static void main(String[] args) {
        

 int i=1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }



        Random rand = new Random();

        
        
        int newnum=0;
        
        while(newnum!=5){
            newnum = rand.nextInt(11);
            System.out.println(newnum);
        }


    }
}