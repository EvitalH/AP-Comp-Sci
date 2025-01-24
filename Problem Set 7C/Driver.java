
/**
 * Evital Heyl
 * 1-3
 * Problem Set 7C
 */

import java.util.ArrayList;
public class Driver {
    
    public static void main (String[] args) {
        ArrayList<Integer> one = new ArrayList<Integer>();
        one.add(2);
        one.add(2);
        one.add(3);
        
        ArrayList<Integer> two = new ArrayList<Integer>();
        two.add(1);
        two.add(9);
        two.add(6);
        two.add(4);
        two.add(3);
        
        System.out.println (BigIntsSum(one ,two));
    }
    
    public static ArrayList<Integer>  primeNumbers ( int n ) {
        int p = 2;
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        
        for (int j = 2; j <= n; j++) {
            sequence.add(j);
        }
        
        for (int i = 0; i < sequence.size(); i++) {
            for (int s = i + 1; s < sequence.size(); s++) {
                if (sequence.get(s) % sequence.get(i) == 0) {
                    sequence.remove(s);
                    s--;
                }
            }
        }
        return sequence;
    }
    
    public static String sum (int n) {
        ArrayList<Integer> list = primeNumbers(n);
        int first = list.get(0);
        int second = list.get(1);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == n) {
                    first = list.get(i);
                    second = list.get(j);
                    break;
                }
            }
        }
        
        return n + " = " + first + " + " + second;
    }
    
    public static ArrayList<Integer> BigIntsSum (ArrayList<Integer> a,ArrayList<Integer> b ) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        boolean carry = false;
        
        for (int i = 1; i <= a.size() && i <= b.size(); i++) {
            
            int sum = a.get(a.size() - i) + b.get(b.size() - i);
            if(carry) sum ++;
            
            if (sum > 9) {
                carry = true;
                sum = sum -10;
            } else carry = false;
            
            answer.add(0, sum);
        }
        
        
        
        ArrayList<Integer> largest;
        if(a.size() >= b.size()) largest = a;
        else largest = b;
        
        for (int j = Math.abs(a.size() - b.size()) - 1; j >= 0; j--) {
            int didget = largest.get(j);
            if(carry) didget++;
            
            if (didget > 9) {
                carry = true;
                didget = didget - 10;
            } else carry = false;
            
            answer.add(0, didget);          
        }
        
        if(carry) answer.add(0, 1);
        
        return answer;
    }
    
    
 
}
