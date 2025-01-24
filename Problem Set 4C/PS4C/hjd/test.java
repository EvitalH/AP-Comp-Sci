
import java.util.Scanner;
public class test {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int count = 0;
        char letter = str.charAt (0);
        char currentLetter = letter;
        int currentCount = 0;
        for (int i = 0; i < str.length(); i++) {  
            if (str.charAt(i) == currentLetter) {
                currentCount++;
            } else {        
                if (currentCount > count) {
                    count = currentCount;
                    letter = currentLetter;            
                }
                currentLetter = str.charAt(i); 
                currentCount = 1;
            }
        }
        System.out.println (letter + " " + count);
    }
}
