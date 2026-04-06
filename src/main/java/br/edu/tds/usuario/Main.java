/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.usuario;

/**
 *
 * @author aluno
 */
public class Main {
       public static void main(String[] args) {

       UsuarioDAO dao = new UsuarioDAO();

       // CADASTRO
       Usuario u1 = new Usuario("MIguel", "miguel@email.com", "12354");
       dao.cadastrar(u1);

       // LOGIN
       boolean acesso = dao.login("carlos@email.com", "1234");

       if (acesso) {
           System.out.println("Login realizado com sucesso!");
       } else {
           System.out.println("Email ou senha inválidos!");
       }
   }

}
