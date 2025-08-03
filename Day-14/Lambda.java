
interface A{
    void disp();
}


public class Lambda {
    public static void main (String[] args ){

        A obj = ()-> System.out.println("Display");
        obj.disp();

    }
}