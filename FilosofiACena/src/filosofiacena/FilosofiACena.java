/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofiacena;

/**
 *
 * @author 72873486
 */
public class FilosofiACena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Forchette f0 = new Forchette(0);
        Forchette f1 = new Forchette(1);
        Forchette f2 = new Forchette(2);
        Forchette f3 = new Forchette(3);
        Forchette f4 = new Forchette(4);
        
        Forchette[] fa = {f0,f1};
        Forchette[] fb = {f1,f2};
        Forchette[] fc = {f2,f3};
        Forchette[] fd = {f3,f4};
        Forchette[] fe = {f4, f0};
        
        Filosofo filo0 = new Filosofo("socrate",fa);
        Filosofo filo1 = new Filosofo("archemede",fb);
        Filosofo filo2 = new Filosofo("platone",fc);
        Filosofo filo3 = new Filosofo("giulio",fd);
        Filosofo filo4 = new Filosofo("socrate",fe);
        
        GestioneForchette a = new GestioneForchette();
        
        GestioneAzioni ga = new GestioneAzioni(filo0, a);
        GestioneAzioni gb = new GestioneAzioni(filo1, a);
        GestioneAzioni gc = new GestioneAzioni(filo2, a);
        GestioneAzioni gd = new GestioneAzioni(filo3, a);
        GestioneAzioni ge = new GestioneAzioni(filo4, a);
        
        Thread ta = new Thread(ga);
        Thread tb = new Thread(gb);
        Thread tc = new Thread(gc);
        Thread td = new Thread(gd);
        Thread te = new Thread(ge);
        
        ta.start();
        tb.start();
        tc.start();
        td.start();
        te.start();
    }
    
}
