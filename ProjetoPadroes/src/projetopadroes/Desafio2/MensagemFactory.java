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
public class MensagemFactory {
     public static Mensagem criar(String tipo) {
        switch (tipo.toLowerCase()) {
            case "boasvindas":
                return new MensagemBoasVindas();
            case "despedida":
                return new MensagemDespedida();
            case "agradecimento":
                return new MensagemAgradecimento();
            default:
                return nome -> "Tipo de mensagem desconhecido.";
        }
    }
}
