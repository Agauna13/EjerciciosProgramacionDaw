/*DESCRIPTION:
Acknowledgments:
I thank yvonne-liu for the idea and for the example tests :)

Description:
Encrypt this!

You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

Your message is a string containing space separated words.
You need to encrypt each word in the message using the following rules:
The first letter must be converted to its ASCII code.
The second letter must be switched with the last letter
Keepin' it simple: There are no special characters in the input.
Examples:
Kata.encryptThis("Hello") => "72olle"
Kata.encryptThis("good") => "103doo"
Kata.encryptThis("hello world") => "104olle 119drlo"*/

//Solution
public class Kata {
    public static String encryptThis(String text) {
        String[] enigma = text.split(" ");
        String encrypt = "";        
        if(text.length() == 0)return encrypt;
        for(int i = 0; i<enigma.length; i++){
          if(i>0)encrypt+= " ";
            for(int j = 0; j<enigma[i].length(); j++){
                if(j==0){
                    encrypt += (int)enigma[i].charAt(0);
                }else if(j==1){
                    encrypt += enigma[i].charAt(enigma[i].length()-1);
                    
                }else if(j==enigma[i].length()-1){
                    encrypt += enigma[i].charAt(1);
                }else{
                    encrypt += enigma[i].charAt(j);
                }
                
            }
            
            
        }
      return encrypt;
    }
}