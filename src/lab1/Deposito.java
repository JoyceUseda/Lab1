/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author andre
 */
public class Deposito extends Transacciones {

    public Deposito(int Id, String cuenta, double monto, double saldoanterior, double saldofinal) {
        super(Id, cuenta, monto, saldoanterior, saldofinal);
    }

    public void Transaccion(String cuenta, double monto) {
        this.cuentadestino = cuenta;
        this.saldoanterior = this.getSaldo();
        this.saldo=+monto;
        this.saldofinal = this.getSaldo();
    }

}
