
public class problem_2 {

    static String result(int num){
        

        if (num>35) {
             return "Pass";
        }
        else{
            return "fail";
        }

        
    }

    public static void main(String[] args) {
        
        int[] mark={98,75,35,57,20};

        for (int i = 0; i < mark.length; i++) {
            System.out.println(result(mark[i])); 
        }



    }
    
}
