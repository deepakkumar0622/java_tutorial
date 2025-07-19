
public class Para {

    int marks;
    String name;

    public Para(int a , String b) {
        marks=a;
        name=b;
    }

    
    
    public static void main(String[] args) {
        
        Para obj= new Para(10,"deepak");

        System.out.println("Name: "+obj.name);
        System.out.println("Marks: "+obj.marks);


    }

}
