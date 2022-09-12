/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author andre
 */
public class Retiro extends Transacciones {

    public Retiro(int Id, String cuenta, double monto, double saldoanterior, double saldofinal) {
        super(Id, cuenta, monto, saldoanterior, saldofinal);
    }

    public void Transaccion(String cuenta, double monto) {
        this.cuenta = cuenta;
        this.saldoanterior = this.getSaldo();
        this.saldo=-monto;
        this.saldofinal = this.getSaldo();
    }

}
