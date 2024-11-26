package com.alejobasilio.herencia;

public class Futbol extends Deporte implements Corrible{
	
	private String competición;

	public Futbol(int id, String nombre, int numJugadores, String competición) {
		super(id, nombre, numJugadores);
		this.competición = competición;
	}

	/*
	 * Método implementado de la inferfaz Corrible
	 */
	@Override
	public void correr() {
		
		System.out.println("Los jugadores están Corriendo");
		
	}
	

}
