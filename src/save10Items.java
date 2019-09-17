import java.util.ArrayList;
import java.util.Scanner;

public class save10Items {

    public static void main(String arg[]){

        ArrayList<String> words = new ArrayList<String>();
        Scanner sc =new Scanner (System.in);
        String word="";

        for(int i=0;i<10;i++){

            System.out.println("Please enter a word for word number "+(i+1));
            word =sc .nextLine();
            words.add(word);

        }
        System.out.println("The words you just entered are ");

        for(int i=0;i<words.size();i++){
            System.out.print(words.get(i)+'\t');
        }

        System.out.print(".");
    }
}
