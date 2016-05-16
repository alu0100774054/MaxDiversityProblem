package es.esit.ull.DAA.MaxDiversityProblem;

import java.util.ArrayList;

public class Solucion {
	private ArrayList<ArrayList<Float>> solucion;	// Contiene el subconjunto solución.
	
	public Solucion() {
		solucion = new ArrayList<>();
	}

	public ArrayList<ArrayList<Float>> getSolucion() {
		return solucion;
	}

	public void setSolucion(ArrayList<ArrayList<Float>> solucion) {
		this.solucion = solucion;
	}
	
}
