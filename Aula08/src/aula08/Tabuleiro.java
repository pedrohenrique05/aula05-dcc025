/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

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
       int as = 0, duas = 0, tres = 0 , quadra = 0, quina = 0, sena = 0;
       for(int aux  = 0 ; aux < 5 ; aux++){
           switch(tb[aux]){
               case 1:
                   as++;
                   break;
               case 2:
                   duas++;
                   break;
               case 3:
                   tres++;
                   break;
               case 4:
                   quadra++;
                   break;
               case 5:
                   quina++;
                   break;
               case 6:
                   sena++;
                   break;
           }
           if()
       }
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
