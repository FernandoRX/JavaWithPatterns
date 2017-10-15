/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buscadores;

/**
 *
 * @author Fernando
 */
public abstract class BuscadorDeBanco {
    protected BuscadorDeBanco proximo ;
    private String nomeBanco ; 
    
    public BuscadorDeBanco(BuscadorDeBanco proximo){
        this.proximo = proximo ;
    }
    
    public String recuperar(String banco){
        nomeBanco = banco ;
        String retorno = buscar(banco);
        if(retorno != null ){
            return retorno ;
        }
        return buscaDoProximo();
    } 
    
    protected abstract String buscar(String banco);
    
    protected String buscaDoProximo(){
        if (proximo != null) {
            return proximo.recuperar(nomeBanco);
        }
        return "Banco informado não encontrado";
    }
}
