package juegoDeCartas;

public class Jugador {
	String nombre;
	int partidasGanadas = 0;
	int partidasPerdidas = 0;
	double puntuacion = 0;

	// Constructor
	Jugador(String nombre) {
		this.nombre = nombre;
	}

	void sumarPuntuacion(double valor) {
		this.puntuacion = puntuacion + valor;
	}

	void puntosACero() {
		setPuntuacion(0);
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPartidasGanadas() {
		return partidasGanadas;
	}

	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	public int getPartidasPerdidas() {
		return partidasPerdidas;
	}

	public void setPartidasPerdidas(int partidasPerdidas) {
		this.partidasPerdidas = partidasPerdidas;
	}

	void aumentarPartidaGanada() {
		this.partidasGanadas++;
	}

	void aumentarPartidaPerdida() {
		this.partidasPerdidas++;
	}

	@Override
	public String toString() {
		return "Nombre= " + nombre + "\t" + " PG= " + partidasGanadas + "\t" + " PP= " + partidasPerdidas + "\t"
				+ " Puntos= " + puntuacion + "\n";
	}

}
