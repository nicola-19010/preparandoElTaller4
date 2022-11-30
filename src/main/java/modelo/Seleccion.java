package modelo;

import java.util.ArrayList;

public class Seleccion {
    private String nombre;
    private String ranking;
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    public Seleccion(String nombre, String ranking, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.ranking = ranking;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
