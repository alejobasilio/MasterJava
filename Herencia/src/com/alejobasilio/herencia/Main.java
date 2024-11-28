package com.alejobasilio.herencia;

public class Main {

	public static void main(String[] args) {
		
		Natacion mariposa = new Natacion(1, 7,"Mariposa");
		mariposa.jugando();
		mariposa.nadar();
		
		
		Futbol laLiga= new Futbol(2, 11, "LaLiga");
		laLiga.jugando();
		laLiga.getListaFutbolistas().getFirst().jugar();

	}

}
