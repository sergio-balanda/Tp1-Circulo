package ar.edu.unlam.basica2.tp1;

public class Circulo {
	private Double radio;
	
	public Circulo(Double radio){
		this.radio=radio;
	}

	public Double getRadio() {
		return radio;
	}

	public Double calcularPerimetro() {
		return this.radio=2*Math.PI*radio;
	}
	
}
