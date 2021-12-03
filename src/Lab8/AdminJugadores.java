
package Lab8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminJugadores {
         private ArrayList <Jugador> listaJugadores = new ArrayList();
    private File archivo = null;
    
    public AdminJugadores(String path) {
        archivo = new File(path);
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }


    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    
    public void addJugadore(Jugador j){
        this.listaJugadores.add(j);
    }

     public void cargarArchivo() {
        try {            
            listaJugadores = new ArrayList();
            Jugador temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Jugador) objeto.readObject()) != null) {
                        listaJugadores.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo, true);
            bw = new ObjectOutputStream(fw);
            for (Jugador j: listaJugadores) {
                bw.writeObject(j);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
