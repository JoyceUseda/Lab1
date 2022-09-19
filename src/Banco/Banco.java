package Banco;

import Transacciones.Transferencia;
import Transacciones.Retiro;
import Transacciones.Deposito;
import Transacciones.Transacciones;
import Clientes.Clientes;
import Cuentas.Cuenta;
import Cuentas.CuentaDolares;
import Cuentas.CuentaColones;
import Tarjetas.TarjetaDebito;
import Tarjetas.TarjetaCredito;
import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public class Banco {

    Cuenta cuenta;
    TarjetaDebito debito;
    TarjetaCredito credito;
    Transferencia transferir;
    Deposito depositar;
    Retiro retirar;

    //Atributos
    private ArrayList<Clientes> ListaClientes;
    private ArrayList<Transacciones> ListaTransacciones;
    private ArrayList<Cuenta> listaCuentas;
    protected ArrayList<TarjetaCredito> listaTarjetaCredito;
    private TarjetaDebito tarjetaDebito;

    //Metodos
    public void agregarClientes(Clientes cliente) {
        ListaClientes.add(cliente);
    }

    public void eliminarClientes(Clientes cliente) {
        ListaClientes.remove(cliente);
    }

    public void agregarCuentaDolar(CuentaDolares dolares) {
        listaCuentas.add(dolares);
    }

    public void agregarCuentaColon(CuentaColones colones) {
        listaCuentas.add(colones);
    }

    public void eliminarCuentaDolar(CuentaDolares dolar) {
        if (dolar.getSaldo() == 0) {
            listaCuentas.remove(dolar);
        }
    }

    public void eliminarCuentaColon(CuentaColones colones) {
        if (colones.getSaldo() == 0) {
            listaCuentas.remove(colones);
        }
    }

    public void agregarTarjetaCredito(Clientes cliente) {
        cliente.listaTarjetaCredito.add(credito);
    }

    public void eliminarTarjetaCredito(Clientes cliente) {
        cliente.listaTarjetaCredito.remove(credito);
    }

    public void asignarTarjetaDebito(Clientes cliente) {
//        debito = new TarjetaDebito();
        cliente.tarjetaDebito.equals(debito);
    }

    public void agregarTransferencia(Transferencia trasferir) {
        ListaTransacciones.add(transferir);
    }

    public void agregarDeposito(Deposito depositar) {
        ListaTransacciones.add(depositar);
    }

    public void agregarRetiro(Retiro retirar) {
        ListaTransacciones.add(retirar);
    }

    public String buscarCuentas(String numeroCuenta) {
        Cuenta busqueda = new Cuenta(numeroCuenta) {};
        boolean existe = listaCuentas.contains(busqueda);
        if (existe) {
            return cuenta.getNumeroCuenta();
        } else {
            return null;
        }
    }
}
