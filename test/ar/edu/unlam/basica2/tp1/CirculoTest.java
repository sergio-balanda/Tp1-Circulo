package ar.edu.unlam.basica2.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void testCrearCirculoDeRadioDos() {
		Circulo miCirculo = new Circulo(2.0);
		Double esperado = 2.0;
		assertEquals(esperado, miCirculo.getRadio());
	}
	@Test
	public void testCrearCirculoDeRadioTresComaSiete() {
		Circulo miCirculo = new Circulo(3.7);
		Double esperado = 3.7;
		assertEquals(esperado, miCirculo.getRadio());
	}
	@Test
	public void testCrearCirculoDeRadioCinco() {
		Circulo miCirculo = new Circulo(5.0);
		Double esperado = 5.0;
		assertEquals(esperado, miCirculo.getRadio());
	}
	@Test
	public void testCrearCirculoDeRadioDiezComaNueve() {
		Circulo miCirculo = new Circulo(10.9);
		Double esperado = 10.9;
		assertEquals(esperado, miCirculo.getRadio());
	}
	@Test
	public void testCrearCirculoDeRadioNueveComaOcho() {
		Circulo miCirculo = new Circulo(9.8);
		Double esperado = 9.8;
		assertEquals(esperado, miCirculo.getRadio());
	}
	@Test
	public void testComprobarElPerimetroDelCirculoNueveComaOcho() {
		Circulo miCirculo = new Circulo(9.8);
		Double esperado = 61.57;
		assertEquals(esperado, miCirculo.calcularPerimetro(),0.1);
	}
	@Test
	public void testCrearCirculoDeRadioDieciseisComaSeis() {
		Circulo miCirculo = new Circulo(16.6);
		Double esperado = 16.6;
		assertEquals(esperado, miCirculo.getRadio());
	}
	@Test
	public void testComprobarElPerimetroDelCirculoDieciseisComaSeis() {
		Circulo miCirculo = new Circulo(16.6);
		Double esperado = 104.30;
		assertEquals(esperado, miCirculo.calcularPerimetro(),0.1);
	}

}
