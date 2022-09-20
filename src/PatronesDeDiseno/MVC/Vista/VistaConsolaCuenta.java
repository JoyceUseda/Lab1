/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDeDiseno.MVC.Vista;

import PatronesDeDiseno.MVC.Controlador.ControladorCuenta;
import PatronesDeDiseno.MVC.Modelo.BaseDeDatos;
import PatronesDeDiseno.MVC.Modelo.Cuenta;
import PatronesDeDiseno.MVC.Modelo.CuentaColones;
import PatronesDeDiseno.MVC.Modelo.CuentaDolares;
import java.util.Scanner;

/**
 *
 * @author Joyce
 */
public class VistaConsolaCuenta {
    private ControladorCuenta controlCuenta;
    
    public VistaConsolaCuenta(){
        this.controlCuenta = new ControladorCuenta(this,null,new BaseDeDatos());
    }
    //Procesos
    public void agregar(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta");
        String numero = leer.nextLine();
        System.out.println("Ingrese el saldo");
        float saldo = leer.nextFloat();
        System.out.println("1 Cuenta en Colones o 2 Cuenta en Dolares");
        int tipo = leer.nextInt();
        Cuenta cuenta;
        if(tipo==1){
            cuenta= new CuentaColones(numero,saldo);
        }else{
           cuenta= new CuentaDolares(numero, saldo); 
        }
        
        controlCuenta.setModelo(cuenta);
        controlCuenta.agregar();
    }
    
    public void buscar(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta");
        String numero = leer.nextLine();
        Cuenta cuenta = new CuentaColones(numero);
        controlCuenta.setModelo(cuenta);
        controlCuenta.buscar();
                
    }
    
    //Metodos
    public void mostrar(Cuenta cuenta){
        if(cuenta instanceof CuentaColones){
           System.out.println("Cuenta Colones"); 
        }else{
            System.out.println("Cuenta Dolares");
        }
        System.out.println("Numero de cuenta: "+cuenta.getNumeroCuenta());
        System.out.println("Saldo: "+cuenta.getSaldo());
    }
    
    public void error(String msg){
        System.out.println("Error: "+msg);
    }
}
