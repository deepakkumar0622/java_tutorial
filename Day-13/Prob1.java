public class Person{
    public String name;
    protected int age;
    private String socialnumber;
    String address;

    Person(String name , int age , String ssn , String addr){
        this.name=name;
        this.age=age;
        this.socialnumber=ssn;
        this.address=addr;
    }
}

class Employee extends Person{
    Employee(String name , int age , String ssn , String addr){
        super(name,age,ssn,addr);
    }
}


public class Prob1 {

    public  static void main (String[] args){
    Employee obj = new Employee("john",23,"ssn1","Chennai");

        System.out.println(obj.name);
        System.out.println(obj.address);
        System.out.println(obj.age);
        System.out.println();


    }


}

