/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import personagens.jogador.*;
import personagens.Jogador;
import personagens.ListaJogadores;
/**
 *
 * @author augst
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Informacoes info = new Informacoes("Augusto", "Arthuria Pendragon", "Pirata", "Ateu", "Avalon");
        Atributos atrb = new Atributos(2, 2, 2, 2, 2);
        Pericias perks = new Pericias();
        perks.addMira(2);
        perks.addArmas(2);
        Vantagem vantagem1 = new Vantagem("NãoLembro", "", false, false, 2);
        Vantagem vantagem2 = new Vantagem("Ambidestria", "", true, false, 3);
        Vantagens vantagens = new Vantagens();
        vantagens.addVantegem(vantagem2);
        vantagens.addVantegem(vantagem1);
        Virtude virtude = new Virtude("AlgumaCoisa", "OutraCoisa");
        Hubris hubris = new Hubris("Azarado", "Vc tá destinado a rolar falha crítica");
        Arcana arcana = new Arcana(hubris, virtude);
        Formacoes
    }
    
}
