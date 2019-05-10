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
public class Filosofo {
    
    private String nome;
    private Forchette[] forchette;
    
    public Filosofo(String nome, Forchette[] forchette){
        this.nome = nome;
        this.forchette = forchette;
    }

    public String getNome() {
        return nome;
    }

    public Forchette getForchette(int i) {
            return forchette[i];
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setForchette(Forchette[] forchette) {
        this.forchette = forchette;
    }
            
    
                
            
    
}
