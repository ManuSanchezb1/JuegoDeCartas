package juegoDeCartas;

/**
 * Dise�a e implementa un juego de cartas. Para ello, comienza implementando el
 * juego de las siete y media. Es opcional implementar otro juego. Recuerda que:
 * A las siete y media se juega con una baraja espa�ola Pueden jugar tantos
 * jugadores como se quiera. Al principio del juego se indicar� el alias de los
 * jugadores implicados. Se podr� averiguar el n�mero de partidas ganadas y
 * perdidas por cada jugador. Se podr� mostrar el ranking de las partidas
 * jugadas Al iniciar cada partida se preguntar� qu� jugador juega y cu�l no.
 * Utiliza el m�todo shuffle para barajar las cartas Para que te plantees el
 * dise�o te dejo estas preguntas:
 * 
 * El hecho de pedir una carta, �a qu� m�todo se refiere? �De qu� objeto/clase?
 * El hecho de plantarse un jugador, �a qu� m�todo se refiere? �De qu�
 * objeto/clase? El hecho de plantarse, �a qu� m�todo se refiere? �De qu�
 * objeto/clase? El hecho de preguntar el nombre al jugador, �a qu� m�todo se
 * refiere? �De qu� objeto/clase? El hecho de preguntarle a un usuario si va a
 * jugar o no, �a qu� m�todo se refiere? �De qu� objeto/clase? �En qu� se
 * diferencia una partida de otra? �Coincide la baraja? �Qu� tienen en com�n
 * todas las partidas de siete y media? �Utilizas alg�n valor
 * constante?�Utilizas enumeraciones?
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
