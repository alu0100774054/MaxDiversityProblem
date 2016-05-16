/**
 * @author Erik Andreas Barreto de Vera.
 * E-mail: alu0100774054@ull.edu.es
 * Fecha: 16/05/2016
 * Asignatura: Diseño y Analisis de Algoritmos
 * Comentario: Clase que contiene el programa principal.
 */
package es.esit.ull.DAA.MaxDiversityProblem;

public class Main {

	public static void main(String[] args) {
		titulo();
		Problema problema = new Problema("instancias/max_div_15_2.txt");
		problema.mostrarDatos();
	}

	private static void titulo() {
		System.out.println("Max Diversity Problem");
		System.out.println("*********************");
		System.out.println();
	}

}
