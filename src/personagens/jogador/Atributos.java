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
public class Atributos {
    private int vigor, finesse, determinacao, inteligencia, panache;
    private int vigorBonus, finesseBonus, determinacaoBonus, arguciaBonus, panacheBonus;
    public Atributos(int vigor, int deter, int finesse, int inteligencia, int panache) {
        this.vigor = vigor;
        this.finesse = finesse;
        this.determinacao = deter;
        this.inteligencia = inteligencia;
        this.panache = panache;
    }

    @Override
    public String toString() {
        return "Atributos{" + "vigor=" + vigor + ", finesse=" + finesse + ", determinacao=" + determinacao + ", inteligencia=" + inteligencia + ", panache=" + panache + ", vigorBonus=" + vigorBonus + ", finesseBonus=" + finesseBonus + ", determinacaoBonus=" + determinacaoBonus + ", arguciaBonus=" + arguciaBonus + ", panacheBonus=" + panacheBonus + "}\n";
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public int getFinesse() {
        return finesse;
    }

    public void setFinesse(int finesse) {
        this.finesse = finesse;
    }

    public int getDeterminacao() {
        return determinacao;
    }

    public void setDeterminacao(int determinacao) {
        this.determinacao = determinacao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getPanache() {
        return panache;
    }

    public void setPanache(int panache) {
        this.panache = panache;
    }

    public int getVigorBonus() {
        return vigorBonus;
    }

    public void setVigorBonus(int vigorBonus) {
        this.vigorBonus = vigorBonus;
    }

    public int getFinesseBonus() {
        return finesseBonus;
    }

    public void setFinesseBonus(int finesseBonus) {
        this.finesseBonus = finesseBonus;
    }

    public int getDeterminacaoBonus() {
        return determinacaoBonus;
    }

    public void setDeterminacaoBonus(int determinacaoBonus) {
        this.determinacaoBonus = determinacaoBonus;
    }

    public int getArguciaBonus() {
        return arguciaBonus;
    }

    public void setArguciaBonus(int arguciaBonus) {
        this.arguciaBonus = arguciaBonus;
    }

    public int getPanacheBonus() {
        return panacheBonus;
    }

    public void setPanacheBonus(int panacheBonus) {
        this.panacheBonus = panacheBonus;
    }
    
}
