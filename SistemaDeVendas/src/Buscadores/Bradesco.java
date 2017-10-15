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
public class Bradesco extends BuscadorDeBanco{

    public Bradesco(BuscadorDeBanco proximo) {
        super(proximo);
    }

    @Override
    protected String buscar(String banco) {
       if(banco.equals("Bradesco")){
        return "Bradesco" ;
        }
        return null ;
    }
    
}
