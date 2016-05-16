/**
 * @author Erik Andreas Barreto de Vera.
 * E-mail: alu0100774054@ull.edu.es
 * Fecha: 16/05/2016
 * Asignatura: Diseño y Analisis de Algoritmos
 * Comentario: Clase que contiene el problema que se quiere resolver.
 */

package es.esit.ull.DAA.MaxDiversityProblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problema {
	private int numeroElementos;					// Número de elementos.
	private int dimensionElemento;					// Dimensión del elemento.
	private ArrayList<ArrayList<Float>> listaCoordenadas;	// Contiene todos los elementos.
	
	/**
	 * Construye un problema a partir del fichero de instancias.
	 * @param nombreFichero Nombre del fichero de instancias.
	 */
	public Problema(String nombreFichero) {
		//lectura del fichero
	    Scanner sc2 = null;
	    try {
	        sc2 = new Scanner(new File(nombreFichero));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	    //inicialización de los atributos
	    numeroElementos = Integer.parseInt(sc2.next());
	    dimensionElemento = Integer.parseInt(sc2.next());
	    listaCoordenadas = new ArrayList<>();
	    //lectura del fichero linea por linea
	    while (sc2.hasNextLine()) {
	            Scanner s2 = new Scanner(sc2.nextLine());
	            ArrayList<Float> dummy = new ArrayList<>();
	        while (s2.hasNext()) {//manipulamos la linea leida
	        	String a = s2.next().replace(",", ".");//remplazamos las comas por puntos porque las comas dan error... 
	            float s = Float.parseFloat(a);
	            dummy.add(s);
	        }
	        if(!dummy.isEmpty())
	        	listaCoordenadas.add(dummy);//añadimos las coordenadas a la lista
	    }
	}
	
	/**
	 * Muestra el número de elementos y la dimensión del problema.
	 */
	public void mostrarDatos(){
		System.out.println("Número de elementos: " + numeroElementos);
		System.out.println("Dimensión del elemento: " + dimensionElemento);
		mostrarLista(listaCoordenadas);
	}
	
	/**
	 * Muestra la lista de elementos.
	 * @param lista lista de elementos.
	 */
	public void mostrarLista(ArrayList<ArrayList<Float>> lista){
		for(int i = 0; i < lista.size(); i++){
			System.out.println((lista.get(i).toString()));
		}
	}

	public int getNumeroElementos() {
		return numeroElementos;
	}

	public void setNumeroElementos(int numeroElementos) {
		this.numeroElementos = numeroElementos;
	}

	public int getDimensionElemento() {
		return dimensionElemento;
	}

	public void setDimensionElemento(int dimensionElemento) {
		this.dimensionElemento = dimensionElemento;
	}

	public ArrayList<ArrayList<Float>> getListaCoordenadas() {
		return listaCoordenadas;
	}

	public void setListaCoordenadas(ArrayList<ArrayList<Float>> listaCoordenadas) {
		this.listaCoordenadas = listaCoordenadas;
	}
	
}
