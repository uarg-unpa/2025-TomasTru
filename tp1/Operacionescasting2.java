package tp1;
public class Operacionescasting2 {

    public static void main(String [] args)

    {
      int valor1 = 3, valor2 = 5, resultadoEntero;
      double decimal1 = 7.5, decimal2 = 2.0, resultadoDecimal;

      resultadoEntero = valor2 / valor1;
      resultadoEntero = (int) (valor2 * decimal2) / (int) (decimal1 / valor1);
      resultadoDecimal = valor2 / valor1;
      resultadoDecimal = (double) valor2 / valor1;
      resultadoDecimal = (double) valor2 * decimal2 / (int) decimal1;
      resultadoDecimal = (double) valor2 * decimal2;
      resultadoDecimal = (double) (valor2 * decimal2) / (decimal1 * (int) decimal2);
      resultadoDecimal = valor2 * (int) decimal2;
      resultadoDecimal = (int) (valor2 * (int) decimal2);

      System.out.println("Resultado (valor2 / valor1) =" + resultadoEntero);
      System.out.println("Resultado ((int) (valor2 * decimal2) / (int) (decimal1 / valor1)) =" + resultadoEntero);
      System.out.println("Resultado (valor2 / valor1) =" + resultadoDecimal);
      System.out.println("Resultado ((double) valor2 / valor1) =" + resultadoDecimal);
      System.out.println("Resultado ((double) valor2 * decimal2 / (int) decimal1) =" + resultadoDecimal);
      System.out.println("Resultado ((double) valor2 * decimal2) =" + resultadoDecimal);
      System.out.println("Resultado ((double) (valor2 * decimal2) / (decimal1 * (int) decimal2)) =" + resultadoDecimal);
      System.out.println("Resultado (valor2 * (int) decimal2) =" + resultadoDecimal);
      System.out.println("Resultado ((int) (valor2 * (int) decimal2)) =" + resultadoDecimal);


    }
}
