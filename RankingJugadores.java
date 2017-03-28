package juegoDeCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RankingJugadores {
	private ArrayList<Jugador> ranking;

	// Constructor
	RankingJugadores() {
		ranking = new ArrayList<Jugador>();
	}

	public ArrayList<Jugador> getRanking() {
		return ranking;
	}

	public void setRanking(ArrayList<Jugador> ranking) {
		this.ranking = ranking;
	}

	void anadirJugador(String nombre) {
		ranking.add(new Jugador(nombre));

	}

	void aumentarPartidaGanada(Jugador j1) {
		ranking.get(ranking.indexOf(j1)).aumentarPartidaGanada();
	}

	void aumentarPartidaPerdida(Jugador j1) {
		ranking.get(ranking.indexOf(j1)).aumentarPartidaPerdida();
	}

	void ordenarRanking() {
		Collections.sort(ranking, new Comparator<Jugador>() {
			@Override
			public int compare(Jugador j1, Jugador j2) {
				return j2.getPartidasGanadas().compareTo(j1.getPartidasGanadas());
			}
		});
	}

	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder("");
		for (int i = 0; i < getRanking().size(); i++) {
			cadena.append("\t" + "[" + (i + 1) + "] -> " + getRanking().get(i));
		}
		return cadena.toString();
	}

	public Jugador get(int indice) {
		return ranking.get(indice);
	}

}
