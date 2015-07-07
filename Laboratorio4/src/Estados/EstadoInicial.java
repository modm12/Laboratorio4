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
public class EstadoInicial implements Estado {

    @Override
    public void cambioEstado(MaquinaDulce m) {
        
        if(m.isMoneda()){
            m.setEstado(1);            
            System.out.println("Acepto La Moneda");
        }else{
            System.out.println("No hay Moneda");
           
        }
    }
    
}
