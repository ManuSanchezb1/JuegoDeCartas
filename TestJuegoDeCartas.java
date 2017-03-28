package juegoDeCartas;

import java.util.ArrayList;

import utiles.Menu;
import utiles.Teclado;

public class TestJuegoDeCartas {
	private static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private static ArrayList<Jugador> participantes = new ArrayList<Jugador>();
	private static RankingJugadores ranking;
	private static Partida partida = new Partida(participantes);
	private static Menu menuPrincipal = new Menu("*********JUEGO DE LAS SIETE Y MEDIA*********",
			new String[] { "Añadir Jugadores ", "Jugar", "Ranking" });

	public static void main(String[] args) {
		jugadores.add(new Jugador("Manito"));
		jugadores.add(new Jugador("Rafa"));
		jugadores.add(new Jugador("Yuste"));
		jugadores.add(new Jugador("Triskis"));
		int opcion;
		do {
			opcion = menuPrincipal.gestionar();

			switch (opcion) {
			//Añadir jugadores
			case 1:

				Menu menuJugadores = new Menu("Añadir Jugador",
						new String[] { "Crear nuevo jugador", "Ver lista de Jugadores" });
				int opcionJugador;
				do {
					opcionJugador = menuJugadores.gestionar();
					switch (opcionJugador) {
					//Crear un jugador nuevo
					case 1:
						crearJugador(Teclado.leerCadena("Dime el nombre del jugador: "));
						break;
					//Lista de jugadores
					case 2:
						System.out.println(mostrar(jugadores));
						break;
					default:
						System.out.println("Hasta Pronto!");
					}
				} while (opcionJugador != menuJugadores.getNumOpciones());

				break;
			//Jugar
			case 2:
				añadirParticipantes();
				partida.ronda();
				break;
			//Ranking
			case 3:
				ranking.setRanking(jugadores);
				ranking.ordenarRanking();
				System.out.println(ranking.toString());
				break;
			default:
				System.out.println("Hasta Pronto!");

			}
		} while (opcion != menuPrincipal.getNumOpciones());

	}

	private static void añadirParticipantes() {
		do {
			System.out.println(mostrar(jugadores));
			int indice = Teclado.leerEntero("Dime el indice del jugador:") - 1;
			Jugador j1 = jugadores.get(indice);
			participantes.add(j1);
		} while (Teclado.deseaContinuar("¿Quieres añadir otro jugador? (S / N"));
	}

	private static void crearJugador(String nombre) {
		jugadores.add(new Jugador(nombre));
	}

	public static String mostrar(ArrayList<Jugador> jugadores) {
		StringBuilder cadena = new StringBuilder("");
		for (int i = 0; i < jugadores.size(); i++) {
			cadena.append("[" + (i + 1) + "] -> " + jugadores.get(i));
		}
		return cadena.toString();
	}

}
