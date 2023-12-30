package Negocio;

public class OperacionesMatematicas {
	
	public int Sumar (int num1 , int num2) {
		return num1 + num2;
	}
	public int Restar (int num1 , int num2) {
		return num1 - num2;
	}
	
	public int multiplicar (int num1 , int num2) {
		return num1 * num2;
	}
	public int dividir (int num1 , int num2) {
		if (num2 == 0 ) {
			throw new IllegalArgumentException ("no se puede dividir por 0, es un error");
		}
		return num1 / num2;
	}

	
	

}
