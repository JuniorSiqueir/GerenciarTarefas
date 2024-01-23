package com.gerenciar.gerenciador.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gerenciar.gerenciador.Entidades.Usuario;


public class UsuarioDAO {
    private Connection conexao;

    public UsuarioDAO() {
        String url = "jdbc:postgresql://localhost:5432";
        String usuario = "postgres";
        String senha = "04122004";

        try {
            Class.forName("org.postgresql.Driver");
            this.conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para criar um usuário
    public void criarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome, email) VALUES (?, ?)";

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}