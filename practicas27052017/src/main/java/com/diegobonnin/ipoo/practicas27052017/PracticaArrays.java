package com.diegobonnin.ipoo.practicas27052017;

public class PracticaArrays {
	
	private int[] arrayDeEnteros;
	
	public PracticaArrays(){
		arrayDeEnteros=new int[30];
	}
	
	private void test() {
		int valor=20;
		
		// la primera posici�n es: arrayDeEnteros[0], no 1
		
		// inicializaci�n
		for(int indice=0; indice < arrayDeEnteros.length; indice++){
			// incremento, una abreviaci�n de valor=valor+1
			valor++;
			System.out.println("Asignando: " + valor + " a posici�n: " + indice);
			arrayDeEnteros[indice]=valor;
			
		}
		
		// recorrido
		for(int indice=0; indice<arrayDeEnteros.length; indice++){
			System.out.println("arrayDeEnteros[" + indice + "]: " 
		+ arrayDeEnteros[indice]);
		}
		
	}
	
	
	public static void main(String[] args){
		PracticaArrays pa=new PracticaArrays();
		pa.test();
	}


}
