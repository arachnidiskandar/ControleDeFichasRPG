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
public class RodaDaMorte {
    private int feridas = 0, feridasGraves = 0;

    public void addFerida(int qntd){
        if (this.feridas + qntd > 20){
            return;
        }
        this.feridas += qntd;
        this.feridasGraves = (this.feridas/5);    
    }
    public void removerFerida(int qntd){
        if (this.feridas - qntd < 0 )
            this.feridas = 0;
            this.feridasGraves = 0;
        this.feridas -= qntd;
        this.feridasGraves = (this.feridas/5);  
    }

    @Override
    public String toString() {
        return "RodaDaMorte{" + "feridas=" + feridas + ", feridasGraves=" + feridasGraves + "}\n";
    }
    
    
    
}
