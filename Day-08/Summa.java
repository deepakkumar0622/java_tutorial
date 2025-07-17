public class Summa {
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
        Summa func = new Summa();
        // Summa func2 = new Summa();


      System.out.println(func.num);

    //     Scanner s= new Scanner(System.in);
     
     
     
    //  System.out.println("Enter a number :");
    //  int num=s.nextInt();


        func.evenorodd(10);
       
    }
}
