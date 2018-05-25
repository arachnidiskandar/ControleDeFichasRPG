/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
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
        //Informações
        Informacoes info = new Informacoes("Augusto", "Arthuria Pendragon", "Pirata", "Ateu", "Avalon");
        System.out.println(info.toString());
        //Status
        Atributos atrb = new Atributos(2, 2, 2, 2, 2);
        System.out.println(atrb.toString());
        //Perícias
        Pericias perks = new Pericias();
        perks.addMira(2);
        perks.addArmas(2);
        System.out.println(perks.toString());
        //Vantagens
        Vantagem vantagem1 = new Vantagem("NãoLembro", "", false, false, 2);
        Vantagem vantagem2 = new Vantagem("Ambidestria", "", true, false, 3);
        Vantagens vantagens = new Vantagens();
        vantagens.addVantegem(vantagem2);
        vantagens.addVantegem(vantagem1);
        System.out.println(vantagens.toString());
        //Arcana
        Virtude virtude = new Virtude("AlgumaCoisa", "OutraCoisa");
        System.out.println(virtude.toString());
        Hubris hubris = new Hubris("Azarado", "Vc tá destinado a rolar falha crítica");
        System.out.println(hubris.toString());
        Arcana arcana = new Arcana(hubris, virtude);
        System.out.println(arcana.toString());
        //Background Assassino verdadeiro
        Formacoes formacoes = new Formacoes();
        ArrayList<String> vantagensAssassino = new ArrayList<>();
        vantagensAssassino.add("Esgrimista");
        vantagensAssassino.add("Psiu, Vem aqui.");
        ArrayList<String> periciasAssasino = new ArrayList<>();
        periciasAssasino.add("Atlético");
        periciasAssasino.add("Empatia");
        periciasAssasino.add("Esconder-se");
        periciasAssasino.add("Intimidação");
        periciasAssasino.add("Armamento");
        Formacao formacaoAssassino = new Formacao("Assasino", vantagensAssassino, periciasAssasino);
        System.out.println(formacaoAssassino.toString());
        formacoes.addFormacao(formacaoAssassino);
        //Background Pirate verdadeiro
        ArrayList<String> vantagensPirata = new ArrayList<>();
        vantagensPirata.add("Vontade indomável");
        vantagensPirata.add("Mira Certeira");
        ArrayList<String> periciasPirata = new ArrayList<>();
        periciasPirata.add("Mira");
        periciasPirata.add("Intimidação");
        periciasPirata.add("Percepção");
        periciasPirata.add("Furto");
        periciasPirata.add("Navegação");
        Formacao formacaoPirata = new Formacao("Pirata", vantagensPirata, periciasPirata);
        System.out.println(formacaoPirata.toString());
        formacoes.addFormacao(formacaoPirata);
        System.out.println(formacoes.toString());
        //Aventura
        Aventura aventura = new Aventura("Meu jeito pirata de ser", "Tornar-se o rei dos piratas", "Reputação", "Saquear um Návio.");
        aventura.toString();
        //Roda da Morte
        RodaDaMorte roda = new RodaDaMorte();
        roda.toString();
        //Jogador
        Jogador jogador = new Jogador(atrb, perks, info, vantagens, aventura, formacoes, arcana, roda);
        jogador.toString();
        //Lista de Jogadores
        ListaJogadores listaPlayers = new ListaJogadores();
        listaPlayers.addJogador(jogador);
        listaPlayers.toString();
        
    }
    
}
