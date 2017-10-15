/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadevendas;

import Builder.BuilderComposto;
import Builder.BuilderSimples;
import Buscadores.BancoDoBrasil;
import Buscadores.Bradesco;
import Buscadores.BuscadorDeBanco;
import Buscadores.Itau;
import Buscadores.Santander;
import NotaFiscal.NotaFiscal;
import NotaFiscal.PDF;
import Produtos.Composto;
import Produtos.Produto;
import Produtos.Simples;
import ViaDoCliente.Impressa;

/**
 *
 * @author Fernando 
 */
public class SistemaDeVendas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuscadorDeBanco bBancoDoBrasil = new BancoDoBrasil(null);
        BuscadorDeBanco bItau = new Itau(bBancoDoBrasil);
        BuscadorDeBanco bBradesco = new Bradesco(bItau);
        BuscadorDeBanco bSantander = new Santander(bBradesco);
        
        Produto p1 = new Simples();
        p1 = new BuilderSimples()
                .chamado("carne")
                .daCategoria("comidas")
                .custa(40.5)
                .build();
        
        Produto p2 = new Simples();
        p2 = new BuilderSimples()
                .chamado("cerveja")
                .daCategoria("bebidas")
                .custa(4.0)  
                .build(); 
        
        Produto p3 = new Composto();
        p3 = new BuilderComposto()
                .contem(p1)
                .mais(p2)
                .daCategoria("kit churrasco")
                .build();
        
        Produto p4  = new Simples();
        p4 = new BuilderSimples()
                .chamado("refrigerante")
                .daCategoria("bebidas")
                .custa(7.3)
                .build();
                
        
       NotaFiscal n = new PDF(p3,"Banco do Brasil",bSantander);
       n.addProduto(p4);
       n.setVia(new Impressa());
       n.gerarNotaFiscal();
       
    }
    
}
