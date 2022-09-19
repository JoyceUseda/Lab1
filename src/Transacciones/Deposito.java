package Transacciones;



/**
 *
 * @author andre
 */
public class Deposito extends Transacciones {
    
   
    public Deposito(int Id, String cuenta, float monto) {
        super(Id, cuenta, monto);
    }
    
    @Override
    public void Movimiento(String cuenta, float monto) {
        this.cuenta = bc.buscarCuentas(cuenta);
        this.saldoanterior = ct.getSaldo();
        ct.movimientoDeposito(monto);
        this.saldofinal = ct.getSaldo();
    }
    
   
}
