/*DESCRIPTION:
Implement String#hex_number? (in Java StringUtils.isHexNumber(String)), which should return true if given object is a hexadecimal number, false otherwise.

Hexadecimal numbers consist of one or more digits from range 0-9 A-F (in any case), optionally prefixed by 0x.*/

//Solution
public class StringUtils {
  
  public static boolean isHexNumber(String s) {
    return s.matches("^(0[xX])?[A-Fa-f0-9]+$");

    
  }
}