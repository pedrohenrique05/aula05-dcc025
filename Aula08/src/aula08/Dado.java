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
    
    private int numero;
    /**
     * @return gera um numero aleatorio e o retorna
     */
    public int geraAleatorio(){
        Random num = new Random();
        numero = num.nextInt(5);
        return numero;
    }

    
    
}
