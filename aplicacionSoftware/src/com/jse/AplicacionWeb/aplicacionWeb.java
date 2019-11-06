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
	}

	// Constructor Sobrecargado

	public aplicacionWeb(String frameworkBackendName, String frameworkFrontendName) {
		super();
		this.frameworkBackendName = frameworkBackendName;
		this.frameworkFrontendName = frameworkFrontendName;
	}

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

	// M�TODO A CREAR

	// imprimir Stack tecnol�gico -> M�todo que imprime por consola
	// �El lenguaje de programaci�n utilizado es X, el framework de backend es Y
	// y el framework de frontend es Z�. En X, Y, Z habr� que poner los valores de
	// los atributos correspondientes. Utilizar la funci�n concat para imprimir la
	// cadena total.
	
	

}