
package lab1;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class CuentaColones {
    private Integer numeroCuenta;
    private float saldo;

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }



    public CuentaColones(Integer numeroCuenta, float saldo) {
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

}

