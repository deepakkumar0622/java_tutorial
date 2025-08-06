import java.io.*;

public class Read {

    public static void main(String[] args) {


        try {
            FileReader file = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(file);
            String line = br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Failed");
        }
    }
}