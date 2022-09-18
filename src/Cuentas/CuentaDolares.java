
package Cuentas;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class CuentaDolares {
    private String numeroCuenta;
    private float saldo;
    private static float tipoCambio;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(float tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public CuentaDolares(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public CuentaDolares(String numeroCuenta, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

 public boolean identificarCuenta(Object cuenta){
        if(this==cuenta) return true;
        if(cuenta==null || getClass() != cuenta.getClass()) return false;
        CuentaDolares numeroC = (CuentaDolares) cuenta;
        return Float.compare(numeroC.saldo, saldo)== 0 &&
                Objects.equals(numeroCuenta,numeroC.numeroCuenta);   
}
 
 public void movimientoRetiroDolares(float monto){
        saldo= saldo-monto;
    }

    public void movimientoDepositoDolares(float monto){
        saldo= saldo+monto;
    }
}
 
