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
public class CaixaAltaExpressao implements Expressao {
    private String texto;

    public CaixaAltaExpressao(String texto) {
        this.texto = texto;
    }

    @Override
    public String interpretar() {
        StringBuilder sb = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append((char) (c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}