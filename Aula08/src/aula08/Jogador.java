/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Jogador {
Dado valDado = new Dado();
Pontuacao pont = new Pontuacao();
private int tabuleiro[] = new int[10];
private String nome;
private int idade;
private int sequencia[] = new int[6];
static int ind = 0;

Jogador(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
    for(int aux = 0 ; aux < 5; aux++){
        this.sequencia[aux] = 0;
    }
    
}
public void setDados(int numJog){
    
    this.sequencia  =  valDado.geraAleatorio(numJog);
    for(int aux = 0 ; aux < 6; aux++){
        System.out.println(this.sequencia[aux]);
    }
    
}

public void setPontuacao(int ind){
    tabuleiro[ind] = pont.retornaPont(sequencia);
    
}





public void setNome(){
    Scanner nome = new Scanner(System.in);
    this.nome = nome.next();
}
public void setIdade(){
    Scanner idade = new Scanner(System.in);
    this.idade = idade.nextInt();
}


public void imprimeInfo(){
    System.out.print("Nome: ");
    System.out.println(this.nome);
    System.out.print("Idade: ");
    System.out.println(this.idade);
}
}
