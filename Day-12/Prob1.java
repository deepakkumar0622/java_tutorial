class person{
    String name;
    person(String name) {
        this.name=name;
    }
}

class Employee extends person{
    int id;
    Employee(String name , int id ){
        super(name);
        this.id=id;
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
    }
}




public class Prob1 {

    public static void main(String [] args){
        Employee obj = new Employee("Deepak",22);
        obj.display();
    }

}
