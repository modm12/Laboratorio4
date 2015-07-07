/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maquina;

import Estados.Estado;
import java.util.ArrayList;

/**
 *
 * @author EST1522712
 */
public class MaquinaDulce {

    private int estado;
    private boolean moneda;
    ArrayList<Estado> estados;

    public MaquinaDulce(int n) {
        estado=n;
        estados = new ArrayList<>();
    }
    
    public  void procesar() {
        estados.get(estado).cambioEstado(this);

    }
    public void setEstado(int e){
        estado=e;
        
    }
    public void ingresarMoneda(boolean b){
        this.moneda=b;
    }
    public boolean isMoneda() {
        return moneda;
    }
    
    public void agregarEstado(Estado e){
        estados.add(e);
    }
    

}
