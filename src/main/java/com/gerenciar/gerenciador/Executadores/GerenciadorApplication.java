package com.gerenciar.gerenciador.Executadores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class GerenciadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		System.out.println("---------------------------");
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Adicionar Usuário");
		System.out.println("2 - Adicionar Tarefa");
		System.out.print("Opção: ");

		int escolha = scanner.nextInt();
		scanner.nextLine();

		if (escolha == 1) {
			UsuarioApp uApp = new UsuarioApp();
			uApp.executar();

		} else if (escolha == 2) {
			TarefasApp tApp = new TarefasApp();
			tApp.executar();

		} else {
			System.out.println("Opção inválida");

		}

		scanner.close();

	}

}
