/**
 * Evital Heyl
 * 1-3
 * October 28th
 */

import java.util.Scanner;
public class Driver {

    public static void main (String[] args) {
        //driverSentimentVal ();
        //System.out.println(Review.totalSentiment("McdonaldsReview.txt"));
        //System.out.println(Review.starRating("McdonaldsReview.txt"));
        System.out.println(Review.fakeReview("McdonaldsReview.txt"));
    }

    static void driverSentimentVal () {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.print("Insert ");
            String word = input.nextLine ();
            System.out.println ("Your word has the value of " + Review.sentimentVal (word));
            if (Review.sentimentVal(word) != 0) i++;
        }   
        input.close();
    }

   
}
