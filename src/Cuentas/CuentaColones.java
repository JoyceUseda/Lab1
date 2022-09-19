
package Cuentas;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class CuentaColones {
    private String numeroCuenta;
    private float saldo;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }



    public CuentaColones(String numeroCuenta, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public boolean identificarCuenta(Object cuenta){
        if(this==cuenta) return true;
        if(cuenta==null || getClass() != cuenta.getClass()) return false;
        CuentaColones numeroC = (CuentaColones) cuenta;
        return Float.compare(numeroC.saldo, saldo)== 0 &&
                Objects.equals(numeroCuenta,numeroC.numeroCuenta);

    }

    public CuentaColones(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public void movimientoRetiroColones(float monto){
        saldo= saldo-monto;
    }

    public void movimientoDepositoColones(float monto){
        saldo= saldo+monto;
    }

}

