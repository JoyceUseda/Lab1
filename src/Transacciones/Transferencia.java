package Transacciones;


/**
 *
 * @author andre
 */
public class Transferencia extends Transacciones {

    private String cuentaDestino;
    private float saldoAnteriorDestino;
    private float saldoFinalDestino;

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public float getSaldoAnteriorDestino() {
        return saldoAnteriorDestino;
    }

    public float getSaldoFinalDestino() {
        return saldoFinalDestino;
    }

    public Transferencia(String cuentaDestino, int Id, String cuenta, float monto) {
        super(Id, cuenta, monto);
        this.cuentaDestino = bc.buscarCuentas(cuenta);
    }


    @Override
    public void Movimiento(String cuenta, float monto) {
        this.cuenta = bc.buscarCuentas(cuenta);
        this.saldoanterior = ct.getSaldo();
        ct.movimientoRetiro(monto);
        this.saldofinal = ct.getSaldo();
        this.cuentaDestino = this.getCuentaDestino();
        this.saldoAnteriorDestino= ct.getSaldo();
        ct.movimientoDeposito(monto);
        this.saldoFinalDestino = ct.getSaldo();
    }

}
