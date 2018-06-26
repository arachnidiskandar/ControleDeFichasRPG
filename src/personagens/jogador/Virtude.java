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
public class Virtude {
    private String nomeVirtude, descricaoVirtude;

    public Virtude(String nomeVirtude, String descricaoVirtude) {
        this.nomeVirtude = nomeVirtude;
        this.descricaoVirtude = descricaoVirtude;
    }

    @Override
    public String toString() {
        return "Virtude{" + "nomeVirtude=" + nomeVirtude + ", descricaoVirtude=" + descricaoVirtude + "}\n";
    }

    public String getNomeVirtude() {
        return nomeVirtude;
    }

    public String getDescricaoVirtude() {
        return descricaoVirtude;
    }
    
    
    
}
