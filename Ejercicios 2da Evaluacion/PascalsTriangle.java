/*DESCRIPTION:
In mathematics, Pascal's triangle is a triangular array of the binomial coefficients expressed with formula
k!(n−k)!
n!
​
 
where n denotes a row of the triangle, and k is a position of a term in the row.

Pascal's Triangle

You can read Wikipedia article on Pascal's Triangle for more information.

Task
Write a function that, given a depth n, returns n top rows of Pascal's Triangle flattened into a one-dimensional list/array.

Example:
n = 1: [1]
n = 2: [1,  1, 1]
n = 4: [1,  1, 1,  1, 2, 1,  1, 3, 3, 1]
Note
Beware of overflow. Requested terms of a triangle are guaranteed to fit into the returned type, but depending on seleced method of calculations, intermediate values can be larger.*/


//Solution
import java.util.ArrayList;

public class PascalsTriangle {
    public static long[] generate(int level) {
      ArrayList<Long> result = new ArrayList<>();
        for (int i = 0; i < level; i++) {
            long element = 1L;
            for (int j = 0; j <= i; j++) {
                result.add(element);
                element = element * (i - j) / (j + 1);

            }
          }

          long[] Result = new long[result.size()];
          for(int i = 0; i<Result.length; i++){
            Result[i]= result.get(i);
          }
          return Result;
    }
}