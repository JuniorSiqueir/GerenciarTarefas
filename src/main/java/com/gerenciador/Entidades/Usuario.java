package com.gerenciador.Entidades;

public class Usuario {
    private String nomeDoUsuario;
    private String email;
    private String senha;
    
    public Usuario(String email, String senha, String nomeDoUsuario) {
        this.email = email;
        this.senha = senha;
        this.nomeDoUsuario = nomeDoUsuario;
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
    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }
    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    public void status() {
        System.out.println("O nome do Usuario é " + this.getNomeDoUsuario() + "e seu email é " + this.getEmail());
    }

    
}
