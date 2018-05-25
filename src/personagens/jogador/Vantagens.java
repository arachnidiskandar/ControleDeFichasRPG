/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.jogador;

import java.util.ArrayList;

/**
 *
 * @author augst
 */
public class Vantagens {
    private ArrayList<Vantagem> vantagensPersonagem = new ArrayList();
    
    public String getNomeVantagens(){
        StringBuilder s = new StringBuilder();
        for (Vantagem vantagem: vantagensPersonagem){
            s.append(vantagem.getNomeVantagem() + ", ");
        }
        return s.toString();
    }
    public void addVantegem(Vantagem vantagem){
        vantagensPersonagem.add(vantagem);
    }
    public void removerVantagem(Vantagem vantagem){
        vantagensPersonagem.remove(vantagem);
    }

    @Override
    public String toString() {
        return "Vantagens{" + "vantagensPersonagem=" + getNomeVantagens() + "}\n";
    }
}
