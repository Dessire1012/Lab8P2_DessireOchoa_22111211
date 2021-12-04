
package Lab8;

import java.io.Serializable;

public class Jugador implements Serializable{
    private String nombre;
    private int velocidad;

    public Jugador(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public Jugador() {
    }
    
    private static final long SerialVersionUIDD = 444L;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
