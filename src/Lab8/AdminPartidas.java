
package Lab8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class AdminPartidas implements Serializable{
    private ArrayList <Partidas> listaPartidas = new ArrayList();
    private File archivo = null;
    
    public AdminPartidas(String path) {
        archivo = new File(path);
    }
    
    private static final long SerialVersionUIDD = 444L;

    public ArrayList<Partidas> getListaPartidas() {
        return listaPartidas;
    }

    public void setListaPartidas(ArrayList<Partidas> listaPartidas) {
        this.listaPartidas = listaPartidas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void addPartida(Partidas p){
        this.listaPartidas.add(p);
    }

     public void cargarArchivo() {
        try {            
            listaPartidas = new ArrayList();
            Partidas temp;
            if (archivo.exists()) {
                //FileInputStream entrada
                   // = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(new FileInputStream("./partidas.cmb"));
                try {
                    while ((temp = (Partidas) objeto.readObject()) != null) {
                        listaPartidas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                //entrada.close();
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
            for (Partidas p : listaPartidas) {
                bw.writeObject(p);
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
