package lab1;

import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public class Banco {

    TarjetaDebito debito;
    TarjetaCredito credito;
    Transferencia transferir;
    Deposito depositar;
    Retiro retirar;
    
    //Atributos
    private ArrayList<Clientes> ListaClientes;
    private ArrayList<CuentaDolares> ListaCuentaDolares;
    private ArrayList<CuentaColones> ListaCuentaColones;
    private ArrayList<Transacciones> ListaTransacciones;
    
    
    //Metodos
    public void agregarClientes(Clientes cliente) {
        ListaClientes.add(cliente);
    }

    public void eliminarClientes(Clientes cliente) {
        ListaClientes.remove(cliente);
    }

    public void agregarCuentaDolar(CuentaDolares dolares) {
        ListaCuentaDolares.add(dolares);
    }

    public void agregarCuentaColon(CuentaColones colones) {
        ListaCuentaColones.add(colones);
    }

    public void eliminarCuentaDolar(CuentaColones dolar) {
        if (dolar.getSaldo() == 0) {
            ListaCuentaColones.remove(dolar);
        }
    }

    public void eliminarCuentaColon(CuentaColones colones) {
        if (colones.getSaldo() == 0) {
            ListaCuentaColones.remove(colones);
        }
    }

    public void agregarTarjetaCredito(Clientes cliente) {
        cliente.listaTarjetaCredito.add(credito);

    }

    public void eliminarTarjetaCredito(Clientes cliente) {
        cliente.listaTarjetaCredito.remove(credito);

    }

    public void asignarTarjetaDebito(Clientes cliente) {
        debito = new TarjetaDebito();
        cliente.listaTarjetaDebito.add(debito);
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

    //Constructor
   
}
