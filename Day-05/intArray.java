
import java.util.Scanner;

public class intArray {
    

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();

        int[] arr = {a,b,c,d,e};
        

        int sum=0;

        for (int i = 0; i < arr.length; i++) {

            sum=sum+arr[i];
        }


        System.out.println("Sum of array elements:"+sum);


    }

}
