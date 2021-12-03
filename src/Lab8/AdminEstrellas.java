
package Lab8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminEstrellas {
     private ArrayList <Estrellas> listaEstrellas = new ArrayList();
    private File archivo = null;
    
    public AdminEstrellas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Estrellas> getListaEstrellas() {
        return listaEstrellas;
    }

    public void setListaEstrellas(ArrayList<Estrellas> listaEstrellas) {
        this.listaEstrellas = listaEstrellas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    
    public void addEstrellas(Estrellas e){
        this.listaEstrellas.add(e);
    }

     public void cargarArchivo() {
        try {            
            listaEstrellas = new ArrayList();
            Estrellas temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Estrellas) objeto.readObject()) != null) {
                        listaEstrellas.add(temp);
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
            for (Estrellas e : listaEstrellas) {
                bw.writeObject(e);
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
