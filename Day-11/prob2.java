class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Animal Makes a Sound");
    }

}

class Dog extends Animal {
    String Breed;

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog is fetching");
    }

}

class Cat extends Animal {
    String colour;

    @Override
    void makeSound() {
        System.out.println("Cat Meows");
    }

    void climb() {
        System.out.println("Cat is climbing");
    }

}


public class prob2 {

    public static void main(String[] args) {
//Dog heritance
        Dog obj = new Dog();
        obj.name = "Jimmy";
        obj.age = 21;
        obj.Breed = "German Shepard";
        obj.makeSound();
        obj.fetch();


//Cat heritance
        Cat obj2 = new Cat();
        obj2.name = "Tommy";
        obj2.age = 10;
        obj2.colour = "Brown";
        obj2.makeSound();
        obj2.climb();

    }


}
