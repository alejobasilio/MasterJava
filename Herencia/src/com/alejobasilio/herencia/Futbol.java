package com.alejobasilio.herencia;

import java.util.ArrayList;
import java.util.List;

public final class Futbol extends Deporte {
	
	private String competición;
	private List<Futbolista> listaFutbolistas;

	
	
	
	public Futbol(int id, String nombre, int numJugadores, String competición) {
		super(id, nombre, numJugadores);
		
		this.competición = competición;
		this.listaFutbolistas = new ArrayList();
		Futbolista jugador1= new Futbolista(1, "Alejo", "Delantero");
		listaFutbolistas.add(jugador1);
	}




	public String getCompetición() {
		return competición;
	}




	public void setCompetición(String competición) {
		this.competición = competición;
	}




	public List<Futbolista> getListaFutbolistas() {
		return listaFutbolistas;
	}




	public void setListaFutbolistas(List<Futbolista> listaFutbolistas) {
		this.listaFutbolistas = listaFutbolistas;
	}


	
	

}
