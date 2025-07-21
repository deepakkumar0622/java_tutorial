class Animal{
    void eats(){
        System.out.println("This animal eats..");
    }
}

class Dog extends Animal{
    void Bark(){
        System.out.println("Barks");
    }
}

class Puppy extends Dog{
    void Weep(){
        System.out.println("Weeps");
    }
}

public class Multiple {

    public static void main (String[] args){

        Puppy obj = new Puppy();
        obj.eats();
        obj.Bark();
        obj.Weep();

    }


}
