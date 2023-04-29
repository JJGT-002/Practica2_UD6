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
	
	public int multiplicacionIncrementada ( int factor1 , int limite ){

	    int factor2 = 1;

	    for ( int i = 0; i < limite ; i++ ){
	        factor2 = factor2 * factor1;
	    }

	    return factor2; 
	}
	
	public boolean isPar ( int numero ){

	    boolean esPar;

	    if ( numero % 2 == 0) {
	        esPar = true;
	    } else {
	        esPar = false;
	    }

	    return esPar;
	}


	public String divisionInfinita(int a){

	    String r = "";
	    int v = a;
	    int v1;

	    while ( v > 0) {
	        v1 = v % 2;
	        r = v1 + r;
	        v = v / 2;
	    }
	    return r;
	}

}