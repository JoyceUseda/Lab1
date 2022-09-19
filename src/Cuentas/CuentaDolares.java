
package Cuentas;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class CuentaDolares extends Cuenta {
    protected static float tipoCambio;

    
    public float getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(float tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public CuentaDolares(float tipoCambio, String numeroCuenta, float saldo) {
        super(numeroCuenta, saldo);
        this.tipoCambio = tipoCambio;
    }

    public CuentaDolares(String numeroCuenta, float saldo) {
        super(numeroCuenta, saldo);
    }

 public CuentaDolares(float saldo){
     this.saldo=saldo;
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
 
