/*DESCRIPTION:
Don't give me five!
In this kata you get the start number and the end number of a region and should return the count of all numbers except numbers with a 5 in it. The start and the end number are both inclusive!

Examples:

1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12
The result may contain fives. ;-)
The start number will always be smaller than the end number. Both numbers can be also negative!

I'm very curious for your solutions and the way you solve it. Maybe someone of you will find an easy pure mathematics solution.*/

//Solucion
public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
    int result = 0;
    for (int i = start; i <= end; i++) {
            int n = i;
            int contiene = 0;
            while (n != 0) {

                if (n % 10 == 5 || n%10 == -5) {
                    contiene += 1;
                    break;
                } else {
                    n = n / 10;
                    contiene = 0;
                }
            }
            if (contiene == 0) {
                result++;
            }

        }
    return result;
  }
}