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
public class Formacao {
    private String nomeFormacao; 
    private ArrayList<String> vantagens = new ArrayList();
    private ArrayList<String> pericias = new ArrayList();            

    public Formacao(String nomeFormacao, ArrayList<String> vantagens, ArrayList<String> pericias) {
        this.nomeFormacao = nomeFormacao;
        this.vantagens = vantagens;
        this.pericias = pericias;
    }

    public String getNomeFormacao() {
        return nomeFormacao;
    }

    public ArrayList<String> getVantagens() {
        return this.vantagens;
    }

    public ArrayList<String> getPericias() {
        return this.pericias;
    }
}
