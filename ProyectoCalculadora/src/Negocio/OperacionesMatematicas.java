package Negocio;

public class OperacionesMatematicas {
	private Integer num1 ;
	private Integer num2;
	
	public OperacionesMatematicas(Integer num1 , Integer num2) {
		this.num1 = num1;
		this.num2= num2;
	}
	
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

	
	@Override
	public String toString() {
		return " " + num1 + "  " + num2 ;
 	} 
	

}
