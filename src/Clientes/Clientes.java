package Clientes;
import Cuentas.Cuenta;
import Tarjetas.TarjetaDebito;
import Tarjetas.TarjetaCredito;
import java.util.ArrayList;
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
    private ArrayList<TarjetaCredito> listaTarjetaCredito;
    private TarjetaDebito tarjetaDebito;


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

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public TarjetaDebito getTarjetaDebito() {
        return tarjetaDebito;
    }

    public ArrayList<TarjetaCredito> getListaTarjetaCredito() {
        return listaTarjetaCredito;
    }

    public Clientes(String nombre, String cedula, Integer fechaNacimiento,
            String correo, Integer telefono, int edad, ArrayList<Cuenta> listaCuentas,
            ArrayList<TarjetaCredito> listaTarjetaCredito,
            TarjetaDebito tarjetaDebito) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.listaCuentas = listaCuentas;
        this.listaTarjetaCredito = listaTarjetaCredito;
        this.tarjetaDebito = tarjetaDebito;
    }

    public String buscarCuentas(String numeroCuenta) {
        Cuenta busqueda = new Cuenta(numeroCuenta);
        boolean existe = listaCuentas.contains(busqueda);
        if (existe) {
            return numeroCuenta;
        } else {
            return null;
        }
    }

}
