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
public class Formacoes {
    ArrayList<Formacao> formacoesPersonagem = new ArrayList();
    
    public void addFormacao(Formacao formacao){
        formacoesPersonagem.add(formacao);
    }
    public void removerFormacao (Formacao formacao){
        formacoesPersonagem.remove(formacao);
    }
    public void printFormacoes(){
        for (Formacao formacao: formacoesPersonagem){
            System.out.println(formacao.getNomeFormacao());
        }
    }
}
