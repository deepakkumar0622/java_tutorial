class A{
    int one = 1;
}

class B extends A {
    int two =2;
}

class C extends B {
    int three=3;
}


public class Multiple {

    public static void main (String[] args){

        C obj = new C();
        System.out.println(obj.one);

    }


}

