
public class Mobile {
 
    
    int a=10;
    int b=10;

    static  void sum(int a , int b){
        System.out.println("Sum :"+(a+b));
    } 


    public static void main (String [] args){
        Mobile num = new Mobile();
            sum(num.a, num.b);
    }

}
