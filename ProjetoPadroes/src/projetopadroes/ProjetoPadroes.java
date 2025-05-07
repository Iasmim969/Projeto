package projetopadroes;

import java.util.Scanner;
import projetopadroes.Desafio1.Interpretador;
import projetopadroes.Desafio2.Mensagem;
import projetopadroes.Desafio2.MensagemFactory;
import projetopadroes.Desafio3.DescontoAdapter;

public class ProjetoPadroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Desafio 1: Editor de Texto (Interpreter)");
            System.out.println("2 - Desafio 2: Gerador de Mensagens (Factory Method)");
            System.out.println("3 - Desafio 3: Sistema de Desconto (Adapter)");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o comando:");
                    String comando = sc.nextLine();
                    Interpretador interpretador = new Interpretador();
                    String resultado = interpretador.interpretar(comando);
                    System.out.println("Saída: " + resultado);
                    break;

                case 2:
                    System.out.println("Digite o tipo de mensagem (boasvindas, despedida, agradecimento):");
                    String tipo = sc.nextLine();
                    System.out.println("Digite o nome:");
                    String nome = sc.nextLine();
                    Mensagem mensagem = MensagemFactory.criar(tipo);
                    System.out.println(mensagem.formatar(nome));
                    break;

                case 3:
                    System.out.println("Digite o valor:");
                    double valor = sc.nextDouble();
                    System.out.println("Digite o percentual de desconto:");
                    double percentual = sc.nextDouble();
                    DescontoAdapter adapter = new DescontoAdapter();
                    double valorFinal = adapter.calcular(valor, percentual);
                    System.out.printf("Valor com desconto: R$%.2f\n", valorFinal);
                    break;
            }
        } while (opcao != 0);
        sc.close();
    }
}