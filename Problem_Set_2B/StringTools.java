/**
 * Evital Heyl
 * September 25th, 2024
 * 1-3
 * Problem set 2B
 */

public class StringTools {

    public String toString () {
        return "HI";
    }

    public String lastLetter(String str) {
        int Length = str.length();
        String lastLetter = str.substring(Length-1);
        return lastLetter;
    }

    public String formatPhoneNumber(String str) {
        String partOne = str.substring(0, 3);
        String partTwo = str.substring(3, 6);
        String partThree = str.substring(6);
        return "(" + partOne + ") " + partTwo + "-" + partThree;
    }

    public String middleThree(String str) {
        int Length = str.length();
        int middleIndex = Length/2; 
        /**
         * length is total character so the middle of that wont equal
         * the middleIndex but the division gets rid of the 0.5 so nothing
         * needs to be added
         */
        String middleLetters = str.substring(middleIndex-1, middleIndex + 2);
        return middleLetters;
    }

    public String swapLastTwo (String str) {
        int Length = str.length();
        String firstLetters = str.substring(0, Length-2);
        String lastLetter = str.substring(Length-1);
        String secondLastLetter = str.substring(Length-2, Length-1);
        String newWord = firstLetters + lastLetter + secondLastLetter;
        return newWord;
    }

   /**
    * 
     public boolean frontAgain (String str, int n) {
        
    }
    */
    
}