package PatronesDeDiseno.MVC.Modelo;

import Cuentas.*;
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
        if (tipoCambio>0)
        this.tipoCambio = tipoCambio;
    }

    public CuentaDolares(String numeroCuenta, float saldo, float tipoCambio) {
        super(numeroCuenta, saldo);
        this.tipoCambio = (tipoCambio);
    }

    public CuentaDolares(String numeroCuenta, float saldo) {
        super(numeroCuenta, saldo);
    }

    public CuentaDolares(String numeroCuenta) {
        super(numeroCuenta, 0);
    }

    public boolean identificarCuenta(Object cuenta) {
        if (this == cuenta) {
            return true;
        }
        if (cuenta == null || getClass() != cuenta.getClass()) {
            return false;
        }
        CuentaDolares numeroC = (CuentaDolares) cuenta;
        return Float.compare(numeroC.saldo, saldo) == 0
                && Objects.equals(numeroCuenta, numeroC.numeroCuenta);
    }

}
