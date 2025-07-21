
class Laptop{
    String name="hp";
}

class Bike{
    int price=10000;
}


public class Inher{
    public static void main(String[] args){
        Laptop l1=new Laptop();
        System.out.println(l1.name);
        Bike b1 = new Bike();
        System.out.println(b1.price);
    }
}