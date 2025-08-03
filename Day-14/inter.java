interface Animal{
    void sound();
}

class Cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}

public class inter {
    public static void main(String [] args){
        Cat c1 = new Cat();
        c1.sound();
    }


}
