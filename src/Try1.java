import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Try1 {
    public static void main(String[] args) {
        try{
            readFile();{
            } catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
        public static void readFile() throw FileNotFoundException {
            File file = new File("abc");
            Scanner scanner = new Scanner(file);
        }
    }
}
