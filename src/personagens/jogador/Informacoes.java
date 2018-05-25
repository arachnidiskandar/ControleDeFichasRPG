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
public class Informacoes {
    private String nomeJogador, nomePersonagem, grupo, religiao, reputacao, nacao;
    private int fortuna;
    private ArrayList<String> idiomas = new ArrayList();

    public Informacoes(String nomeJogador, String nomePersonagem, String grupo,
            String religiao, String nacao ) {
        this.nomeJogador = nomeJogador;
        this.nomePersonagem = nomePersonagem;
        this.grupo = grupo;
        this.religiao = religiao;
        this.reputacao = "";
        this.nacao = nacao;
        this.fortuna = 0;
        this.idiomas.add("Théah");
        this.idiomas.add(nacao);
    }

    @Override
    public String toString() {
        return "Informacoes{" + "nomeJogador=" + nomeJogador + ", nomePersonagem=" + nomePersonagem + ", grupo=" + grupo + ", religiao=" + religiao +
                ", reputacao=" + reputacao + ", nacao=" + nacao + ", fortuna=" + fortuna + ", idiomas=" + printIdiomas() + "}\n";
    }
    
    public String printIdiomas(){
        StringBuilder result = new StringBuilder();
        for (String idioma: idiomas)
            result.append(',' + idioma);
        return result.toString();
    }
    
    public String getNomeJogador() {
        return nomeJogador;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getReligiao() {
        return religiao;
    }

    public String getNacao() {
        return nacao;
    }

    public String getReputacao() {
        return reputacao;
    }

    public void setReputacao(String reputacao) {
        this.reputacao = reputacao;
    }

    public int getFortuna() {
        return fortuna;
    }

    public void setFortuna(int fortuna) {
        this.fortuna = fortuna;
    }
    
}
