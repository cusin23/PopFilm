/**
 * @author Manuel Cortina Martinez
 * documento en el que creamos la subclass aplicacionWeb que tiene como
 * Superclass a aplicacionSoftware.
 */
package com.jse.AplicacionWeb;

import com.jse.AplicacionSoftware.AplicacionSoftware;

public class aplicacionWeb extends AplicacionSoftware {

	// Atributos

	private String frameworkBackendName;
	private String frameworkFrontendName;

	// Constructor vacio

	public aplicacionWeb() {
		super();
	}

	// Constructor Sobrecargado

	public aplicacionWeb(String lenguajeProgramacion, boolean almacenaInfEnBD, long lineasCodigo, double complejidad, int numCasosTest, String frameworkFrontEndName, String frameworkBackEndName) {
		super(lenguajeProgramacion, almacenaInfEnBD, lineasCodigo, complejidad, numCasosTest);
		
	}

	// METHODS

	// imprimir Stack tecnológico -> Método que imprime por consola
	// “El lenguaje de programación utilizado es X, el framework de backend es Y
	// y el framework de frontend es Z”. En X, Y, Z habrá que poner los valores de
	// los atributos correspondientes. Utilizar la función concat para imprimir la
	// cadena total.

	public String imprimirStackTecnologico() {
		return "El lenguaje de programación utilizado es: ".concat(getLenguajeProgramacion()) + ". "
				+ "El framework de backend es: ".concat(frameworkBackendName) + ". "
				+ "El framework de frontend es: ".concat(frameworkFrontendName) + ".";
	}
	
	// Este metodo y su implementacion desde la interface no lo tengo del todo claro, esta pendiente de revisión.
	
//	@Override
//	public String crearAplicacionWeb() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	// GETTER AND SETTER

	public String getFrameworkBackendName() {
		return frameworkBackendName;
	}

	public void setFrameworkBackendName(String frameworkBackendName) {
		this.frameworkBackendName = frameworkBackendName;
	}

	public String getFrameworkFrontendName() {
		return frameworkFrontendName;
	}

	public void setFrameworkFrontendName(String frameworkFrontendName) {
		this.frameworkFrontendName = frameworkFrontendName;
	}

	// TO STRING

	@Override
	public String toString() {
		return "aplicacionWeb [frameworkBackendName=" + frameworkBackendName + ", frameworkFrontendName="
				+ frameworkFrontendName + ", getLenguajeProgramacion()=" + getLenguajeProgramacion()
				+ ", isAlmacenaInfEnBD()=" + isAlmacenaInfEnBD() + ", getLineasCodigo()=" + getLineasCodigo()
				+ ", getComplejidad()=" + getComplejidad() + ", getNumCasosTest()=" + getNumCasosTest() + "]";
	}

	

}
