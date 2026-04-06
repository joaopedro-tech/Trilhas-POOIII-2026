package br.edu.tds.usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import br.edu.tds.usuario.Conexao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

   // CADASTRAR USUÁRIO
   public void cadastrar(Usuario usuario) {
       String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";

       try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

           stmt.setString(1, usuario.getNome());
           stmt.setString(2, usuario.getEmail());
           stmt.setString(3, usuario.getSenha());
           stmt.executeUpdate();
           System.out.println("Usuário cadastrado com sucesso!");

       } catch (Exception e) {
           System.out.println("Erro ao cadastrar: " + e.getMessage());
       }
   }

   // VALIDAR LOGIN
   public boolean login(String email, String senha) {
       String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";

       try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

           stmt.setString(1, email);
           stmt.setString(2, senha);
           ResultSet rs = stmt.executeQuery();
           return rs.next(); // se encontrou, login válido

       } catch (Exception e) {
           System.out.println("Erro no login: " + e.getMessage());
           return false;
       }
   }
}

