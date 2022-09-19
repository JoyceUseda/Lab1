
package Cuentas;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class CuentaColones extends Cuenta{

    public CuentaColones(String numeroCuenta, float saldo) {
        super(numeroCuenta, saldo);
    }

    public CuentaColones(String numeroCuenta) {
        super(numeroCuenta);
    }

    public boolean identificarCuenta(Object cuenta){
        if(this==cuenta) return true;
        if(cuenta==null || getClass() != cuenta.getClass()) return false;
        CuentaColones numeroC = (CuentaColones) cuenta;
        return Float.compare(numeroC.saldo, saldo)== 0 &&
                Objects.equals(numeroCuenta,numeroC.numeroCuenta);

    }

    public void movimientoRetiroColones(float monto){
        saldo= saldo-monto;
    }

    public void movimientoDepositoColones(float monto){
        saldo= saldo+monto;
    }

}

