class Dad{
    int money=1000;
}

class Son extends Dad{

}

public class Family {
    public static void main (String [] args){

        Son s1 = new Son();
        System.out.println(s1.money);

    }

}
