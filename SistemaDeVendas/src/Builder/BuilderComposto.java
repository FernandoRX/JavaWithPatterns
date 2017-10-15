/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Produtos.Composto;
import Produtos.Produto;

/**
 *
 * @author Fernando
 */
public class BuilderComposto implements BuilderProdutos {
    private Composto produto = new Composto();
        
    @Override
     public BuilderComposto daCategoria(String categoria){
         produto.setCategoria(categoria);
         return this ;
     }   
     
     public BuilderComposto contem(Produto produto1){
        this.produto.setProduto1(produto1);
        return this ;
     }
     
     public BuilderComposto mais(Produto produto2){
         this.produto.setProduto2(produto2);
         return this ;
     }
     
    @Override
     public Produto build(){
        return produto ;
     }
}
