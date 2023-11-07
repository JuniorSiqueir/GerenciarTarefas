package com.gerenciador.Executadores;

import java.util.Scanner;

import com.gerenciador.Entidades.Erro;
import com.gerenciador.Entidades.Usuario;

public class UsuarioApp {
    public void executar() {
        Usuario usuario = new Usuario(null, null, null);

        Scanner scanner = new Scanner(System.in);

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
        System.out.println("---------------------------");

        scanner.close();
    }

}
