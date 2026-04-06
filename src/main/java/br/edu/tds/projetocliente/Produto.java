
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetocliente;

/**
 *
 * @author aluno
 */
public class Produto {
    
    private String nome;
    private float preco;
    private int quantidade;
    
    public Produto(){
        
    }
    
    public Produto(String nome, float preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome(){
        return this.nome;
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public void aplicarDesconto(float porcentual){
         preco = preco - (preco * porcentual);
    }
    
    public void aumentarQuantidade(int valor){
        quantidade = quantidade + valor;
    }
    
    public void dimunuirQuantidade(int valor){
        
        if(valor > quantidade){
            System.out.println("Não há unidades o suficiente");
        }else{
            quantidade = quantidade - valor;
        }
            
        
    }
    
    
}
