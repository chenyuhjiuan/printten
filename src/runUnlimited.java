import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class runUnlimited {

    public static void main(String[] arg) {

        ArrayList<String> words = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String word = "";
        System.out.println("Please type enter.");
        word = sc.nextLine();
while(true)
        System.out.println("Do you want to enter words? yes for continuing and Stop for quit");

        if (word.equalsIgnoreCase("stop"))
                break;

        words.add(word);
            System.out.println("The words you just entered are ");

            for(String i:words)
                System.out.println(i);

    }
}

