
package lab1;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class CuentaDolares {
    private Integer numeroCuenta;
    private float saldo;
    private static double tipoCambio;

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public CuentaDolares(Integer numeroCuenta, float saldo) {
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
}
 
