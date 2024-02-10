/*DESCRIPTION:
Add two logs with base X, with the value of A and B. Example log A + log B where the base is X.*/

//Solution
public class EasyLogs {

  public static double logs(double x, double a, double b) {
    double result = Math.log(a*b)/Math.log(x);
    return result;
  }

}