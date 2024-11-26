package com.alejobasilio.herencia;

public abstract class Deporte {
private int id;
private String nombre;
private int numJugadores;


 
public Deporte(int id, String nombre, int numJugadores) {
	
	this.id = id;
	this.nombre = nombre;
	this.numJugadores = numJugadores;
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
public int getNumJugadores() {
	return numJugadores;
}
public void setNumJugadores(int numJugadores) {
	this.numJugadores = numJugadores;
}

public void jugando() {
	System.out.println(this.nombre+" Jugando");
}
}
