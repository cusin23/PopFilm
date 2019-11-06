/**
 * @author Manuel Cortina Martinez
 * SuperClass del ejercicio practico que contendrá al objeto Aplicación Software
 */
package com.jse.AplicacionSoftware;

public abstract class AplicacionSoftware {
	
	// Atributos
	
	private String lenguajeProgramacion;
	private boolean almacenaInfEnBD;
	private long lineasCodigo;
	private double complejidad;
	private int numCasosTest;
	
	// Constructor vacio
	// ¿Porqué el constructor da error al ponerle public delante?
	
	public AplicacionSoftware() {
	}
	
	// Constructor Sobrecargado
	// ¿Porqué este constructor ya sobrecargado admite el public delante?

	public AplicacionSoftware(String lenguajeProgramacion, boolean almacenaInfEnBD, long lineasCodigo,
			double complejidad, int numCasosTest) {
		super();
		this.lenguajeProgramacion = lenguajeProgramacion;
		this.almacenaInfEnBD = almacenaInfEnBD;
		
	// Estos sin los atributos que se cogen como base para crear el method
	// que nos pide el ejercicio.
		
		this.lineasCodigo = lineasCodigo;
		this.complejidad = complejidad;
		this.numCasosTest = numCasosTest;
	}
	
	// GETTER AND SETTER

	public String getLenguajeProgramacion() {
		return lenguajeProgramacion;
	}

	public void setLenguajeProgramacion(String lenguajeProgramacion) {
		this.lenguajeProgramacion = lenguajeProgramacion;
	}

	public boolean isAlmacenaInfEnBD() {
		return almacenaInfEnBD;
	}

	public void setAlmacenaInfEnBD(boolean almacenaInfEnBD) {
		this.almacenaInfEnBD = almacenaInfEnBD;
	}

	public long getLineasCodigo() {
		return lineasCodigo;
	}

	public void setLineasCodigo(long lineasCodigo) {
		this.lineasCodigo = lineasCodigo;
	}

	public double getComplejidad() {
		return complejidad;
	}

	public void setComplejidad(double complejidad) {
		this.complejidad = complejidad;
	}

	public int getNumCasosTest() {
		return numCasosTest;
	}

	public void setNumCasosTest(int numCasosTest) {
		this.numCasosTest = numCasosTest;
	}
	
	// TO STRING

	@Override
	public String toString() {
		return "AplicacionSoftware [lenguajeProgramacion=" + lenguajeProgramacion + ", almacenaInfEnBD="
				+ almacenaInfEnBD + ", lineasCodigo=" + lineasCodigo + ", complejidad=" + complejidad
				+ ", numCasosTest=" + numCasosTest + "]";
	}
	
	// METHODS
	
	// calcularCalidad que devuelva un double que representará la calidad 
	// del código y 	se calcula en base a los atributos complejidad, 
	// número líneas de código y número casos de test:
	// Creamos una variable con valor 100.0		
	// Si la complejidad está entre 11 y 20 entonces restamos 10		
	// Si la complejidad está entre 21 y 50 entonces restamos 30		
	// Si la complejidad es mayor que 50 restamos 50 							
	// Si el LoC es mayor de 50000 y el número de casos de test menor que 3000 
	// entonces restamos 20
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
