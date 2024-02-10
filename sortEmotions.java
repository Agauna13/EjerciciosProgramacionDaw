/*Emotional Sort ( ︶︿︶)
You'll have a function called "sortEmotions" that will return an array of emotions sorted. It has two parameters, the first parameter called "arr" will expect an array of emotions where an emotion will be one of the following:

:D -> Super Happy
:) -> Happy
:| -> Normal
:( -> Sad
T_T -> Super Sad
Example of the array:[ 'T_T', ':D', ':|', ':)', ':(' ]

And the second parameter is called "order", if this parameter is true then the order of the emotions will be descending (from Super Happy to Super Sad) if it's false then it will be ascending (from Super Sad to Super Happy)

Example if order is true with the above array: [ ':D', ':)', ':|', ':(', 'T_T' ]

Super Happy -> Happy -> Normal -> Sad -> Super Sad
If order is false: [ 'T_T', ':(', ':|', ':)', ':D' ]

Super Sad -> Sad -> Normal -> Happy -> Super Happy
Example:

arr = [':D', ':|', ':)', ':(', ':D']
sortEmotions(arr, true) // [ ':D', ':D', ':)', ':|', ':(' ]
sortEmotions(arr, false) // [ ':(', ':|', ':)', ':D', ':D' ]
More in test cases!

Notes:

The array could be empty, in that case return the same empty array ¯\_( ツ )_/¯
All emotions will be valid*/


//Solution

import java.util.*;

public class Solution {

    public static String[] sortEmotions(boolean order,String[] emotions) {
        if(emotions.length<1)return emotions;
        String temp = "";
        String[] faces = {":D", ":)", ":|", ":(", "T_T"};
        String[] facesInv = {"T_T", ":(", ":|", ":)", ":D"};
        
        String[] dir = order ? faces : facesInv;       
        
        Map<String, Integer> mapa = new HashMap<>();
        int indice = 1;
        for (String face : dir) {

            mapa.put(face, indice);
            indice++;
        }
        
        for (int i = 0; i < emotions.length; i++) {
            for (int j = 1; j < emotions.length - i; j++) {
                if(mapa.get(emotions[j]) < mapa.get(emotions[j-1])) {
                    temp = emotions[j];
                    emotions[j] = emotions[j-1];
                    emotions[j-1] = temp;
                    
                }
            }
        }
      return emotions;
    }

}