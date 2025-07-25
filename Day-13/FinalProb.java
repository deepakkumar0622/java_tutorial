abstract class vehicle{
    final void StartEngine(){
        System.out.println("Engine Starts...");
    }

    static String getVehcleType(){
        return "Generic vehicle";
    }

    abstract void Drive();
}

class Car extends vehicle{
    @Override
    void Drive() {
        System.out.println("Car");
    }
}

class Bike extends vehicle{
    @Override
    void Drive() {
        System.out.println("Bike");
    }
}






public class FinalProb {

    public  static void main (String[] args){

        Car c1 = new Car();
        c1.Drive();

        vehicle.getVehcleType();

    }


}
