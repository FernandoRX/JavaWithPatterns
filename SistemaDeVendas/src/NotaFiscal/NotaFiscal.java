/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotaFiscal;

import Buscadores.BuscadorDeBanco;
import ViaDoCliente.ViaDoCliente;
import Produtos.Produto;
import ViaDoCliente.Email;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 */
public abstract class NotaFiscal {
    private List<Produto> produtos = new ArrayList<>();
    private BuscadorDeBanco buscadorBanco ;
    private String banco = "";
    private ViaDoCliente via ;
    private Double precoTotal  = 0d;
    private String nomeProduto  = "";
    
    public NotaFiscal(Produto produto , String banco, BuscadorDeBanco buscador){
        this.banco = banco ;
        this.buscadorBanco = buscador ;
        addProduto(produto);
        via = new Email();
    }
    
    public final void gerarNotaFiscal(){
        getProdutos();
        getPrecoProdutos();
        buscarBanco();
        gerarVia();
        salvarNota();
    } 
    
    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    
    public void getProdutos(){
        for(Produto p : produtos){
            nomeProduto = nomeProduto + "\n  " + p.getNome();       
        }   
        System.out.println("Produtos:"+ nomeProduto);
    }
    
    public void getPrecoProdutos(){
        for(Produto p : produtos){
        precoTotal = precoTotal + p.getPreco(); 
        }
        System.out.println("Valor total a pagar: " + precoTotal);
    }
    
    public void setVia(ViaDoCliente via) {
        this.via = via;
    }
    
    public void gerarVia(){
    via.entregandoViaDoCliente();
    }
    
    public void buscarBanco(){
        System.out.println("Banco: " + buscadorBanco.recuperar(banco));
    };
    
    public abstract void salvarNota();   
}
