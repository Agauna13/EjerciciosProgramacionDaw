/* En pseudocódigo:

main{
	declaro array con longitud 5;
	
	array = funcion(parametro: array);
	
	for(i = 0; i menor a la longitud del array; sumamos 1 a cada iteracion){
		print(el contenido de la posicion del array resultante);
		}
		
		
	static tipoDato Funcion(array){
			inicializamos la vaiable random que nos da el numero;
			la imprimimos para cotejar;
			iteramos array de abajo arriba{
				metemos en cada indice del array el reultado de random % 10;
				reasignamos random como: random / 10;
			}
			return array;
		}
	*/

package programacion;

//dado un numero aleatorio, revertirlo insertando sus dígitos en un array.
public class Programacion {

    public static void main(String[] args){
      long[] arr= new long[5];
      arr = func(arr);
      for(int i = 0; i < arr.length; i++){
      System.out.print(" " + arr[i]);
    }
  }
  
  public static long[] func(long[] arr){
    long n =(long) (Math.random() * (99999 - 10000) + 10000);
      System.out.println(n);
    for(int i = 0; i < arr.length; i++){
      arr[i] = n % 10;
      n = n/10;
    }
    return arr;
    
  }
}