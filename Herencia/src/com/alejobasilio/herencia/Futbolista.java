package com.alejobasilio.herencia;

public class Futbolista implements Jugable{

	private int id;
	private String nombre;
	private String posicion;

	public Futbolista(int id, String nombre, String posicion) {

		this.id = id;
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	/*
	 * Método implementado de la inferfaz Corrible
	 */
	@Override
	public void jugar() {
		System.out.println("El jugador " + this.nombre+ " está jugando");
		
	}

	
}
