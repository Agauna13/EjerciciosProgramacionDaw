/*DESCRIPTION:
Snail Sort
Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]
For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]

NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.

NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].*/

//Solution
public class Snail {

    public static int[] snail(int[][] array) {
     int[] snail = new int[array[0].length * array.length];
        int Snail = 0;
      
      while(Snail<array[0].length*array.length){
        int top = 0, left = 0, dir = 0;
        int right = array.length - 1, down = array.length - 1;
        
        while (top <= down && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    snail[Snail] = array[top][i];
                    Snail++;
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    snail[Snail] = array[i][right];
                    Snail++;

                }
                right--;

            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    snail[Snail] = array[down][i];
                    Snail++;

                }
                down--;
              

            } else if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    snail[Snail] = array[i][left];
                    Snail++;

                }
                left++;

            }
            
            dir = (dir + 1) % 4;

        }
        }
        
        return snail;
   } 
}