class Animal{
    void eat(){
        System.out.println("This animal cant eat");
    }
}

class Dog extends Animal {

    void Bark() {
        System.out.println("Barks");
    }
}

public class Single {

    public static void main (String[] args){

        Dog d1=new Dog();

        d1.Bark();
        d1.eat();

    }


}
