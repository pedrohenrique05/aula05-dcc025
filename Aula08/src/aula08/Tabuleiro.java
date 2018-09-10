/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08.pkg1;

/**
 *
 * @author pedro
 */
public class Tabuleiro {
   private int tabuleiro[] = new int[10];
    /**
     * 
     * @param ind
     * @param val 
     *  seta a pontuação
     */
   public void pontuacao(int [] tb){
       
   }
    public void setPontRodada(int ind, int val){
        this.tabuleiro[ind] = val;
    }
    /**
     * 
     * @return retorna a pontuação adquerida
     */
    public int getPontTotal(){
        int pontTotal = 0;
        for(int aux = 0 ; aux < 10 ; aux++){
            pontTotal+= this.tabuleiro[aux];
        }
        return pontTotal;
    }
}
