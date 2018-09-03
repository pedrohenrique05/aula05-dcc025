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
public class Pontuacao {
    //private int posVet = 0;
     int numFace[] = new int[6];
     int pont;
     int valMult;
    public int retornaPont(int [] vet){
      int ases = 0,dois = 0, tres = 0,quatros = 0;
      int cincos = 0, seis = 0;
      
      for(int aux = 0; aux < 6 ; aux++){
          if(vet[aux]==1){
              ases++;
          }else if(vet[aux]==2){
              dois++;
          }else if(vet[aux]==3){
              tres++;
          }else if(vet[aux]==4){
              quatros++;
          }else if(vet[aux]==5){
              cincos++;
          }else if(vet[aux]==6){
              seis++;
          }
      }
      numFace[0] = ases;
      numFace[1] = dois;
      numFace[2] = tres;
      numFace[3] = quatros;
      numFace[4] = cincos;
      numFace[5] = seis;
      for(int aux =0;aux<5;aux++){
          for(int aux1 =0;aux1<6;aux1++){
              if(numFace[aux] > numFace[aux1]){
                  pont = numFace[aux];
                  if(numFace[aux] == 1){
                      valMult = 1;
                  }else if(numFace[aux] == 2){
                      valMult = 2;
                  }else if(numFace[aux] == 3){
                      valMult = 3;
                  }else if(numFace[aux] == 4){
                      valMult = 4;
                  }else if(numFace[aux] == 5){
                      valMult = 5;
                  }else if(numFace[aux] == 6){
                      valMult = 6;
                  }
              }
          }
      }
      return pont*valMult;
      }
    }

