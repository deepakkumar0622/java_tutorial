
public class School {


    //method overloading

    void display (){
        System.out.println("Hello, world!");
    }

    void display(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        
        School obj = new School();

        obj.display();
        obj.display(2);


    }
    

}
