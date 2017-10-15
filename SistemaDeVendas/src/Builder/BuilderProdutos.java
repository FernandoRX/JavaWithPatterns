/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Produtos.Produto;

/**
 *
 * @author Fernando
 */
public interface BuilderProdutos {
    public abstract BuilderProdutos daCategoria(String categoria);
    public abstract Produto build();
}
