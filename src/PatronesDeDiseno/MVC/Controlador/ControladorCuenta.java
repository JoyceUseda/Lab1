/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDeDiseno.MVC.Controlador;


import PatronesDeDiseno.MVC.Modelo.BaseDeDatos;
import PatronesDeDiseno.MVC.Modelo.Cuenta;
import PatronesDeDiseno.MVC.Vista.VistaConsolaCuenta;

/**
 *
 * @author Joyce
 */
public class ControladorCuenta {
    private VistaConsolaCuenta vista;
    private Cuenta modelo;
    private BaseDeDatos tabla;

    
    //Metodos
    public void setVista(VistaConsolaCuenta vista) {
        this.vista = vista;
    }

    public void setModelo(Cuenta modelo) {
        this.modelo = modelo;
    }
    
    //Constructor

    public ControladorCuenta(VistaConsolaCuenta vista, Cuenta modelo, BaseDeDatos tabla) {
        this.vista = vista;
        this.modelo = modelo;
        this.tabla = tabla;
    }
    
    
    public void agregar(){
        if (tabla.buscar(modelo.getNumeroCuenta())==null){
            tabla.agregar(modelo);
        }else{
            vista.error("El numero de cuenta ya existe");
        }
        
    }
    
    public void buscar(){
        Cuenta cuenta = tabla .buscar(modelo.getNumeroCuenta());
        if(cuenta==null){
            vista.error("La cuenta no existe");
            //Vista indicar error
        }else{
            vista.mostrar(cuenta);
            //Vista muesttra cuenta
        }     
    }
    
    
    
}
