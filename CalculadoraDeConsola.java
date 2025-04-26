package miercoles;


import java.util.Scanner;

public class CalculadoraDeConsola {
	
	/* metodo para pedir números y validar si es real o no
	 * @return se devuelve el número ingresado por el usuario
	 */
		public static double leerNumeros(String mensaje, Scanner sc) {
			
			System.out.println(mensaje);
			
	   double numero = sc.nextDouble();
	   
			if (numero % 1 == 0) {
				System.out.println(" No es un real ");
			} else {
				System.out.println(" Es un real");
			}
			return numero;
		}
		
		/* Método para leer las operaciones seleccionadas por el usuario
		 * @throw el método lanzará una excepción si no se ingresa un símbolo correcto
		 * @return devuelve el símbolo que se haya escogido
		 */
			public static String leerOperacion(Scanner sc){
				
				String simbolo = sc.next();
				
		          switch (simbolo) {
		          case "+":
		        	  System.out.println(" Opción escogida correctamente");
		        	  break;
		          case "-":
		        	  System.out.println(" Opción escogida correctamente");
		               break;
		          case "*":
		        	  System.out.println(" Opción escogida correctamente");
		        	   break;
		          case "/":
		        	  System.out.println(" Opción escogida correctamente");
		        	  break;
		        	 default: 
		        		 System.out.println(" escoge una opción valida");
		        		 throw new ArithmeticException(" Simbolo inválido");
		          }
				return simbolo;
			}
			
			/*Métodos para hacer los calculos de la operación escogida
			 * @throw Mostrará una excepción si se intenta dividir por 0
			 * @return Cada método regresará el resultado de su símbolo ( + , -, ...)
			 */
				public static double calcularDivision(double a, double b) {
					
					if (b == 0) {
					throw new ArithmeticException("no se puede dividir entre 0");
					} 
					return a/b;
				}
				
			 public static double calcularSuma(double a , double b) {
				return a+b;
			}
			 
			 public static double calcularResta(double a, double b) {
				 return a-b;
			 }
			 
			 public static double calcularMultiplicacion(double a, double b) {
				 return a*b;
			 }
			 
	
	
	
                   //main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double num1 = leerNumeros("ingrese un numero", sc);
	    double num2 = leerNumeros("ingrese un numero", sc);
   
		System.out.println(" ingrese una operación ");

		String operacion = leerOperacion(sc);
		
		switch (operacion) {
		case "+": 
		  double result = calcularSuma(num1, num2);
		  System.out.println( "El resultado de la suma es " + result);
			break;
		case "-":
			double resultRest = calcularResta(num1, num2);
			System.out.println(" El resultado de la resta es: " + resultRest);
			break;
		case "*":
			double resultMulti = calcularMultiplicacion(num1, num2);
			System.out.println(" El resultado de la resta es: " + resultMulti);
			break;
		case "/":
			double resultDivi = calcularDivision(num1, num2);
			System.out.println(" El resultado de la división es: " + resultDivi);
			break;
		}
		sc.close();	
	}
}
