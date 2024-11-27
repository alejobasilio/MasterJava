package com.alejobasilio.herencia;

public final class Natacion extends Deporte implements Nadable{


private String estilo;

public Natacion(int id, String nombre, int numJugadores, String estilo) {
		super(id, nombre, numJugadores);
		this.estilo=estilo;
		
	}
/*
 * Método implementado de la inferfaz Nadable
 */
@Override
public void nadar() {
	System.out.println("Se encuentran nadando");
	
}

}
