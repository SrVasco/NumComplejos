package PaqComplejos;

public class numComplejosMain {

	public static void main(String[] args) {
		
		NumComplejo num1 = new NumComplejo();
		NumComplejo num2 = new NumComplejo();
		
		num1.setImaginario(4);
		num2.setImaginario(6);
		num1.setReal(2);
		num1.setReal(1);
		
		NumComplejo suma = num1.sumar(num2);
		System.out.println("Suma= "+suma);
		NumComplejo resta = num1.restar(num2);
		System.out.println("Resta= "+resta);
		NumComplejo mult = num1.mult(num2);
		System.out.println("Multiplicación= "+mult);
		NumComplejo multesc = num1.multesc(3);
		System.out.println("Multiplicación por escalar= "+multesc);
		boolean compara = num1.compara(num2);
		System.out.println("Booleano= "+compara);
	}

}
