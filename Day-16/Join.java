class A1 extends  Thread{

    int j=0;
    public void run() {
        for (int i = 0; i <= 20; i++) {
            j=i;
        }
    }
}

public class Join {

    public static void main(String [] args) throws InterruptedException {

        A1 obj1= new A1();
        obj1.start();
        obj1.join();
        System.out.println(obj1.j);
    }

}
