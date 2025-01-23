
/**
 * Evital Heyl
 * 1-3
 * Problem Set 7C
 */

import java.util.ArrayList;
public class Driver {
    
    public static void main (String[] args) {
        ArrayList<Integer> one = new ArrayList<Integer>();
        one.add(1);
        one.add(2);
        one.add(3);
        System.out.println (BigIntsSum(one ,one));
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
        answer.add(0);
        boolean carry = false;
        for (int i = 1; i < a.size() || i < b.size(); i++) {
            
            int sum = a.get(a.size() - i) + b.get(b.size() - i);
            if(carry) sum ++;
            
            if (sum > 9) {
                carry = true;
                sum = sum -10;
            }
            
            answer.set(0, sum);
        }
        
        return answer;
    }
 
}
