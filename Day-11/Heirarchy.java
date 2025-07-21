

    
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
    
    class Cat extends Animal{
        void meow(){
            System.out.println("Meow");
        }
    }
    
    public class Heirarchy {
    
        public static void main (String[] args){
    
            Cat obj=new Cat();
            obj.eats();
            obj.meow();
    
    
    
        }
    
    
    }
    

