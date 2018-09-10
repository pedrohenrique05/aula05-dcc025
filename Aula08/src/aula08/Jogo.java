/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08.pkg1;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Jogo {
    Jogador jg1 = new Jogador();
    Jogador jg2 = new Jogador();
    private int numJogadas = 0;

    
    public void iniciaJogo(){
        while(this.numJogadas < 10){
            int ver = 0;
            int qtdJogada = 0;
            System.out.println("Jogador 1");
            jg1.setValDados(ver);
            jg1.getValDados();
            while(qtdJogada < 3){
                System.out.println("Deseja fazer outra jogada(0 - não, 1 - sim)?");
                Scanner apura = new Scanner(System.in);
                ver = apura.nextInt();
                if(ver == 1){
                    jg1.setValDados(ver);
                    qtdJogada++;
                }else{
                    qtdJogada = 3;
                }
            }
            qtdJogada = 0;
            ver = 0;
            
            System.out.println("Jogador 2");
            jg2.setValDados(ver);
            jg2.getValDados();
            while(qtdJogada < 3){
                System.out.println("Deseja fazer outra jogada(0 - não, 1 - sim)?");
                Scanner apura = new Scanner(System.in);
                ver = apura.nextInt();
                if(ver == 1){
                    jg2.setValDados(ver);
                    qtdJogada++;
                }else{
                    qtdJogada = 3;
                }
            }
            
            
            this.numJogadas++;
        }
    }
}
//relist