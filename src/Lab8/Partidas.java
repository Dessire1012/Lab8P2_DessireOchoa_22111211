
package Lab8;

import java.util.ArrayList;
import java.util.Date;

public class Partidas {
    private String nombre;
    private Date fechaCreacion;
    private ArrayList <Estrellas> listaEstrellas = new ArrayList();
    private ArrayList <Jugador> listaJugadores = new ArrayList();

    public Partidas(String nombre, Date fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public ArrayList<Estrellas> getListaEstrellas() {
        return listaEstrellas;
    }

    public void setListaEstrellas(ArrayList<Estrellas> listaEstrellas) {
        this.listaEstrellas = listaEstrellas;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
}
