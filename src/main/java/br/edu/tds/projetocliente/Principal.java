/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetocliente;

/**
 *
 * @author aluno
 */
public class Principal {
    
        
     
    
         public static void main(String[] args){
           /*
             
              System.out.println("Testando objeto da classe");

            Cliente c1 = new Cliente("Davi", 19, "123456789");
            c1.imprimeDadosCliente();

            Cliente c2 = new Cliente("João", 43, "387654381");
            c2.imprimeDadosCliente();

            Cliente c3 = new Cliente("Manuel", 33, "11223344");
            c3.imprimeDadosCliente();
            
            */  
           
            Produto p1 = new Produto("Veja", 25, 5);
            String nome = p1.getNome();
            float preco = p1.getPreco();
            int quantidade = p1.getQuantidade();
            System.out.println("Nome: " + nome);
            System.out.println("Preco: " + preco );
            System.out.println("Quantidade: " + quantidade);
            p1.aplicarDesconto(0.2F);
            p1.aumentarQuantidade(3);
            System.out.println("nova quantidade: " + p1.getQuantidade());
            System.out.println("Novo preco: " + p1.getPreco() + "\n");
            
            
            
            Produto p2 = new Produto("Sabonete" , 20, 5 );
            nome = p2.getNome();
            preco = p2.getPreco();
            quantidade = p2.getQuantidade();
            System.out.println("Nome: " + nome);
            System.out.println("Preco: " + preco );
            System.out.println("Quantidade: " + quantidade);
            p2.dimunuirQuantidade(10);
            System.out.println("Nova quantidade: " + p2.getQuantidade() + "\n");
            
            
            Produto p3 = new Produto();
            p3.setNome("Pizza");
            p3.setPreco(60);
            p3.setQuantidade(1);
            System.out.println("Nome: " + p3.getNome());
            System.out.println("Preco: " + p3.getPreco());
            System.out.println("Quantidade: " + p3.getQuantidade() + "\n");
            
            
            Produto p4 = new Produto();
            p4.setNome("X-Tudo");
            p4.setPreco(54);
            p4.setQuantidade(2);
            System.out.println("Nome: " + p4.getNome());
            System.out.println("Preco: " + p4.getPreco() );
            System.out.println("Quantidade: " + p4.getQuantidade() + "\n");
            
            
        }
      
    
    
   
    
    
    

}
