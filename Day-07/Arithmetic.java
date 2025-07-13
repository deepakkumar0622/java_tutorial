
public class Arithmetic {
 
    
    int a=10;
    int b=10;

    static  void add(int a , int b){
        System.out.println("add :"+(a+b));
    } 
    static  void mul(int a , int b){
        System.out.println("Mul :"+(a*b));
    } 
    static  void sub(int a , int b){
        System.out.println("Sub :"+(a-b));
    } 
    static  void div(int a , int b){
        System.out.println("div :"+(a/b));
    } 


    public static void main (String [] args){
        Arithmetic num = new Arithmetic();
            add(num.a, num.b);
            sub(num.a, num.b);
            mul(num.a, num.b);
            div(num.a, num.b);
    }

}
