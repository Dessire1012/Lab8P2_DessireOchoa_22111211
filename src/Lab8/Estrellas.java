
package Lab8;

import java.io.Serializable;

public class Estrellas implements Serializable{
    private String nombre;
    private int distancia;
    private String descripcion;

    public Estrellas() {
    }

    public Estrellas(String nombre, int distancia, String descripcion) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.descripcion = descripcion;
    }
    
    private static final long SerialVersionUIDD = 444L;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
    
}
