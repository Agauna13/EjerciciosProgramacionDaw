/*DESCRIPTION:
An orderly trail of ants is marching across the park picnic area.

It looks something like this:

..ant..ant.ant...ant.ant..ant.ant....ant..ant.ant.ant...ant..
But suddenly there is a rumour that a dropped chicken sandwich has been spotted on the ground ahead. The ants surge forward! Oh No, it's an ant stampede!!

Some of the slower ants are trampled, and their poor little ant bodies are broken up into scattered bits.

The resulting carnage looks like this:

...ant...ant..nat.ant.t..ant...ant..ant..ant.anant..t
Can you find how many ants have died?

Notes
When in doubt, assume that the scattered bits are from the same ant. e.g. 2 heads and 1 body = 2 dead ants, not 3*/

//Solution
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Dinglemouse {

  public static int deadAntCount(final String ants) {
    System.out.println(ants);
    int contador = 0;
    int contadorT = 0;
    int contadorN = 0;
    if(ants == null)return contador;
    String Ants = ants.toLowerCase();
    Ants = ants.replaceAll("ant", "");
    System.out.println(Ants);
    for(int i = 0; i<Ants.length();i++){
      if(Ants.charAt(i) == 'a'){
        contador++;
      }
      if(Ants.charAt(i) == 't'){
        contadorT++;
      }
      if(Ants.charAt(i) == 'n'){
        contadorN++;
      }

      
    }
    return Math.max(Math.max(contador, contadorN), contadorT);
    
  }

}