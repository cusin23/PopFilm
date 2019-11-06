/**
 * @author Manuel Cortina Martinez
 * documento en el que creamos la subclass aplicacionMobile que tiene como
 * Superclass a aplicacionSoftware.
 */
package com.jse.AplicacionMovil;

import java.util.Arrays;

import com.jse.AplicacionSoftware.AplicacionSoftware;

public class aplicacionMobile extends AplicacionSoftware {
	
	// Atributos
	
	
	private boolean hibrydTecnology;
	private String[] permisos;
	
	// En el array anterior habria que meter dentro de los permisos los nombres
	// de lo que permitimos por ejemplo: Cámara, micrófono, etc.
	
	
	// Constructor vacio
	
	public aplicacionMobile() {
	}
	
	// Constructor Sobrecargado

	public aplicacionMobile(boolean hibrydTecnology, String[] permisos) {
		super();
		this.hibrydTecnology = hibrydTecnology;
		this.permisos = permisos;
	}
	
	// GETTER AND SETTER

	public boolean isHibrydTecnology() {
		return hibrydTecnology;
	}

	public void setHibrydTecnology(boolean hibrydTecnology) {
		this.hibrydTecnology = hibrydTecnology;
	}

	public String[] getPermisos() {
		return permisos;
	}

	public void setPermisos(String[] permisos) {
		this.permisos = permisos;
	}
	
	// TO STRING

	@Override
	public String toString() {
		return "aplicacionMobile [hibrydTecnology=" + hibrydTecnology + ", permisos=" + Arrays.toString(permisos)
				+ ", getLenguajeProgramacion()=" + getLenguajeProgramacion() + ", isAlmacenaInfEnBD()="
				+ isAlmacenaInfEnBD() + ", getLineasCodigo()=" + getLineasCodigo() + ", getComplejidad()="
				+ getComplejidad() + ", getNumCasosTest()=" + getNumCasosTest() + "]";
	}
	
	// METHODS 
	
	//imprimir Stack tecnológico -> Método que imprime por consola 
	//“El lenguaje de programación utilizado es X, utiliza tecnología híbrida” 
	//si el atributo tecnología híbrida es true o si es false imprimir: 
	//“El lenguaje de programación utilizado es X, utiliza tecnología nativa”
	
	

	
	
	
	
	
	

}
