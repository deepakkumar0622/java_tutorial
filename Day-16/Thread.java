class A1 extends  Thread{
    public void run(){
       for (int i=0 ; i<=10;i++){
           System.out.println("Hello");
           try {
               Thread.sleep(10);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}

class B1 extends  Thread{
    public void run(){
        for(int i=0;i<=10;i++){
        System.out.println("World!");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

public class Thread {

    public static void main(String [] args){

        A1 obj1= new A1();
        obj1.start();

        B1 obj2= new B1();
        obj2.start();
    }

}
