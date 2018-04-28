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

    public ArrayList<String> getIdiomas() {
        return idiomas;
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
