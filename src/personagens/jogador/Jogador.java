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
public class Jogador {
    
    private Atributos atributos;
    private Pericias pericias;
    private Informacoes informacoes;
    private Vantagens vantagens;
    private Arcana arcana;
    private Aventura aventura;
    private  RodaDaMorte rodaDaMorte;
    private  Formacoes formacoes;
    
    public Jogador(Atributos atrib, Pericias pericias, Informacoes info, Vantagens vantagens, Arcana arcana,
                   Aventura aventura, RodaDaMorte roda, Formacoes formacoes ) {
        this.atributos = atrib;
        this.pericias = pericias;
        this.informacoes = info;
        this.vantagens = vantagens;
        this.arcana = arcana;
        this.aventura = aventura;
        this.rodaDaMorte = roda;
        this.formacoes = formacoes;
        
    }

    @Override
    public String toString() {
        return "Dados do Jogador:\n" +
               "Informações:" + informacoes.toString() + "\n" +
               "Atributos:" + atributos.toString() + "\n" +
               "Formações:" + formacoes.toString() + "\n" +
               "Perícias:" + pericias.toString() + "\n" +
               "Vantagens:" + vantagens.toString() + "\n" +
               "Arcana:" + arcana.toString() + "\n" +
               "Aventura:" + aventura.toString() + "\n" +
               "Roda da Morte:" + rodaDaMorte.toString() + "\n";
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public Pericias getPericias() {
        return pericias;
    }

    public void setPericias(Pericias pericias) {
        this.pericias = pericias;
    }

    public Informacoes getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(Informacoes informacoes) {
        this.informacoes = informacoes;
    }

    public Vantagens getVantagens() {
        return vantagens;
    }

    public void setVantagens(Vantagens vantagens) {
        this.vantagens = vantagens;
    }

    public Arcana getArcana() {
        return arcana;
    }

    public void setArcana(Arcana arcana) {
        this.arcana = arcana;
    }

    public Aventura getAventura() {
        return aventura;
    }

    public void setAventura(Aventura aventura) {
        this.aventura = aventura;
    }

    public RodaDaMorte getRodaDaMorte() {
        return rodaDaMorte;
    }

    public void setRodaDaMorte(RodaDaMorte rodaDaMorte) {
        this.rodaDaMorte = rodaDaMorte;
    }

    public Formacoes getFormacoes() {
        return formacoes;
    }

    public void setFormacoes(Formacoes formacoes) {
        this.formacoes = formacoes;
    }

    
    
}
