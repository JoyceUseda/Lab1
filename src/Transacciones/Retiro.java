
package Transacciones;


/**
 *
 * @author andre
 */
public class Retiro extends Transacciones {

    public Retiro(int Id, String cuenta, float monto) {
        super(Id, cuenta, monto);
    }

   @Override
    public void Movimiento(String cuenta, float monto) {
        this.cuenta = bc.buscarCuentas(cuenta);
        this.saldoanterior = ct.getSaldo();
        ct.movimientoRetiro(monto);
        this.saldofinal = ct.getSaldo();
    }
}
