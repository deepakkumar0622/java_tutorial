
class Vehicle {

    Vehicle(String name) {
        System.out.println(name);
    }

}

class Car extends Vehicle {

    Car() {
        super("vehicle");
        System.out.println("Car");
    }

}

public class Super {

    public static void main(String[] args) {
        Car obj = new Car();

    }
}
