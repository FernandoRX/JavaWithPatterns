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
public class Simples implements Produto {
    private String nome ;
    private Double preco ;
    private String categoria ;
    
    @Override
    public String getNome() {
        return nome ;
    }

    @Override
    public Double getPreco() {
        return preco ;
    }

    public void setNome(String nome) {
        this.nome = nome ;
    }

    public void setPreco(Double preco) {
        this.preco = preco ;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
        
}
