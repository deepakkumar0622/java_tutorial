
public class Garden {
    
    int count=10;
    int money=200;

    void total_count(){
        
        System.out.println(count*money);
    }

    public static void main(String[] args) {
        
        Garden mul = new Garden();

        mul.total_count();

    }


}
