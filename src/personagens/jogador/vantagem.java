/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.jogador;

/**
 *
 * @author augst
 */
public class vantagem {
    private String nomeVantagem, nomeNacao;
    private boolean naCriacao, heroNaAtivacao;
    private int custoPnts;

    public vantagem(String nomeVantagem, String nomeNacao, boolean naCriacao, boolean heroNaAtivacao, int custoPnts) {
        this.nomeVantagem = nomeVantagem;
        this.nomeNacao = nomeNacao;
        this.naCriacao = naCriacao;
        this.heroNaAtivacao = heroNaAtivacao;
        this.custoPnts = custoPnts;
    }

    public String getNomeVantagem() {
        return nomeVantagem;
    }

    public String getNomeNacao() {
        return nomeNacao;
    }

    public boolean isNaCriacao() {
        return naCriacao;
    }

    public boolean isHeroNaAtivacao() {
        return heroNaAtivacao;
    }

    public int getCustoPnts() {
        return custoPnts;
    }
    
}
