/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;

/**
 *
 * @author Fernando
 */
public class Composto implements Produto{
    private Produto produto1; 
    private Produto produto2 ;
    private String categoria ;
    
    
    @Override
    public String getNome() {
        return produto1.getNome() + " e " + produto2.getNome() ;       
    }

    @Override
    public Double getPreco() {
        return produto1.getPreco() + produto2.getPreco() ;
   }
    
    @Override
    public String getCategoria() {
        return categoria ; 
   }

    @Override
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setProduto1(Produto produto1) {
        this.produto1 = produto1;
    }

    public void setProduto2(Produto produto2) {
        this.produto2 = produto2;
    }     
}
