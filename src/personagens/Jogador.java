/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens;

import personagens.jogador.Arcana;
import personagens.jogador.Atributos;
import personagens.jogador.Aventura;
import personagens.jogador.Formacoes;
import personagens.jogador.Informacoes;
import personagens.jogador.Pericias;
import personagens.jogador.RodaDaMorte;
import personagens.jogador.Vantagens;

/**
 *
 * @author augst
 */
public class Jogador {
    private Atributos atrb;
    private Pericias pericias;
    private Informacoes info;
    private Vantagens vantagens;
    private Aventura aventura;
    private Formacoes formacoes;
    private Arcana arcana;
    private RodaDaMorte rodaDaMorte;

    public Jogador(Atributos atrb, Pericias pericias, Informacoes info, Vantagens vantagens, Aventura aventura, Formacoes formacoes, Arcana arcana, RodaDaMorte rodaDaMorte) {
        this.atrb = atrb;
        this.pericias = pericias;
        this.info = info;
        this.vantagens = vantagens;
        this.aventura = aventura;
        this.formacoes = formacoes;
        this.arcana = arcana;
        this.rodaDaMorte = rodaDaMorte;
    }

    public RodaDaMorte getRodaDaMorte() {
        return rodaDaMorte;
    }

    public void setRodaDaMorte(RodaDaMorte rodaDaMorte) {
        this.rodaDaMorte = rodaDaMorte;
    }

    public Atributos getAtrb() {
        return atrb;
    }

    public void setAtrb(Atributos atrb) {
        this.atrb = atrb;
    }

    public Pericias getPericias() {
        return pericias;
    }

    public void setPericias(Pericias pericias) {
        this.pericias = pericias;
    }

    public Informacoes getInfo() {
        return info;
    }

    public void setInfo(Informacoes info) {
        this.info = info;
    }

    public Vantagens getVantagens() {
        return vantagens;
    }

    public void setVantagens(Vantagens vantagens) {
        this.vantagens = vantagens;
    }

    public Aventura getAventura() {
        return aventura;
    }

    public void setAventura(Aventura aventura) {
        this.aventura = aventura;
    }

    public Formacoes getFormacoes() {
        return formacoes;
    }

    public void setFormacoes(Formacoes formacoes) {
        this.formacoes = formacoes;
    }

    public Arcana getArcana() {
        return arcana;
    }

    public void setArcana(Arcana arcana) {
        this.arcana = arcana;
    }
}
