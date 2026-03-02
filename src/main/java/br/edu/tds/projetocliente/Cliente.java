/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetocliente;

/**
 *
 * @author aluno
 */
public class Cliente {
    
    private String nome;
    private int idade;
    private String cpf;
    
    public Cliente(){
        
    }
    
    public Cliente(String nome, int idade, String cpf){
        
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    public void imprimeDadosCliente(){
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("cpf: " + this.cpf + "\n");
        
    }  
}
