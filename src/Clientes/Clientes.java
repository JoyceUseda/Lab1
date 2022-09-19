package Clientes;


import Cuentas.Cuenta;
import Cuentas.CuentaColones;
import Cuentas.CuentaDolares;
import Tarjetas.TarjetaDebito;
import Tarjetas.TarjetaCredito;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Clientes {

    private String nombre;
    private String cedula;
    private Integer fechaNacimiento;
    private String correo;
    private Integer telefono;
    private int edad;
    private ArrayList<Cuenta> listaCuentas;
    public ArrayList<TarjetaDebito> listaTarjetaDebito;
    public ArrayList<TarjetaCredito> listaTarjetaCredito;

    CuentaColones colones;
    CuentaDolares dolares;

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    

    public ArrayList<TarjetaCredito> getListaTarjetaCredito() {
        return listaTarjetaCredito;
    }

    public Clientes(String nombre, String cedula, Integer fechaNacimiento, String correo,
            Integer telefono, int edad,
           ArrayList<TarjetaCredito> listaTarjetaCredito,
            CuentaColones colones, CuentaDolares dolares) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        
        this.listaTarjetaCredito = listaTarjetaCredito;
        this.colones = colones;
        this.dolares = dolares;
    }

//    public CuentaDolares buscarCtaDol(Integer cuenta) {
//        CuentaDolares buscar = new CuentaDolares(cuenta);
//        boolean existe = listaCuentaDolares.contains(buscar);
//        if (existe) {
//            
//        }
//    }

    public String buscarCuentaColones(String numeroCuenta) {
        Cuenta busquedaColones = new Cuenta(numeroCuenta);
        boolean existe = listaCuentas.contains(busquedaColones);
        if (existe) {
            return numeroCuenta;
        } else {
            return null;
        }
    }

    public String buscarCuentaDolares(String numeroCuenta) {
        Cuenta busquedaDolares = new Cuenta(numeroCuenta);
        boolean existe = listaCuentas.contains(busquedaDolares);
        if (existe) {
            return numeroCuenta;
        } else {
            return null;
        }
    }

//    public boolean equals(Object cuenta) {
//        if (this == cuenta) {
//            return true;
//        }
//        if (cuenta == null || getClass() != cuenta.getClass()) {
//            return false;
//        }
//        CuentaDolares numeroC = (CuentaDolares) cuenta;
//        return Objects.equals(numeroCuenta, numeroC.numeroCuenta);
//    }

}
