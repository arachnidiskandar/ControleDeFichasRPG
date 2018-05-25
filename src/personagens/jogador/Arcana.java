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
public class Arcana {
    private Hubris hubris;
    private Virtude virtude;
    public Arcana(Hubris hubris, Virtude virtude) {
        this.hubris = hubris;
        this.virtude = virtude;
    }

    @Override
    public String toString() {
        return "Arcana{" + "hubris=" + hubris.getNomeHubris() + ", virtude=" + virtude.getNomeVirtude() + "}\n";
    }

    public Hubris getHubris() {
        return hubris;
    }

    public void setHubris(Hubris hubris) {
        this.hubris = hubris;
    }

    public Virtude getVirtude() {
        return virtude;
    }

    public void setVirtude(Virtude virtude) {
        this.virtude = virtude;
    }
    
}
