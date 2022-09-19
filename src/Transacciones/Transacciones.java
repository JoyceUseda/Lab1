package Transacciones;

import Banco.Banco;
import Clientes.Clientes;
import Cuentas.Cuenta;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author andre
 */
public abstract class Transacciones {

    Clientes cliente;
    Cuenta ct;
    Banco bc;

    protected int Id;
    protected String fecha;
    protected String cuenta;
    protected float monto;
    protected float saldoanterior;
    protected float saldofinal;

    public int getId() {
        return Id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getMonto() {
        return monto;
    }

    public double getSaldoanterior() {
        return saldoanterior;
    }

    public double getSaldofinal() {
        return saldofinal;
    }

    public abstract void Movimiento(String cuenta, float monto);

    public Transacciones(int Id, String cuenta, float monto) {

        this.Id = Id;
        this.fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        this.cuenta = cuenta;
        this.saldoanterior = ct.getSaldo();
        this.monto = monto;
        this.saldofinal = ct.getSaldo();
    }

}
