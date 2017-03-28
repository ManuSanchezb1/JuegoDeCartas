package juegoDeCartas;

import java.util.ArrayList;
import java.util.Collections;
 
public class Baraja {
	private ArrayList<Carta> baraja;

	// CONSTRUCTOR
	Baraja() {
		baraja = new ArrayList<Carta>();
		for (Palo palo : Palo.values()) {
			for (Figura figura : Figura.values()) {
				baraja.add(new Carta(palo, figura));
			}
		}
		Collections.shuffle(baraja);
	}

	@Override
	public String toString() {
		return "Baraja\n " + baraja;
	}

	// Para Sacar una carte
	Carta sacarCarta() {
		Carta carta = baraja.get(0);
		baraja.remove(0);
		return carta;
	}

}
