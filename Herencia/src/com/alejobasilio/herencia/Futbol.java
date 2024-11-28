package com.alejobasilio.herencia;

import java.util.ArrayList;
import java.util.List;

public final class Futbol extends Deporte {
	private String nombre;
	private String competicion;
	private List<Futbolista> listaFutbolistas;

	
	
	
	public Futbol(int id,  int numJugadores, String competición) {
		super(id,  numJugadores);
		this.nombre="Futbol";
		this.competicion = competición;
		this.listaFutbolistas = new ArrayList();
		Futbolista jugador1= new Futbolista(1, "Alejo", "Delantero");
		listaFutbolistas.add(jugador1);
	}




	public String getCompeticion() {
		return competicion;
	}




	public void setCompeticion(String competición) {
		this.competicion = competición;
	}




	public List<Futbolista> getListaFutbolistas() {
		return listaFutbolistas;
	}




	public void setListaFutbolistas(List<Futbolista> listaFutbolistas) {
		this.listaFutbolistas = listaFutbolistas;
	}


	
	

}
