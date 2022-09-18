
package lab1;

/**
 *
 * @author andre
 */
public class Transferencia extends Transacciones {

    public Transferencia(int Id, String cuentaorigen, String cuentadestino, float monto) {
        super(Id, cuentaorigen, cuentadestino, monto);
    }
    
    
    @Override
    public void TransferirColones(String cuenta, String cuentadestino, float monto) {
        this.cuenta = cliente.buscarCuentaColones(cuenta);
        this.saldoanterior = this.getSaldo();
        colones.movimientoRetiroColones(monto);
        this.saldofinal = this.getSaldo();
        this.cuentadestino = cliente.buscarCuentaColones(cuentadestino);
        this.saldoanteriordestino = this.getSaldo();
        colones.movimientoDepositoColones(monto);
        this.saldofinaldestino = this.getSaldo();
    }
    
    @Override
     public void TransferirDolares(String cuenta, String cuentadestino, float monto) {
        this.cuenta = cliente.buscarCuentaDolares(cuenta);
        this.saldoanterior = this.getSaldo();
        dolares.movimientoRetiroDolares(monto);
        this.saldofinal = this.getSaldo();
        this.cuentadestino = cliente.buscarCuentaDolares(cuentadestino);
        this.saldoanteriordestino = this.getSaldo();
        dolares.movimientoRetiroDolares(monto);
        this.saldofinaldestino = this.getSaldo();
    }

    @Override
    public void DepositoColones(String cuenta, float monto) {
    }

    @Override
    public void DepositoDolares(String cuenta, float monto) {
    }

}
