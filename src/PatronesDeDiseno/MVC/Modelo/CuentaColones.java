
package PatronesDeDiseno.MVC.Modelo;

import Cuentas.*;
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
        super(numeroCuenta,0);
    }

    public boolean identificarCuenta(Object cuenta){
        if(this==cuenta) return true;
        if(cuenta==null || getClass() != cuenta.getClass()) return false;
        CuentaColones numeroC = (CuentaColones) cuenta;
        return Float.compare(numeroC.saldo, saldo)== 0 &&
                Objects.equals(numeroCuenta,numeroC.numeroCuenta);

    }

 
}

