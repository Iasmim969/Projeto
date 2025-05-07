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
public class DescontoAdapter implements CalcularDesconto {
    private final SistemaDescontoExterno sistemaDesconto = new SistemaDescontoExterno();
    
    @Override
    public double calcular(double valor, double percentual){
        return sistemaDesconto.aplicarDescontoPercentual(valor, percentual);
    }
}
