
package lab1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author andre
 */
public abstract class Transacciones {
    Clientes cliente;
    CuentaColones colones;
    CuentaDolares dolares;

    protected int Id;
    protected String fecha;
    protected String cuenta;
    protected String cuentadestino;
    protected float monto;
    protected float saldo;
    protected float saldoanterior;
    protected float saldofinal;
    protected float saldoanteriordestino;
    protected float saldofinaldestino;
    

    public int getId() {
        return Id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getCuentadestino() {
        return cuentadestino;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    public double getSaldoanterior() {
        return saldoanterior;
    }

    public double getSaldofinal() {
        return saldofinal;
    }

    public double getSaldoanteriordestino() {
        return saldoanteriordestino;
    }

    public double getSaldofinaldestino() {
        return saldofinaldestino;
    }
      public abstract void TransferirColones(String cuenta, String cuentadestino, float monto);
      public abstract void TransferirDolares(String cuenta, String cuentadestino, float monto);
      public abstract void DepositoColones(String cuenta, float monto);
      public abstract void DepositoDolares(String cuenta, float monto);
//    public abstract void RetiroColones(String cuenta, double monto);
//    public abstract void RetiroDolares()

  
    public Transacciones(int Id, String cuenta, float monto) {

        this.Id = Id;
        this.fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        this.cuenta = cuenta;
        this.monto = monto;
//        this.saldoanterior = saldoanterior;
//        this.saldofinal = saldofinal;
    }
    public Transacciones(int Id, String cuentaorigen, String cuentadestino, float monto) {
        this.Id = Id;
        this.cuenta = cuentaorigen;
        this.cuentadestino = cuentadestino;
        this.monto = monto;
//        this.saldoanterior = saldoanterior;
//        this.saldofinal = saldofinal;
//        this.saldoanteriordestino = saldoanteriordestino;
//        this.saldofinaldestino = saldofinaldestino;
    }
}
