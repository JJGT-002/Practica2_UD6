package ed.jorge;

/**
 * Clase que se encarga de sumar, restar, multiplicar o dividir dos números
 * @author jota
 * @version 3.7
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
	
	/**
	 * Multiplica el numero entero factor2 por factor1, guardando el resultado en factor2
	 * @param factor1 numero entero por el que factor2 es multiplicado en cada iteración del bucle for
	 * @param limite numero entero que delimita las iteraciones del bucle for
	 * @return factor2 tras haber finalizado todas las iteraciones del bucle for
	 */
	public int multiplicacionIncrementada ( int factor1 , int limite ){

	    int factor2 = 1;

	    for ( int i = 0; i < limite ; i++ ){
	        factor2 = factor2 * factor1;
	    }

	    return factor2; 
	}
	
	/**
	 * Indica si el numero es par o impar
	 * @param numero numero entero por el que se obtiene el módulo de 2 para saber si es par o impar
	 * @return true si el numero es par y false si es impar
	 */
	public boolean isPar ( int numero ){

	    boolean esPar;

	    if ( numero % 2 == 0) {
	        esPar = true;
	    } else {
	        esPar = false;
	    }

	    return esPar;
	}

	/**
	 * Bucle infinito en el que mientras dividendo sea mayor que 0, dividendo guardará el resultado de la división de dividendo entre 2
	 * @param numero valor de dividendo antes de empezar el bucle
	 * @return r, aunque nunca devolverá r debido a que siempre se quedará dividiendo 1 / 1
	 */
	public String divisionInfinita(int numero){

	    String r = "";
	    int dividendo = numero;
	    int v1;

	    while ( dividendo > 0) {
	        v1 = dividendo % 2;
	        r = v1 + r;
	        dividendo = dividendo / 2;
	    }
	    return r;
	}

}