/**
 * @author Manuel Cortina Martinez
 * documento en el que creamos la subclass aplicacionIoT que tiene como
 * Superclass a aplicacionSoftware.
 */
package com.jse.AplicacionIoT;

import com.jse.AplicacionSoftware.AplicacionSoftware;

public class aplicacionIoT extends AplicacionSoftware {
	
	// Atributos 
	
	private boolean graphicalInterface;
	private boolean wifiAccess;
	private EenumProtocol enumeracion;
	
	// Constructor vacio 
	
	public aplicacionIoT() {
	}
	
	// Constructor Sobrecargado

	public aplicacionIoT(boolean graphicalInterface, boolean wifiAccess, EenumProtocol enumeracion) {
		super();
		this.graphicalInterface = graphicalInterface;
		this.wifiAccess = wifiAccess;
		this.enumeracion = enumeracion;
	}
	
	// METHODS 
	
		// Imprimir Stack tecnológico -> Método que imprime por consola 
		// “El lenguaje de programación utilizado es X, el protocolo utilizado es Y”. 
		// Reeemplazar X e Y por los valores correspondientes.

		
		public String imprimirStackTecnologico() {
			
			enumeracion = getEnumeracion();
			
			switch(enumeracion) {
			
			case HTTP:
						//System.out.println(getEnumeracion());
				break;
			
			case AMQP:
						//System.out.println(getEnumeracion());
				break;
				
			case MQTT:
						//System.out.println(getEnumeracion());
				break;
			}
			
			return "El lenguaje de programacion utilizado es ".concat(getLenguajeProgramacion())
					+ " y el protocolo utilizado es " + getEnumeracion() + ".";
			}
	
	// GETTER AND SETTER

	public boolean isGraphicalInterface() {
		return graphicalInterface;
	}

	public void setGraphicalInterface(boolean graphicalInterface) {
		this.graphicalInterface = graphicalInterface;
	}

	public boolean isWifiAccess() {
		return wifiAccess;
	}

	public void setWifiAccess(boolean wifiAccess) {
		this.wifiAccess = wifiAccess;
	}

	public EenumProtocol getEnumeracion() {
		return enumeracion;
	}

	public void setEnumeracion(EenumProtocol enumeracion) {
		this.enumeracion = enumeracion;
	}
	
	// TO STRING

	@Override
	public String toString() {
		return "aplicacionIoT [graphicalInterface=" + graphicalInterface + ", wifiAccess=" + wifiAccess
				+ ", enumeracion=" + enumeracion + ", getLenguajeProgramacion()=" + getLenguajeProgramacion()
				+ ", isAlmacenaInfEnBD()=" + isAlmacenaInfEnBD() + ", getLineasCodigo()=" + getLineasCodigo()
				+ ", getComplejidad()=" + getComplejidad() + ", getNumCasosTest()=" + getNumCasosTest() + "]";
	}
	
	
	
	
}