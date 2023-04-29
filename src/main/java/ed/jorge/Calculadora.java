package ed.jorge;

/**
 * Clase que se encarga de sumar, restar, multiplicar o dividir dos números
 * @author jota
 * @version 3.7
 *@
 */
public class Calculadora {
		
	/**
	 * Realiza la suma a + b
	 * @param a número entero a sumar
	 * @param b número entero a sumar
	 * @return la suma de a + b
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Realiza la resta de a- b
	 * @param a número entero a restar
	 * @param b número entero a restar
	 * @return la resta de a - b
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Multiplica a * b
	 * @param a número entero
	 * @param b número entero
	 * @return el resultado de multiplicar a * b
	 */
	public int multiplica(int a, int b){
		return a * b;
	}
	
	/**
	 * Divide a / b
	 * @param a número entero
	 * @param b número entero
	 * @return el resultado de la división de a / b
	 * @exception ArithmeticException si se intenta dividir 0 / 0
	 */
	public int diveix(int a, int b) {
		return a / b;
	}

}