/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadroes.Desafio3;

/**
 *
 * @author iasmim.gabiatto
 */
public class SistemaDescontoExterno {
       public double aplicarDescontoPercentual(double valor, double percentual){
           return valor - ( valor * percentual / 100);
       }
}
