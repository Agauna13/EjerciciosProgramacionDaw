/*DESCRIPTION:
In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. Your task will be to return the sum of the numbers that occur only once.

For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15. Every other number occurs twice.

More examples in the test cases.*/

//Solution
import java.util.HashMap;
import java.util.Map;

class Solution{
    public static int repeats(int [] arr){
        Map<Integer, Integer> pares = new HashMap<>();
        int odd = 0;
        for(int i : arr){
            pares.put(i, pares.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : pares.entrySet()){
            if(entry.getValue() == 1){
                odd += entry.getKey();
            }
        }
        return odd;
      
    }
}