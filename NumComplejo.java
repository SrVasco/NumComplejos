package PaqComplejos;

public class NumComplejo {
	//atributos
	private double real;
	private double imaginario;
	
	//constructores
	public NumComplejo () {
		real = 0;
		imaginario = 0;
	}
	public NumComplejo(int real, int imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	public NumComplejo(double real, double imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	public NumComplejo(NumComplejo otro ) {
		this.real = otro.real;
		this.imaginario = otro.imaginario;
	}
	
	//getter y setter
	public double getReal() {
		return real;
	}
	public double getImaginario() {
		return imaginario;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public void setImaginario (double imaginario) {
		this.imaginario = imaginario;
	}
	
	//metodos
	public NumComplejo sumar(NumComplejo sumar) {
		double sumaReal =  this.real + sumar.real;
		double sumaImaginario = this.imaginario + sumar.imaginario;
		return new NumComplejo(sumaReal, sumaImaginario);
	}
	public NumComplejo restar(NumComplejo restar) {
		double restaReal =  this.real - restar.real;
		double restaImaginario = this.imaginario - restar.imaginario;
		return new NumComplejo(restaReal, restaImaginario);
	}
	public NumComplejo mult(NumComplejo mult) {
		double multReal =  this.real * mult.real;
		double multImaginario = this.imaginario * mult.imaginario;
		return new NumComplejo(multReal, multImaginario);
	}
	public NumComplejo multesc(int real) {
		double multEscReal =  this.real * real;
		double multEscImaginario = this.imaginario * real;
		return new NumComplejo(multEscReal, multEscImaginario);
	}
	public boolean compara(NumComplejo compara) {
		if(this.real==compara.real && this.imaginario==compara.imaginario) {
			return true;
		}else {
			return false;
		}
	}
}
