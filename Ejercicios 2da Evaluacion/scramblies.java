/*DESCRIPTION:
Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.

Notes:

Only lower case letters will be used (a-z). No punctuation or digits will be included.
Performance needs to be considered.
Examples
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False*/

//Solution
import java.util.HashMap;
import java.util.Map;

public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
      // Crea un HashMap para almacenar la frecuencia de cada número
        HashMap<Character, Integer> frecuenciaLetras1 = new HashMap<>();
        HashMap<Character, Integer> frecuenciaLetras2 = new HashMap<>();
        boolean result = false;
        char[] Str1 = str1.toCharArray();
        char[] Str2 = str2.toCharArray();
        
        // Recorre el array y actualiza la frecuencia en el HashMap
        for (char Letra : Str1) {
            int frecuencia1 = frecuenciaLetras1.getOrDefault(Letra, 0);
            frecuenciaLetras1.put(Letra, frecuencia1 + 1);
        }
        for(char Letra : Str2){
            int frecuencia2 = frecuenciaLetras2.getOrDefault(Letra, 0);
            frecuenciaLetras2.put(Letra, frecuencia2 + 1);
        }
        for(char clave : frecuenciaLetras2.keySet()){
            if(!frecuenciaLetras1.containsKey(clave)){ 
                result = false;
                System.out.println(clave);
                break;
                
            }else if(frecuenciaLetras1.get(clave)<(frecuenciaLetras2.get(clave))){
                result = false;
                break;
                
            }else if(frecuenciaLetras1.get(clave)>=(frecuenciaLetras2.get(clave))){
                result = true;
                System.out.println(clave);
            }
        }
      return result;
      }
      
  }