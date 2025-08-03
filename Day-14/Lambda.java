
interface A{
    void disp();
}





public class Lambda {
    public static void main (String[] args ){

        // Functional Interface
        // A obj = new A(){
        //     public void disp(){
        //         System.out.println("Display");
        //     }
        // };
        // obj.disp();


        // Alternative Lambda ()->

        A obj = ()-> System.out.println("Display");
        obj.disp();

    }
}