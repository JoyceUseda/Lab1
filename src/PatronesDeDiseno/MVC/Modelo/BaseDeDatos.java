/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDeDiseno.MVC.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public class BaseDeDatos {
    private ArrayList<Cuenta> cuentas;
    
    //Metodos
    public void agregar(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }
    
    public Cuenta buscar(String numero){
        for(Cuenta cuenta : cuentas){
            if(cuenta.getNumeroCuenta().equals(numero)){
                return cuenta;
            }
        }
        return null;
    }

    public BaseDeDatos() {
        this.cuentas = new ArrayList<Cuenta>();
    }
    
}
