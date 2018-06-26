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
public class Pericias {
     private int mira = 0, atletismo = 0, labia = 0, briga = 0, empatia = 0, 
             furtividade = 0, intimidacao = 0, percepcao = 0, atuar = 0, cavalgar = 0,
             erudicao = 0, seduzir = 0, furto = 0, arteDaGuerra = 0, armas = 0, navegar = 0;
     private boolean criacao = true;
     private int pontos;

    @Override
    public String toString() {
            return "Pericias{" + "mira=" + mira + ", atletismo=" + atletismo + ", labia=" + labia + ", briga=" + briga + ", empatia=" + empatia + ", furtividade=" + furtividade + ", intimidacao=" + intimidacao + ", percepcao=" + percepcao + ", atuar=" + atuar + ", cavalgar=" + cavalgar + ", erudicao=" + erudicao + ", seduzir=" + seduzir + ", furto=" + furto + ", arteDaGuerra=" + arteDaGuerra + ", armas=" + armas + ", pontos disponíveis=" + pontos + "}\n";
    }

    public Pericias() {
        this.pontos = 10;
    }
     
    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public int getMira() {
        return mira;
    }

    public void addMira(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }
        if(this.mira + pnts > 5 || criacao == true && this.mira + pnts > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }
        this.mira += pnts;
        this.setPontos((this.pontos - pnts));
    
    }

    public int getAtletismo() {
        return atletismo;
    }

    public void addAtletismo(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.atletismo + pnts > 5 || criacao == true && this.atletismo + pnts  > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.atletismo += pnts;
    }

    public int getLabia() {
        return labia;
    }

    public void addLabia(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.labia + pnts > 5 || criacao == true && this.labia + pnts  > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.labia += pnts;
        this.setPontos((this.pontos - pnts));
    }

    public int getBriga() {
        return briga;
    }

    public void addBriga(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.briga + pnts > 5 || criacao == true && this.briga + pnts > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.briga += pnts;
    }

    public int getEmpatia() {
        return empatia;
    }

    public void addEmpatia(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.empatia + pnts > 5 || criacao == true && this.empatia + pnts > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.empatia += pnts;
    }

    public int getFurtividade() {
        return furtividade;
    }

    public void addFurtividade(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.furtividade + pnts > 5 || criacao == true && this.furtividade + pnts  > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.furtividade += pnts;
    }

    public int getIntimidacao() {
        return intimidacao;
    }

    public void addIntimidacao(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.intimidacao + pnts > 5 || criacao == true && this.intimidacao + pnts > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.intimidacao += pnts;
    }

    public int getPercepcao() {
        return percepcao;
    }

    public void addPercepcao(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.percepcao + pnts > 5 || criacao == true && this.percepcao + pnts  > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.percepcao += pnts;
    }

    public int getAtuar() {
        return atuar;
    }

    public void addAtuar(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.atuar + pnts > 5 || criacao == true && this.atuar + pnts  > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.atuar += pnts;
    }

    public int getCavalgar() {
        return cavalgar;
    }

    public void addCavalgar(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.cavalgar + pnts > 5 || criacao == true && this.cavalgar + pnts > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.cavalgar += pnts;
    }

    public int getErudicao() {
        return erudicao;
    }

    public void addErudicao(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.erudicao + pnts > 5 || criacao == true && this.erudicao + pnts > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.erudicao += pnts;
    }

    public int getSeduzir() {
        return seduzir;
    }

    public void addSeduzir(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.seduzir + pnts > 5 || criacao == true && this.seduzir + pnts > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.seduzir += pnts;
    }

    public int getFurto() {
        return furto;
    }

    public void addFurto(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.furto + pnts > 5 || criacao == true && this.furto + pnts > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.furto += pnts;
    }

    public int getArteDaGuerra() {
        return arteDaGuerra;
    }

    public void addArteDaGuerra(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.arteDaGuerra + pnts > 5 || criacao == true && this.arteDaGuerra + pnts  > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.arteDaGuerra += pnts;
    }

    public int getArmas() {
        return armas;
    }

    public void addArmas(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.armas + pnts > 5 || criacao == true && this.armas + pnts > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.armas += pnts;
    }
    
    public int getNavegar() {
        return this.navegar;
    }
    
    public void addNavegar(int pnts) {
        if (this.pontos - pnts < 1){
            System.out.println("Pontos Insuficientes.");
            return;
        }if(this.navegar + pnts > 5 || criacao == true && this.navegar + pnts > 3 ){
            System.out.println("Valor máximo já atingido.");
            return;
        }this.armas += pnts;
    }
     
}
