
package Lab8;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;

public class AdminDistancia extends Thread{
    private JProgressBar progBar;
    private JLabel JlabelJugador;
    private JLabel JlabelEstrella;
    private JLabel JlaberlDistanciaT;
    private JLabel JlabelDistanciaR;
    private int distanciaT;
    private int distanciaR;
    private int velocidad;
    private int fila;
    private String estrella;
    private String jugador;
    private JTable table;
    
    private boolean avanzar;
    private boolean vive;

    public AdminDistancia(JProgressBar progBar, int distanciaT, int velocidad, String estrella, String jugador, JLabel JlabelJugador,
    JLabel JlabelEstrella, JLabel JlaberlDistanciaT, JLabel JlabelDistanciaR ) {
        this.progBar = progBar;
        this.distanciaT = distanciaT;
        this.distanciaR = 0;
        this.velocidad = velocidad;
        this.jugador = jugador;
        this.estrella = estrella;
        this.JlabelJugador = JlabelJugador;
        this.JlabelEstrella = JlabelEstrella;
        this.JlaberlDistanciaT = JlaberlDistanciaT;
        this.JlabelDistanciaR = JlabelDistanciaR;
        this.table = table;
        this.avanzar = true;
        this.vive = true;
    }

    public JProgressBar getjProgressBar1() {
        return progBar;
    }

    public void setjProgressBar1(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public JLabel getJlabelJugador() {
        return JlabelJugador;
    }

    public void setJlabelJugador(JLabel JlabelJugador) {
        this.JlabelJugador = JlabelJugador;
    }

    public JLabel getJlabelEstrella() {
        return JlabelEstrella;
    }

    public void setJlabelEstrella(JLabel JlabelEstrella) {
        this.JlabelEstrella = JlabelEstrella;
    }

    public JLabel getJlaberlDistanciaT() {
        return JlaberlDistanciaT;
    }

    public void setJlaberlDistanciaT(JLabel JlaberlDistanciaT) {
        this.JlaberlDistanciaT = JlaberlDistanciaT;
    }

    public JLabel getJlabelDistanciaR() {
        return JlabelDistanciaR;
    }

    public void setJlabelDistanciaR(JLabel JlabelDistanciaR) {
        this.JlabelDistanciaR = JlabelDistanciaR;
    }

    public int getDistanciaT() {
        return distanciaT;
    }

    public void setDistanciaT(int distanciaT) {
        this.distanciaT = distanciaT;
    }

    public int getDistanciaR() {
        return distanciaR;
    }

    public void setDistanciaR(int distanciaR) {
        this.distanciaR = distanciaR;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getEstrella() {
        return estrella;
    }

    public void setEstrella(String estrella) {
        this.estrella = estrella;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
   
    
    
    
    public void run(){
        while(vive){
            if(avanzar){
                progBar.setMaximum(distanciaT);
                JlaberlDistanciaT.setText(Integer.toString(distanciaT));
                JlabelEstrella.setText(estrella);
                JlabelJugador.setText(jugador);
                

                if(distanciaR <= distanciaT){
                   progBar.setValue((progBar.getValue()+velocidad)); 
                   JlabelDistanciaR.setText(Integer.toString(0 + velocidad));
                   
                }else {
                    progBar.setValue(0);     
                    vive = false;
                }

                            
            } //FIN IF
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
