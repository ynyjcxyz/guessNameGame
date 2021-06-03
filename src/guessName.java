import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class guessName {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        int numberOfMovie = 0;
        List<String> lists = new ArrayList<>();

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            //System.out.println(line);
            lists.add(line);
        }
        Object[] array = lists.toArray();
        //get how many movies this array has
        numberOfMovie = array.length;
        //System.out.println(numberOfMovie);
        //generate a random number from 0 to the length of the array, could be 0 since it's an array unit
        int randomTitleNumber = (int)( numberOfMovie * Math.random() );
        //convert Object array[randomTitleNumber] to string variable
        String guessingValue = array[randomTitleNumber].toString();
        //String guessingValue = "room";
        //System.out.println(guessingValue);
        int length = guessingValue.length();
        char[]zero = new char[length];
        char[]judgeArray = guessingValue.toCharArray();
        for(int n = 0; n < length ; n++){
            zero[n]=' ';
        }

        for(int i= 0 ; i<10 ; i++) {
            System.out.print("Please type a letter to guess(you have 10 times to try):");
            Scanner myInput = new Scanner(System.in);
            char letterInput = myInput.next().charAt(0);
            char[]displayArray = guessingValue.toCharArray();
            for(int j = 0 ; j<length ; j++){
                if(letterInput != guessingValue.charAt(j)){
                    displayArray[j] = '_';
                }
                else if(letterInput == guessingValue.charAt(j)){
                    judgeArray[j] = ' ';
                }
            }
            if(Arrays.equals(judgeArray,zero)){
                System.out.println("You win the game!");
                break;
            }
            //System.out.println("[judgeArray:"+new String(judgeArray)+", zero:"+new String(zero)+"]");
            System.out.println(displayArray);
        }
    }
}