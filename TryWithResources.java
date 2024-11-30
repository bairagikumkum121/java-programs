import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourse {
    public static void main(String[] args) {
        try(FileWriter writer=new FileWriter("E:\\Shailesh sir program\\data.txt")){
            writer.write("I love my country");
            System.out.println("Data saved in the file");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
