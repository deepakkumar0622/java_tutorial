
class Counter{
    static int count=0;
    int inst_number=0;

    Counter(){
        count=count+1;
        inst_number=inst_number+1;
    }

    void disp(){
        System.out.println(count);
        System.out.println(inst_number);
    }

}




public class Prob2 {

    public  static void main (String[] args){
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        obj1.disp();
        obj2.disp();
        obj3.disp();
    }


}
