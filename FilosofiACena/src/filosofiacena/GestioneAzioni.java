/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofiacena;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 72873486
 */
public class GestioneAzioni implements Runnable{
    
    private Filosofo filosofo;
    private GestioneForchette gestione;

    public GestioneAzioni(Filosofo filosofo, GestioneForchette gestione) {
        this.filosofo = filosofo;
        this.gestione = gestione;
    }

    public Filosofo getFilosofo() {
        return filosofo;
    }

    public GestioneForchette getGestione() {
        return gestione;
    }

    public void setFilosofo(Filosofo filosofo) {
        this.filosofo = filosofo;
    }

    public void setGestione(GestioneForchette gestione) {
        this.gestione = gestione;
    }
    
    public void pensa()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GestioneAzioni.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Sono "+this.filosofo.getNome() +" e sto pensando");
        
    }
    
       public void mangia(){
       
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GestioneAzioni.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   }

    @Override
    public void run() {
        pensa();
        gestione.prendi(filosofo);
        mangia();
        gestione.rilascia(filosofo);
        
    }
       
        
    
    
    
}
