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
public class Interpretador {
     public String interpretar(String comando) {
        if (comando.startsWith("caixa_alta(")) {
            String texto = comando.substring(12, comando.length() - 2);
            return new CaixaAltaExpressao(texto).interpretar();
        } else if (comando.startsWith("repetir(")) {
            int virgula = comando.indexOf(',');
            int n = Integer.parseInt(comando.substring(8, virgula));
            String texto = comando.substring(virgula + 2, comando.length() - 2);
            return new RepetirExpressao(n, texto).interpretar();
        }
        return "Comando inválido.";
    }   
}
