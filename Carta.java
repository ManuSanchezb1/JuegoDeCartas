package juegoDeCartas;

/**
 * Diseña e implementa un juego de cartas. Para ello, comienza implementando el
 * juego de las siete y media. Es opcional implementar otro juego. Recuerda que:
 * A las siete y media se juega con una baraja española Pueden jugar tantos
 * jugadores como se quiera. Al principio del juego se indicará el alias de los
 * jugadores implicados. Se podrá averiguar el número de partidas ganadas y
 * perdidas por cada jugador. Se podrá mostrar el ranking de las partidas
 * jugadas Al iniciar cada partida se preguntará qué jugador juega y cuál no.
 * Utiliza el método shuffle para barajar las cartas Para que te plantees el
 * diseño te dejo estas preguntas:
 * 
 * El hecho de pedir una carta, ¿a qué método se refiere? ¿De qué objeto/clase?
 * El hecho de plantarse un jugador, ¿a qué método se refiere? ¿De qué
 * objeto/clase? El hecho de plantarse, ¿a qué método se refiere? ¿De qué
 * objeto/clase? El hecho de preguntar el nombre al jugador, ¿a qué método se
 * refiere? ¿De qué objeto/clase? El hecho de preguntarle a un usuario si va a
 * jugar o no, ¿a qué método se refiere? ¿De qué objeto/clase? ¿En qué se
 * diferencia una partida de otra? ¿Coincide la baraja? ¿Qué tienen en común
 * todas las partidas de siete y media? ¿Utilizas algún valor
 * constante?¿Utilizas enumeraciones?
 * 
 * @author d16sablm
 *
 */
public class Carta {
	private Palo palo;
	private Figura figura;

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public Figura getFigura() {
		return figura;
	}

	public void setFigura(Figura figura) {
		this.figura = figura;
	}

	// Constructor
	Carta(Palo palo, Figura figura) {
		setPalo(palo);
		setFigura(figura);
	}

	@Override
	public String toString() {
		return "\n" + figura + " de " + palo;
	}
}
