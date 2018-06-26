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
public class Hubris {
    private String nomeHubris, descricaoHubris;

    public Hubris(String nomeHubris, String descricaoHubris) {
        this.nomeHubris = nomeHubris;
        this.descricaoHubris = descricaoHubris;
    }

    public String getNomeHubris() {
        return nomeHubris;
    }

    public String getDescricaoHubris() {
        return descricaoHubris;
    }

    @Override
    public String toString() {
        return "Hubris{" + "nomeHubris=" + nomeHubris + ", descricaoHubris=" + descricaoHubris + "}\n";
    }
    
}
