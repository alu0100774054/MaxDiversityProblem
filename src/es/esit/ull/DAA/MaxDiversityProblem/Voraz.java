/**
 * @author Erik Andreas Barreto de Vera.
 * E-mail: alu0100774054@ull.edu.es
 * Fecha: 16/05/2016
 * Asignatura: Diseño y Analisis de Algoritmos
 * Comentario: Clase que resuelve el problema con el algoritmo voraz constructivo.
 */

package es.esit.ull.DAA.MaxDiversityProblem;

public class Voraz {
	private Problema problema;
	
	public Voraz(Problema problema) {
		this.problema = problema;		
		resolver();
	}

	private void resolver() {
		Solucion solucion = new Solucion();
		Solucion solucionDePartida = new Solucion();
		
	}

	public Problema getProblema() {
		return problema;
	}

	public void setProblema(Problema problema) {
		this.problema = problema;
	}
	
	
}
