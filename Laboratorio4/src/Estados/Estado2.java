/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estados;

import Estados.Estado;
import Maquina.MaquinaDulce;

/**
 *
 * @author EST1522712
 */
public class Estado2 implements Estado{

    @Override
    public void cambioEstado(MaquinaDulce m) {
            System.out.println("estado 2 Girando");
            m.setEstado(2);
        }
    
}
