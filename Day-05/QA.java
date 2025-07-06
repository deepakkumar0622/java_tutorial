
import java.util.Scanner;

public class QA {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        // problem-1

        // int[] arr = new int[5];

        //  for (int i = 0; i < arr.length; i++) {

        //      arr[i]=s.nextInt();
             
             
        //     }
            
            
        //     for (int i = 0; i < arr.length; i++) {
                
        //         System.out.println("Number " + i + " : " + arr[i] ) ;
        //     }


        // problem -2 

        // int[] arr = {1,2,3,4,5,6,7,8,9,0};

        // for(int i=0 ; i < arr.length ; i++){
        //     System.out.println(arr[i]);
        // }


        
        //problem 3 

        // int num = s.nextInt();

        // for (int i = 1; i <= num; i++) {
            
        //     System.out.println( i + " X " + num + " = " + i*num );

        // }

        //Problem -4 

        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Size fo array : " + size);

        
        for (int i = 0; i < size; i++) {
            
            arr[i] = s.nextInt();

        }

        int mid=size/2;

        System.out.println("Middle element : " + arr[mid] );


    }
}
