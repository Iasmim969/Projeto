/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadroes.Desafio2;

/**
 *
 * @author iasmim.gabiatto
 */
public class MensagemAgradecimento implements Mensagem {
      public String formatar(String nome) {
        return "Obrigado por tudo, " + nome + "!";
    }
}
