
package lab1;

/**
 *
 * @author andre
 */
public class Retiro extends Transacciones {
    
   public void RetiroColones(String cuenta, float monto) {
        this.cuenta = cliente.buscarCuentaColones(cuenta);
        this.saldoanterior = colones.getSaldo();
        this.saldo = saldo-monto;
        this.saldofinal = this.getSaldo();
    }

    public void RetiroDolares(String cuenta, float monto) {
        this.cuenta = cliente.buscarCuentaDolares(cuenta);
        this.saldoanterior = colones.getSaldo();
        this.saldo = saldo-monto;
        this.saldofinal = this.getSaldo();
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
