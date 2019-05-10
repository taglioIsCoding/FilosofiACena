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
public class GestioneForchette {

    public GestioneForchette() {
    }
    
   

    
    public synchronized void prendi(Filosofo filosofo){
        while (filosofo.getForchette(0).isPresa()||filosofo.getForchette(1).isPresa()){
            try {
                System.out.println("sono il filosofo "+ filosofo.getNome()+" e sto aspettando le mie forchette");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(GestioneAzioni.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
        
        
        filosofo.getForchette(0).setPresa(true);
        filosofo.getForchette(1).setPresa(true);
        System.out.println("sono il filosofo "+ filosofo.getNome()+" e ho preso le mie forchette");
         
    }
    
    public synchronized void rilascia(Filosofo filosofo){
        filosofo.getForchette(0).setPresa(false);
        filosofo.getForchette(1).setPresa(false);
         System.out.println("sono il filosofo "+ filosofo.getNome()+" e ho lasciato le mie forchette");
        notifyAll();
         
    }
}
