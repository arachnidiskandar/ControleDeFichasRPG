/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens;

import java.util.ArrayList;

/**
 *
 * @author augst
 */
public class ListaJogadores {
    ArrayList<Jogador> listaJogadores = new ArrayList();
    
    public void addJogador(Jogador j){
        this.listaJogadores.add(j);
    }
    public void removerJogador(Jogador j){
        listaJogadores.remove(j);
    }
}



