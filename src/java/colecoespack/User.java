/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoespack;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Iasmim
 */
public class User {
    private String nome;
    private String email;
    private String senha;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean cadastraUser() {
        try {
            java.sql.Connection conexao = new Conexao().conectar();
            String sql = "INSERT INTO usuario (nome, email, senha) VALUES (?,?,?)";

            if (conexao != null) {
                PreparedStatement ps = conexao.prepareStatement(sql);

                ps.setString(1, getNome());
                ps.setString(1, getEmail());
                ps.setString(1, getSenha());

                ps.execute();
                conexao.close();
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
    public boolean login() {
        java.sql.Connection conexao = new Conexao().conectar();
        String sql = "SELECT * FROM usuario WHERE email = ?";
        try {
            if (conexao != null) {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setString(1, getEmail());

                ResultSet result = ps.executeQuery();

                User u = new User();

                while (result.next()) {
                    u.setEmail(result.getString("login"));
                }

                if (u.getEmail().isEmpty()) {
                    return false;
                } else {
                    return true;
                }

            } else {
                return false;
            }
        } catch (SQLException e) {
            System.err.print("Exceção gerada ao tentar buscar os dados: " + e.getMessage());
            return false;
        }
    }
}
