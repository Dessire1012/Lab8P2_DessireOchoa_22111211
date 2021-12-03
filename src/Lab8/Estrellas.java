
package Lab8;

public class Estrellas {
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
