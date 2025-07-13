
public class Store {

    
    void Soap(int money ){
       
        System.out.println("Soap Purchased for "+money );
    }
    void Chocolate(int money ){
      
        System.out.println("Chocolate Purchased for "+money);
    }


    public static void main(String[] args) {
        
        Store store = new Store();

        store.Soap(30);
        store.Chocolate(50);

    }


}
