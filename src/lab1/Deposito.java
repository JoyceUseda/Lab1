
package lab1;

/**
 *
 * @author andre
 */
public class Deposito extends Transacciones {

    public Deposito(int Id, String cuenta, float monto) {
        super(Id, cuenta, monto);
    }
    
    @Override
    public void DepositoColones(String cuenta, float monto) {
        this.cuenta = cliente.buscarCuentaColones(cuenta);
        this.saldoanterior = colones.getSaldo();
        colones.movimientoDepositoColones(monto);
        this.saldofinal = colones.getSaldo();
    }
    
    @Override
    public void DepositoDolares(String cuenta, float monto){
        this.cuenta = cliente.buscarCuentaDolares(cuenta);
        this.saldoanterior = dolares.getSaldo();
        dolares.movimientoDepositoDolares(monto);
        this.saldofinal = dolares.getSaldo();
    }

    @Override
    public void TransferirColones(String cuenta, String cuentadestino, float monto) {
    }

    @Override
    public void TransferirDolares(String cuenta, String cuentadestino, float monto) {
    }
}
