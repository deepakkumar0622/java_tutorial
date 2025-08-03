interface Playable{
    void play();
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Plays with keys");
    }
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Plays with Strings");
    }
}


public class Prob1 {
    public static void main(String [] args){
        Guitar g1= new Guitar();
        g1.play();
        Piano p1 =  new Piano();
        p1.play();
    }


}
