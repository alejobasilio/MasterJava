package com.alejobasilio.herencia;

public final class Natacion extends Deporte implements Nadable {

	private String nombre;
	private String estilo;

	public Natacion(int id, int numJugadores, String estilo) {
		super(id,  numJugadores);
		this.nombre="Natación";
		this.estilo = estilo;

	}

	/*
	 * Método implementado de la inferfaz Nadable
	 */
	@Override
	public void nadar() {
		System.out.println("Se encuentran nadando");

	}

}
