
public class QA{


    int num=10;
    
    
    void evenorodd(int num){
        if (num%2==0) {
            System.out.println("Number is even"); 
        }
        else{
            System.out.println("Number is odd");
        }
        
    }
    
    public static void main(String[] args) {
        
        
        QA func1 = new QA();
        QA func2 = new QA();


      System.out.println(func1.num);

    //     Scanner s= new Scanner(System.in);
     
     
     
    //  System.out.println("Enter a number :");
    //  int num=s.nextInt();


        func2.evenorodd(10);
       


    }
}