/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViaDoCliente;

/**
 *
 * @author Fernando
 */
public class Email implements ViaDoCliente{
    @Override
    public void entregandoViaDoCliente() {
        System.out.println("Via do Cliente esta sendo enviada para seu email!");
    }
}
