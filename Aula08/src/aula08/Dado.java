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
     * @return seta um numero aleatorio
     */
    public void setNum(){
        Random num = new Random();
        numero = num.nextInt(5);
    }
    /**
     * @return retorna um numero aleatorio
     * @return 
     */
    public int getNum(){
    return numero+1;
    }
    
    
}
