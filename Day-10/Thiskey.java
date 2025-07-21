public class Thiskey {

    String myName;

    public Thiskey() {

        System.out.println("Hello");

    }

    void setName(String myName) {
        this.myName = myName;

    }

    public static void main(String[] args) {
        Thiskey obj = new Thiskey();
        obj.setName("Mark");
        System.out.println(obj.myName);
    }

}
