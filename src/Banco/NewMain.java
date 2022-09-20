/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import Cuentas.Cuenta;
import Cuentas.CuentaColones;
import Cuentas.CuentaDolares;

/**
 *
 * @author Joyce
 */
public class NewMain {
    
    public static void main(String[] args){
        Cuenta cc1 = new CuentaColones("cc1",1000);
        Cuenta cc2 = new CuentaColones("cc2");
        CuentaDolares cd1 = new CuentaDolares("cd1",2000,580);
        CuentaDolares cd2 = new CuentaDolares("cd2",100);
        CuentaDolares cd3 = new CuentaDolares("cd3");
        cd3.setTipoCambio(420);
        
        
        System.out.println("saldo :"+cc2.getSaldo());
        System.out.println(cd2.getTipoCambio());
    }
    
}
