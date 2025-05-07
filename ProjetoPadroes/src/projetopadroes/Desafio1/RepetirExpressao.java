/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadroes.Desafio1;

/**
 *
 * @author iasmim.gabiatto
 */
public class RepetirExpressao implements Expressao{
     private int vezes;
    private String texto;

    public RepetirExpressao(int vezes, String texto) {
        this.vezes = vezes;
        this.texto = texto;
    }

    @Override
    public String interpretar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vezes; i++) {
            sb.append(texto);
        }
        return sb.toString();
    }
}

