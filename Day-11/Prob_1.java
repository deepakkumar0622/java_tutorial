class Zoo{
    void wildanimals(){
        System.out.println("These are wild numbers");
    }
    void domesticanimals(){
        System.out.println("These are Domestic numbers");
    }
}

class Wild extends Zoo{
    void Lion(){
        System.out.println("Roars");
    }
}

class Domestic extends Zoo{
    void Dog(){
        System.out.println("Barks");
    }
}

public class prob_1 {

    public static void main (String[] args){

        Domestic obj1 = new Domestic();
        obj1.domesticanimals();
        obj1.Dog();

        Wild obj2 = new Wild();
        obj2.wildanimals();
        obj2.Lion();



    }


}
