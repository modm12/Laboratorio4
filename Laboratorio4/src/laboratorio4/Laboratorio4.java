/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

import Estados.Estado;
import Estados.Estado2;
import Estados.Estado3;
import Estados.EstadoInicial;
import Maquina.MaquinaDulce;

/**
 *
 * @author EST1522712
 */
public class Laboratorio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstadoInicial inicial = new EstadoInicial();
        Estado2 estado2 = new Estado2();
        Estado3 estado3 =new Estado3();
        
        MaquinaDulce maquina= new MaquinaDulce(0);
        maquina.agregarEstado(inicial);
        maquina.agregarEstado(estado2);
        maquina.agregarEstado(estado3);
        
        maquina.procesar();
        maquina.procesar();
        maquina.ingresarMoneda(true);
        maquina.procesar();
        maquina.procesar();
        maquina.procesar();
        
        maquina.procesar();
        maquina.procesar();
        maquina.procesar();
        
    }
    
}
