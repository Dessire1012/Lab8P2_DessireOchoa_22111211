
package Lab8;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class AdminDistancia extends Thread{
    private JProgressBar progBar;
    private JLabel JlabelJugador;
    private JLabel JlabelEstrella;
    private JLabel JlaberlDistanciaT;
    private JLabel JlabelDistanciaR;
    private int distanciaT;
    private int distanciaR;
    private int velocidad;
    
    private boolean avanzar;
    private boolean vive;

    public AdminDistancia(JProgressBar progBar, int distanciaT, int velocidad) {
        this.progBar = progBar;
        this.distanciaT = distanciaT;
        this.distanciaR = 0;
        this.velocidad = velocidad;
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
    
    public void run(){
        while(vive){
            if(avanzar){
                progBar.setValue(velocidad);
                JlabelDistanciaR.setText(String.valueOf(distanciaR+velocidad));
                
                if(progBar.getValue()==distanciaT){
                    vive=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
            }
        }
    }
}
