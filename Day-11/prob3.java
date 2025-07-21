class Vehicle {
    String brand;
    int year;

    void StartEngine() {
        System.out.println("Animal Makes a Sound");
    }

}

class Car extends Vehicle {
    String fuelType;

    @Override
    void StartEngine() {
        System.out.println("Car engine Starts");
    }

    void drive() {
        System.out.println("Car is Driving");
    }

}

class Truck extends Vehicle {
    String loadCapacity;

    @Override
    void StartEngine() {
        System.out.println("Truck Engine Start");
    }

    void Haul() {
        System.out.println("Truck is Hauling");
    }

}


public class prob3 {

    public static void main(String[] args) {
//Dog heritance
        Car obj = new Car();
        obj.brand = "BMW";
        obj.year = 2021;
        obj.fuelType = "Diesel";
        obj.StartEngine();
        obj.drive();


//Cat heritance
        Truck obj2 = new Truck();
        obj2.brand = "Manhat";
        obj2.year = 2010;
        obj2.loadCapacity = "200 Tons";
        obj2.StartEngine();
        obj2.Haul();

    }


}
