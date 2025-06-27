import java.util.Scanner; 



class userInput{

    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        
        String c = s.nextLine();
        
        System.out.println("Enter A value :");  
        int a = s.nextInt();
        System.out.println("Enter B value :");
        int b = s.nextInt();


        System.out.println( c +" : "+ (a+b));
        



    }
}