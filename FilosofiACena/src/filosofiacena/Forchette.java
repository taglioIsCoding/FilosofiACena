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
public class Forchette {
    
    private int numero;
    private boolean presa = false;

    public Forchette(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isPresa() {
        return presa;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPresa(boolean presa) {
        this.presa = presa;
    }
    
    
    
}
