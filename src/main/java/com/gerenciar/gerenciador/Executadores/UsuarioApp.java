package com.gerenciar.gerenciador.Executadores;

import java.util.Scanner;

import com.gerenciar.gerenciador.Conexao.UsuarioDAO;
import com.gerenciar.gerenciador.Entidades.Erro;
import com.gerenciar.gerenciador.Entidades.Usuario;

public class UsuarioApp {
    public void executar() {
        Usuario usuario = new Usuario(null, null);
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do usuário: ");
        String nome = scanner.nextLine();
        if (Erro.validarNome(nome)) {
            usuario.setNome(nome);
        } else {
        }

        System.out.print("Seu email: ");
        usuario.setEmail(scanner.nextLine());

        usuarioDAO.criarUsuario(usuario);

        System.out.println("---------------------------");
        System.out.println("Usuário adicionado:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("---------------------------");

        scanner.close();
    }

}
