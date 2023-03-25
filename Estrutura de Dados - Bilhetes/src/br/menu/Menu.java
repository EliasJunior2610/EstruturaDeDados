//Alunos: Denyel Fernando, Elias Sales, João Pedro, Luan Santos, Lucas Oliveira, João Carlos e Ricardo Junior.
//nome do pacote;
package br.menu;

import java.util.ArrayList;
//importações;
import java.util.Scanner;
import br.entidades.*;
import br.repositorios.*;

//inicializando a classe;
public class Menu {
	// método main;
	public static void main(String[] args) {
		// instanciando o Scanner e a classe BilheteRepositorio;
		Scanner ler = new Scanner(System.in);
		BilheteRepositorio repositorio = new BilheteRepositorio(new ArrayList<String>());
		// criando as variáveis;
		String x, b = "0";
		int quantidade = 0;
		double soma = 0;

		// criando a estrutura de repetição para mostrar o menu;
		do {
			// menu;
			System.out.println("------------------------------");
			System.out.println("Se você deseja pedir bilhete insira qualquer valor, caso não, digite 1.");
			System.out.println("------------------------------");
			System.out.print("Resposta: ");
			// lendo a variável;
			x = ler.next();
			// saindo do menu, caso o usuário não queira comprar;
			if (x.equals("1")) {
				break;
				// escolhendo o tipo do bilhete, caso o usuário queira comprar;
			} else {
				System.out.println("------------------------------");
				System.out.println("Tipos de Bilhetes: Cinema, Festa, Show e Teatro;");
				System.out.println("Digite 1 para pedir bilhete de cinema;");
				System.out.println("Digite 2 para pedir bilhete de festa;");
				System.out.println("Digite 3 para pedir bilhete de show;");
				System.out.println("Digite 4 para pedir bilhete de teatro;");
				System.out.println("------------------------------");
				System.out.print("Resposta: ");
				// lendo o tipo de bilhete
				b = ler.next();

				// comprando bilhetes de cinema;
				if (b.equals("1")) {
					repositorio.addBilheteRepositorio("Bilhete de Cinema");
					ArrayList<String> bilhetes = repositorio.getBilheteRepositorio();
					System.out.printf("Você escolheu comprar %s \n", bilhetes);
					System.out.println("------------------------------");
					System.out.print("Quantos bilhetes você deseja: ");
					quantidade = ler.nextInt();
					System.out.println("------------------------------");
					BilheteDeCinema b1 = new BilheteDeCinema(2.30, 30 * quantidade, quantidade);
					System.out.println("Você pediu " + b1.quantidade + " bilhetes.");
					soma = soma + b1.preço;
					System.out.println("O valor total é igual a R$" + soma);

					// comprando bilhetes de festa;
				} else if (b.equals("2")) {
					repositorio.addBilheteRepositorio("Bilhete de Festa");
					ArrayList<String> bilhetes = repositorio.getBilheteRepositorio();
					System.out.printf("Você escolheu comprar %s \n", bilhetes);
					System.out.println("------------------------------");
					System.out.print("Quantos bilhetes você deseja: ");
					quantidade = ler.nextInt();
					System.out.println("------------------------------");
					BilheteDeFesta f1 = new BilheteDeFesta(2.30, 20 * quantidade, quantidade);
					System.out.println("Você pediu " + f1.quantidade + " bilhetes.");
					soma = soma + f1.preço;
					System.out.println("O valor total é igual a R$" + soma);

					// comprando bilhetes de show;
				} else if (b.equals("3")) {
					repositorio.addBilheteRepositorio("Bilhete de Show");
					ArrayList<String> bilhetes = repositorio.getBilheteRepositorio();
					System.out.printf("Você escolheu comprar %s \n", bilhetes);
					System.out.println("------------------------------");
					System.out.print("Quantos bilhetes você deseja: ");
					quantidade = ler.nextInt();
					System.out.println("------------------------------");
					BilheteDeShow s1 = new BilheteDeShow(2.30, 90 * quantidade, quantidade);
					System.out.println("Você pediu " + s1.quantidade + " bilhetes.");
					soma = soma + s1.preço;
					System.out.println("O valor total é igual a R$" + soma);

					// comprando bilhetes de teatro;
				} else if (b.equals("4")) {
					repositorio.addBilheteRepositorio("Bilhete de Teatro");
					ArrayList<String> bilhetes = repositorio.getBilheteRepositorio();
					System.out.printf("Você escolheu comprar %s \n", bilhetes);
					System.out.println("------------------------------");
					System.out.print("Quantos bilhetes você deseja: ");
					quantidade = ler.nextInt();
					System.out.println("------------------------------");
					BilheteDeTeatro t1 = new BilheteDeTeatro(2.30, 15 * quantidade, quantidade);
					System.out.println("Você pediu " + t1.quantidade + " bilhetes.");
					soma = soma + t1.preço;
					System.out.println("O valor total é igual a R$" + soma);

					// caso o usuário escolha uma opção inválida;
				} else {
					System.out.println("Erro! Opção inválida!");
					System.out.println("Por favor, insira um dos valores indicados.");
				}
			}
			// fim da estrutura de repetição;
		} while (x != "1");
		ler.close();
	}

}
