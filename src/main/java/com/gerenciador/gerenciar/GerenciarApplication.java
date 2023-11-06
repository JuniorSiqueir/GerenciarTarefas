package com.gerenciador.gerenciar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import com.gerenciador.Entidades.Usuario;
import com.gerenciador.Entidades.Tarefas;
import com.gerenciador.Entidades.Erro;

@SpringBootApplication
public class GerenciarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciarApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha uma opção:");
		System.out.println("1 - Adicionar Usuário");
		System.out.println("2 - Adicionar Tarefa");
		System.out.print("Opção: ");

		int escolha = scanner.nextInt();
		scanner.nextLine();

		if (escolha == 1) {
			Usuario usuario = new Usuario(null, null, null);

			System.out.print("Nome do usuário: ");
			String nome = scanner.nextLine();
			if (Erro.validarNome(nome)) {
				usuario.setNome(nome);
			} else {
			}

			System.out.print("Seu email: ");
			usuario.setEmail(scanner.nextLine());

			System.out.print("Sua Senha: ");
			usuario.setSenha(scanner.nextLine());

			System.out.println("---------------------------");
			System.out.println("Usuário adicionado:");
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Email: " + usuario.getEmail());
			System.out.println("Senha: " + usuario.getSenha());
		} else if (escolha == 2) {
			Tarefas tarefa = new Tarefas(false);

			System.out.print("Qual é o titulo da tarefa? ");
			tarefa.setTitulo(scanner.nextLine());

			System.out.print("Descrição da tarefa: ");
			tarefa.setDescricao(scanner.nextLine());

			System.out.print("Digite uma data limite no formato 'AAAA-MM-DD': ");
			String dataInput = scanner.nextLine();
			try {
				LocalDate dataUsuario = LocalDate.parse(dataInput);
				tarefa.setData(dataUsuario);
				System.out.println("Data inserida pelo usuário: " + tarefa.getData());
			} catch (DateTimeParseException e) {
				System.out.println("Formato de data inválido. Use o formato 'AAAA-MM-DD''.");
			}

			System.out.print("A Tarefa está concluida?(True(Sim)/ False(Não))");
			tarefa.setStatus(scanner.nextBoolean());
			System.out.println("Tarefa adicionada:");
			System.out.println("Titulo da Tarefa: " + tarefa.getTitulo());
			System.out.println("Descrição: " + tarefa.getDescricao());
			System.out.println("Data limite da Tarefa:" + tarefa.getData());
			System.out.println("Concluída: " + tarefa.getStatus());

		} else {
			System.out.println("Opção inválida");

		}

		scanner.close();

	}

}
