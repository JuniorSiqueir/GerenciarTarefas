package com.gerenciador.gerenciar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

import com.gerenciador.Entidades.Usuario;

@SpringBootApplication
public class GerenciarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciarApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		Usuario usuario = new Usuario(null, null, null);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		usuario.setNome(nome);

		System.out.print("Digite o seu email: ");
		String email = scanner.nextLine();
		usuario.setEmail(email);

		System.out.println("Faça sua senha: ");
		String senha = scanner.nextLine();
		usuario.setSenha(senha);

		System.out.println("Seu nome: " + usuario.getNome());
        System.out.println("Seu email: " + usuario.getEmail());
		System.out.println("Sua senha está correta? Sua senha: " + usuario.getSenha());
		
		scanner.close();

	}

}
