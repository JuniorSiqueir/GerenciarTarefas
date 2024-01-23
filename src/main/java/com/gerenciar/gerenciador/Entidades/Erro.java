package com.gerenciar.gerenciador.Entidades;

public class Erro {
    public static boolean validarNome(String nome) {
        if (nome == null || nome.length() < 2 || nome.length() > 50 || !nome.matches("^[a-zA-Z]+$")) {
            System.out.println("Nome Invalido!");
            return false;
        }
        return true;
    }
}