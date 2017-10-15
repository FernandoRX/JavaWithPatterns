/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;


import Produtos.Produto;
import Produtos.Simples;

/**
 *
 * @author Fernando
 */
public class BuilderSimples implements BuilderProdutos{
    private Simples produto = new Simples();
    
    public BuilderSimples chamado(String nome){
        produto.setNome(nome);
        return this;
    }
    
    public BuilderSimples custa(Double preco){
        produto.setPreco(preco);
        return this;
    }
    
    @Override
    public BuilderSimples daCategoria(String categoria){
        produto.setCategoria(categoria);
        return this ;
    }
    @Override
    public Produto build(){
        return produto ;
    }
    
   
}
