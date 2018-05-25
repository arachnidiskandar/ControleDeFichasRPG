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
public class Aventura {
    private String nomeAventura, objetivoAventura, recompensaHistoria;
    private ArrayList<String> passos = new ArrayList();
    public Aventura (String nomeAven, String objetivo, String recompensa, String primeiroPasso){
        this.nomeAventura = nomeAven;
        this.objetivoAventura = objetivo;
        this.recompensaHistoria = recompensa;
        this.passos.add(primeiroPasso);
    }

    @Override
    public String toString() {
        return "Aventura{" + "nomeAventura=" + nomeAventura + ", objetivoAventura=" + objetivoAventura + ", recompensaHistoria=" + recompensaHistoria + ", passos=" + getPassos() + "}\n";
    }
    
    public String getNomeAventura() {
        return nomeAventura;
    }

    public void setNomeAventura(String nomeAventura) {
        this.nomeAventura = nomeAventura;
    }

    public String getObjetivoAventura() {
        return objetivoAventura;
    }

    public void setObjetivoAventura(String objetivoAventura) {
        this.objetivoAventura = objetivoAventura;
    }

    public String getRecompensaHistória() {
        return recompensaHistoria;
    }

    public void setRecompensaHistória(String recompensaHistória) {
        this.recompensaHistoria = recompensaHistória;
    }

    public void addPassos(String passo) {
        this.passos.add(passo);
    }
    
    public String getPassos(){
        StringBuilder s = new StringBuilder();
        for (String passo : passos) {
            s.append(passo + "\n");
        }
        return s.toString();
    }
    
}
