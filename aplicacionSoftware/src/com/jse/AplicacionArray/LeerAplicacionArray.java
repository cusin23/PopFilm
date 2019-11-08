/**
 * @author Manuel Cortina Martinez
 * Crear una clase LeerAplicacionArray
 * Preguntar por consola qué tipo de aplicación se quiere crear, utilizando un número entero, por ejemplo:
 * Si el usuario introduce 1 entonces le pedimos datos para 2 objetos de tipo Aplicación Web y almacenarlos en un array
 * Si el usuario introduce 2 entonces le pedimos datos para 2 objetos de tipo Aplicación Mobile y almacenarlos en un array
 * Si el usuario introduce 3 entonces le pedimos datos para 2 objetos de tipo Aplicación Iot y almacenarlos en un array
 * Imprimir el array por consola
 */



package com.jse.AplicacionArray;

import java.util.Scanner;

import com.jse.AplicacionIoT.aplicacionIoT;
import com.jse.AplicacionMovil.aplicacionMobile;
import com.jse.AplicacionWeb.aplicacionWeb;

public class LeerAplicacionArray{
	

public static void main(String[] args) {
	System.out.println("");
	System.out.println("Seleccione una opcion");
	System.out.println("1 - Aplicación Web");
	System.out.println("2 - Aplicacion Mobile");
	System.out.println("3 - AplicacionIoT");
	
	int tipoAplicacion;
	Scanner teclado = new Scanner(System.in);
	tipoAplicacion = teclado.nextInt();
	
	switch(tipoAplicacion) {
	
	case 1: 
		System.out.println("");
		
		aplicacionWeb[] nuevaApp = new aplicacionWeb[2];
		
		for (int i = 0; i < nuevaApp.length; i++) {
			if (i != 0) {
				System.out.println("");
				System.out.println("");
			}
			
			System.out.println("Pedimos el lenguaje de programacion");
			String lenguajeProgramacion = teclado.next();
			
			System.out.println("Persistente");
			Boolean almacenaInfEnBD = teclado.nextBoolean();
			
			System.out.println("Lineas de código");
			long lineasCodigo = teclado.nextLong();
			
			System.out.println("Complejidad");
			double complejidad = teclado.nextDouble();
			
			System.out.println("Número de casos test");
			int numCasosTest = teclado.nextInt();
			
			System.out.println("Framework del frontEnd");
			String frameworkFrontEndName = teclado.next();
			
			System.out.println("Framework del backEnd");
			String frameworkBackEndName = teclado.next();
			
			aplicacionWeb AplicacionWeb1 = new aplicacionWeb (lenguajeProgramacion,almacenaInfEnBD,lineasCodigo,complejidad,numCasosTest,frameworkFrontEndName,frameworkBackEndName);
			
			nuevaApp[i] = AplicacionWeb1;
		}
		
		for (int j = 0; j < nuevaApp.length; j++) {
			System.out.println(nuevaApp[j]);
		}
		//teclado.close();
		break;
		
		case 2:
			System.out.println("");

			aplicacionMobile[] nuevoMobile = new aplicacionMobile[2];

			for (int i = 0; i < nuevoMobile.length; i++) {
				if (i != 0) {
					System.out.println("");
					System.out.println("");
				}

				System.out.println("Pedimos el lenguaje de programacion");
				String lenguajeProgramacion = teclado.next();

				System.out.println("Persistente");
				Boolean almacenaInfEnBD = teclado.nextBoolean();

				System.out.println("Lineas de código");
				long lineasCodigo = teclado.nextLong();

				System.out.println("Complejidad");
				double complejidad = teclado.nextDouble();

				System.out.println("Número de casos test");
				int numCasosTest = teclado.nextInt();

//				System.out.println("Usa tecnología híbrida");
	//			String frameworkFrontEndName = teclado.next();
			
		//		System.out.println("Framework del backEnd");
			//	String frameworkBackEndName = teclado.next();

				aplicacionMobile aplicacionMobile1 = new aplicacionMobile(lenguajeProgramacion, almacenaInfEnBD, lineasCodigo,
						complejidad, numCasosTest);

				nuevoMobile[i] = aplicacionMobile1;
			}

			for (int j = 0; j < nuevoMobile.length; j++) {
				System.out.println(nuevoMobile[j]);
			}
			//teclado.close();
			break;
			
		case 3: 
			System.out.println("");
			
			aplicacionIoT[] nuevoIoT = new aplicacionIoT[2];
			
			for (int i = 0; i < nuevoIoT.length; i++) {
				if (i != 0) {
					System.out.println("");
					System.out.println("");
				}
				
				System.out.println("Pedimos el lenguaje de programacion");
				String lenguajeProgramacion = teclado.next();
				
				System.out.println("Persistente");
				Boolean almacenaInfEnBD = teclado.nextBoolean();
				
				System.out.println("Lineas de código");
				long lineasCodigo = teclado.nextLong();
				
				System.out.println("Complejidad");
				double complejidad = teclado.nextDouble();
				
				System.out.println("Número de casos test");
				int numCasosTest = teclado.nextInt();
				
//				System.out.println("Framework del frontEnd");
//				String frameworkFrontEndName = teclado.next();
				
//				System.out.println("Framework del backEnd");
//				String frameworkBackEndName = teclado.next();
				
				aplicacionIoT AplicacionIoT1 = new aplicacionIoT (lenguajeProgramacion,almacenaInfEnBD,lineasCodigo,complejidad,numCasosTest);
				
				nuevoIoT[i] = AplicacionIoT1;
			}
			
			for (int j = 0; j < nuevoIoT.length; j++) {
				System.out.println(nuevoIoT[j]);
			}
			teclado.close();
			break;
			
		}
		}
}