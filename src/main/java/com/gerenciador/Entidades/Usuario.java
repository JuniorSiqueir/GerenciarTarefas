package com.gerenciador.Entidades;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String email, String senha, String nome) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void status() {
        System.out.println("O nome do Usuario é " + this.getNome() + "e seu email é " + this.getEmail());
    }

}
