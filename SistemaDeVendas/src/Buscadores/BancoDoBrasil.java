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
public class BancoDoBrasil extends BuscadorDeBanco {

    public BancoDoBrasil(BuscadorDeBanco proximo) {
        super(proximo);
    }

    @Override
    protected String buscar(String banco) {
        if(banco.equals("Banco do Brasil")){
        return "Banco do Brasil" ;
        }
        return null ;
    }
    
}
