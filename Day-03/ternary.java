import java.util.Scanner;

public class ternary {

        public static void main(String[] args) {
            
            // String result = true?"Yes":"No";

            // System.out.println(result);

            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt();
            int b = scan.nextInt();

            String result = a>b ? "A is bigger" : "B is bigger";
            
            System.out.println(result);


        }

        
}
