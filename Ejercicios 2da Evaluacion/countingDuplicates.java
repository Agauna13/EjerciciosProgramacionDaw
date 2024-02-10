/*DESCRIPTION:
Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice*/

//Solution
public class CountingDuplicates {
  public static int duplicateCount(String text) {
        String descartes = ""; 
        StringBuilder builder = new StringBuilder(descartes);
        int contador = 0;
        int repeticiones = 0;
        String TEXT = text.toUpperCase();

        for (int i = 0; i < TEXT.length(); i++) {
            String descartesVerdadero = builder.toString();           
            if (contador > 0) {
                repeticiones++;
            }
            contador = 0;
            char L = TEXT.charAt(i);
            if (descartesVerdadero.contains(String.valueOf(L))){
                continue;
            }
            for (int j = i + 1; j < TEXT.length(); j++) {
                if (L == TEXT.charAt(j) ) {
                    builder.append(L);
                    contador++;
                    break;
                }
            }
        }
    return repeticiones;
  }
}