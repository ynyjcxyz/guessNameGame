import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class guessName {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:/JAVA_file/GuessTheMovie/movies.txt");
        Scanner scanner = new Scanner(file);
        int line = 0;
        String[] title = null;

        while(scanner.hasNextLine()){
            title[line] = scanner.nextLine();
            line++;
        }
        int randomTitleNumber = (int)((line+1)*Math.random());
        String value = title[randomTitleNumber];
        System.out.println(value);
    }
}