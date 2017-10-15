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
public class Santander extends BuscadorDeBanco{

    public Santander(BuscadorDeBanco proximo) {
        super(proximo);
    }

    @Override
    protected String buscar(String banco) {
         if(banco.equals("Santander")){
        return "Santander" ;
        }
        return null ;
    }
    
}
