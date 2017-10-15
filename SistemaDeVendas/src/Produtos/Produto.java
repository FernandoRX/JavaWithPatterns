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
public interface Produto { 
    public abstract String getNome();   
    public abstract Double getPreco();
    public abstract String getCategoria();
    public abstract void setCategoria(String categoria);

}
