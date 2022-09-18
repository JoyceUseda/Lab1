package Clientes;

import Cuentas.CuentaDolares;
import Cuentas.CuentaColones;
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
    private ArrayList<CuentaDolares> listaCuentaDolares;
    private ArrayList<CuentaColones> listaCuentaColones;
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

    public ArrayList<CuentaDolares> getListaCuentaDolares() {
        return listaCuentaDolares;
    }

    public ArrayList<CuentaColones> getListaCuentaColones() {
        return listaCuentaColones;
    }

    public ArrayList<TarjetaCredito> getListaTarjetaCredito() {
        return listaTarjetaCredito;
    }

    public Clientes(String nombre, String cedula, Integer fechaNacimiento, String correo,
            Integer telefono, int edad, ArrayList<CuentaDolares> listaCuentaDolares,
            ArrayList<CuentaColones> listaCuentaColones, ArrayList<TarjetaCredito> listaTarjetaCredito,
            CuentaColones colones, CuentaDolares dolares) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.listaCuentaDolares = listaCuentaDolares;
        this.listaCuentaColones = listaCuentaColones;
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
        CuentaColones busqueda = new CuentaColones(numeroCuenta);
        boolean existe = listaCuentaColones.contains(busqueda);
        if (existe) {
            return numeroCuenta;
        } else {
            return null;
        }
    }

    public String buscarCuentaDolares(String numeroCuenta) {
        CuentaDolares busqueda = new CuentaDolares(numeroCuenta);
        boolean existe = listaCuentaDolares.contains(busqueda);
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
