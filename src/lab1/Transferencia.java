
package lab1;

/**
 *
 * @author andre
 */
public class Transferencia extends Transacciones {
    
    
    @Override
    public void TransferirColones(String cuenta, String cuentadestino, float monto) {
        this.cuenta = cliente.buscarCuentaColones(cuenta);
        this.saldoanterior = this.getSaldo();
        this.saldo = -monto;
        this.saldofinal = this.getSaldo();
        this.cuentadestino = cliente.buscarCuentaColones(cuentadestino);
        this.saldoanteriordestino = this.getSaldo();
        this.saldo = +monto;
        this.saldofinaldestino = this.getSaldo();
    }
    
    @Override
     public void TransferirDolares(String cuenta, String cuentadestino, float monto) {
        this.cuenta = cliente.buscarCuentaDolares(cuenta);
        this.saldoanterior = this.getSaldo();
        this.saldo = -monto;
        this.saldofinal = this.getSaldo();
        this.cuentadestino = cliente.buscarCuentaDolares(cuentadestino);
        this.saldoanteriordestino = this.getSaldo();
        this.saldo = +monto;
        this.saldofinaldestino = this.getSaldo();
    }

    @Override
    public void DepositoColones(String cuenta, float monto) {
    }

    @Override
    public void DepositoDolares(String cuenta, float monto) {
    }

}
