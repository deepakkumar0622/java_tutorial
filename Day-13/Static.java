
public class Static {

    //static block
    //Executes everytime when class declares
    static {
        System.out.println("Hello !");
    }

    int a = 10; // non-static
    static int b = 20; //static

    public static void main(String[] args) {

        Static obj = new Static(); //Requires object creation
        System.out.println(obj.a);

        System.out.println(b); // doesn't require object creation

    }

}
