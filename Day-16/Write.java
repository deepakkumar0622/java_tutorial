import java.io.BufferedWriter;
import java.io.FileWriter;

public class Write {

    public static void main(String[] args) {


        try {
            FileWriter file = new FileWriter("output.txt", true);
            BufferedWriter bw = new BufferedWriter(file);
            bw.write("Hey Man");
            bw.newLine();
            bw.write("Okay");
            bw.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("Failed");
        }
    }
}