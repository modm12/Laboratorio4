/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estados;

import Maquina.MaquinaDulce;

/**
 *
 * @author EST1522712
 */
public class Estado3 implements Estado{

    @Override
    public void cambioEstado(MaquinaDulce m) {
        m.ingresarMoneda(false);
        System.out.println("Entregando Dulces");
        m.setEstado(0);
    }
    
}
