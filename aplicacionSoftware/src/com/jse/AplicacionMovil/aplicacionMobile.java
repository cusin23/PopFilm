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
		super();
	}
	
	// Constructor Sobrecargado

	public aplicacionMobile(String lenguajeProgramacion, boolean almacenaInfEnBD, long lineasCodigo, double complejidad, int numCasosTest) {
		super(lenguajeProgramacion, almacenaInfEnBD, lineasCodigo, complejidad, numCasosTest);
		
	}
	
	// METHODS 
	
		//imprimir Stack tecnológico -> Método que imprime por consola 
		//“El lenguaje de programación utilizado es X, utiliza tecnología híbrida” 
		//si el atributo tecnología híbrida es true o si es false imprimir: 
		//“El lenguaje de programación utilizado es X, utiliza tecnología nativa”
		
		
		public String imprimirStackTecnologico() {
			if (hibrydTecnology = true) {
				return "El lenguaje de programacion utilizado es ".concat(getLenguajeProgramacion()) + ". Utiliza tecnología híbrida.";
				
			} else if(hibrydTecnology = false) {
				return "El lenguaje de programación utilizado es ".concat(getLenguajeProgramacion()) + ". Utiliza tecnología nativa.";
			}
			
			return imprimirStackTecnologico();
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
}
