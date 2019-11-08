package com.jse.main;

import com.jse.AplicacionWeb.AplicacionWebServiceImpl;

public class MainPruebasAplicacionSoftware {

	public static void main(String[] args) {
		AplicacionWebServiceImpl servicio1 = new AplicacionWebServiceImpl();
		servicio1.crearAplicacionWeb();
		System.out.println(servicio1.crearAplicacionWeb());
	}

}
