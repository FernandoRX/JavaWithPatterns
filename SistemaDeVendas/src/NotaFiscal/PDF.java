/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotaFiscal;

import Buscadores.BuscadorDeBanco;
import Produtos.Produto;

/**
 *
 * @author Fernando
 */
public class PDF extends NotaFiscal{

    public PDF(Produto produto, String banco, BuscadorDeBanco buscador) {
        super(produto, banco, buscador);
    }
    
    @Override
    public void salvarNota() {
        System.out.println("Salvando nota em .PDF ");
    }
    
}
