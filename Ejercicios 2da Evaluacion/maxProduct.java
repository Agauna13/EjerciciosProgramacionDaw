/*DESCRIPTION:
Introduction and Warm-up (Highly recommended)
Playing With Lists/Arrays Series
Task
Given an array/list [] of integers , Find the product of the k maximal numbers.

Notes
Array/list size is at least 3 .

Array/list's numbers Will be mixture of positives , negatives and zeros

Repetition of numbers in the array/list could occur.

Input >> Output Examples
maxProduct ({4, 3, 5}, 2) ==>  return (20)
Explanation:
Since the size (k) equal 2 , then the subsequence of size 2 whose gives product of maxima is 5 * 4 = 20 .
maxProduct ({8, 10 , 9, 7}, 3) ==>  return (720)
Explanation:
Since the size (k) equal 3 , then the subsequence of size 3 whose gives product of maxima is  8 * 9 * 10 = 720 .
maxProduct ({10, 8, 3, 2, 1, 4, 10}, 5) ==> return (9600)
Explanation:
Since the size (k) equal 5 , then the subsequence of size 5 whose gives product of maxima is  10 * 10 * 8 * 4 * 3 = 9600 .
maxProduct ({-4, -27, -15, -6, -1}, 2) ==> return (4)
Explanation:
Since the size (k) equal 2 , then the subsequence of size 2 whose gives product of maxima is  -4 * -1 = 4 .
maxProduct ({10, 3, -1, -27} , 3)  return (-30)
Explanation:
Since the size (k) equal 3 , then the subsequence of size 3 whose gives product of maxima is 10 * 3 * -1 = -30 .*/

//Solution
public class Solution
{
    public static long maxProduct(int[] numbers, int sub_size){
        System.out.println("sub size= " + sub_size);
        long resultado = 1;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < numbers.length - 1; i++) {
            swapped = false;
                for (j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = numbers[j];         
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;   
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for(i = numbers.length-1; sub_size > 0; sub_size--, i--){
          System.out.print("->" + numbers[i] +"\n");
          resultado*=numbers[i];
            
      }
        return resultado; // Do your magic!
    }
}