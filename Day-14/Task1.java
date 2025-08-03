interface Readable{
    void Read();
}
interface Writeable{
    void Write();
}
interface Stroable{
    void Store();
}

class Common implements Readable,Writeable,Stroable{
    @Override
    public void Store() {
        System.out.println("Stored");
    }

    @Override
    public void Write() {
        System.out.println("Wrote");
    }

    @Override
    public void Read() {
        System.out.println("Read");
    }
}




public class Task1 {
    public static void main(String [] args){

        Common c1 = new Common();
        c1.Read();
        c1.Write();
        c1.Store();


    }


}
