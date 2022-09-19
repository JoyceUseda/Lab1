
package Transacciones;

import Transacciones.Transacciones;

/**
 *
 * @author andre
 */
public class Retiro extends Transacciones {

    public Retiro(int Id, String cuenta, float monto) {
        super(Id, cuenta, monto);
    }
    
   public void RetiroColones(String cuenta, float monto) {
        this.cuenta = cliente.buscarCuentaColones(cuenta);
        this.saldoanterior = colones.getSaldo();
        colones.movimientoRetiroColones(monto);
        this.saldofinal = colones.getSaldo();
    }

    public void RetiroDolares(String cuenta, float monto) {
        this.cuenta = cliente.buscarCuentaDolares(cuenta);
        this.saldoanterior = colones.getSaldo();
        dolares.movimientoRetiroDolares(monto);
        this.saldofinal = colones.getSaldo();
    }

    @Override
    public void TransferirColones(String cuenta, String cuentadestino, float monto) {
    }

    @Override
    public void TransferirDolares(String cuenta, String cuentadestino, float monto) {
    }

    @Override
    public void DepositoColones(String cuenta, float monto) {
    }

    @Override
    public void DepositoDolares(String cuenta, float monto) {
    }

}
