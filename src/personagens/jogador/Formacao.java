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

    @Override
    public String toString() {
        return "Formacao{" + "nomeFormacao=" + nomeFormacao + ", vantagens=" + getVantagens() + ", pericias=" + getPericias() + "}\n";
    }
    private ArrayList<String> pericias = new ArrayList();            

    public Formacao(String nomeFormacao, ArrayList<String> vantagens, ArrayList<String> pericias) {
        this.nomeFormacao = nomeFormacao;
        this.vantagens = vantagens;
        this.pericias = pericias;
    }

    public String getNomeFormacao() {
        return nomeFormacao;
    }

    public String getVantagens() {
        StringBuilder v = new StringBuilder();
        for (String vantagens : this.pericias)
            v.append(vantagens + ", ");
        return v.toString();
    }

    public String getPericias() {
        StringBuilder peric = new StringBuilder();
        for (String perks : this.pericias)
            peric.append(perks + ", ");
        return peric.toString();
    }
}
