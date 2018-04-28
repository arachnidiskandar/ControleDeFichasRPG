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

    
    
}
