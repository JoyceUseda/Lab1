/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author andre
 */
public class Transferencia extends Transacciones {

    protected String cuentadestino;
    protected double saldoanteriordestino;
    protected double saldofinaldestino;
    

//    public Transferencia(int Id, String cuentaorigen, double monto, double saldoanterior, double saldofinal) {
//        super(Id, cuentaorigen, monto, saldoanterior, saldofinal);
//        this.cuentadestino = cuentadestino;
//        this.saldoanteriordestino = saldoanteriordestino;
//        this.saldofinaldestino = saldofinaldestino;
//    }
    public String getCuentadestino() {
        return cuentadestino;
    }

    public void setCuentadestino(String cuentadestino) {
        this.cuentadestino = cuentadestino;
    }

    public double getSaldoanteriordestino() {
        return saldoanteriordestino;
    }

    public void setSaldoanteriordestino(double saldoanteriordestino) {
        this.saldoanteriordestino = saldoanteriordestino;
    }

    public double getSaldofinaldestino() {
        return saldofinaldestino;
    }

    public void setSaldofinaldestino(double saldofinaldestino) {
        this.saldofinaldestino = saldofinaldestino;
    }

    public void Transferir(String cuenta, String cuentadestino, double monto) {
        this.cuenta = cuenta;
        this.saldoanterior = this.getSaldo();
        this.saldo = -monto;
        this.saldofinal = this.getSaldo();
        this.cuentadestino = cuenta;
        this.saldoanteriordestino = this.getSaldo();
        this.saldo = +monto;
        this.saldofinaldestino = this.getSaldo();
    }

}
