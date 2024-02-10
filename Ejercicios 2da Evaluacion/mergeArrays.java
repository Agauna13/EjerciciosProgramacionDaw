/*DESCRIPTION:
Write a function that merges two sorted arrays into a single one. The arrays only contain integers. Also, the final outcome must be sorted and not have any duplicate.*/

//Solution
import java.util.*;
import java.util.Arrays;
public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {
		    Arrays.sort(first);
        Arrays.sort(second);
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i< first.length; i++){
                result.add(first[i]);
                System.out.println(first[i]);
        }
        for(int i = 0; i< second.length; i++){
            result.add(second[i]);
            System.out.println("second" + second[i]);
        }
        result.sort(Comparator.naturalOrder());
        for(int i = 1; i<result.size(); i++){
            if(result.get(i) == result.get(i-1)){
                result.remove(i);
            }
        }
        
        Integer[] fin = new Integer[result.size()];
        fin = result.toArray(fin);
        int[] Fin = new int[fin.length];
    
        for(int i =0; i<fin.length; i++){
            Fin[i] = fin[i];
        }
        return Fin;
    
	}
}