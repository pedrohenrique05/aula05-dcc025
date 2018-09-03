/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;
import java.util.Random;
/**
 *
 * @author pedro
 */
/**
 * 
 * @return foi iniciado a classe Dado
 */
public class Dado {
    int faceDado[] = new int[5];
    private int valFace;
    /**
     * @return gera um numero aleatorio e o retorna
     */
    public int [] geraAleatorio(int numDado){
        for(int aux = 0 ; aux < numDado ; aux++){
            Random num = new Random();
            this.faceDado[aux] = num.nextInt(5)+1;
        }
        
        return faceDado;
    }

    
    
}
