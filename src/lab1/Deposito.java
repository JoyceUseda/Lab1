/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Objects;

/**
 *
 * @author andre
 */
public class Deposito extends Transacciones {

//    public Deposito(int Id, String cuenta, double monto, double saldoanterior, double saldofinal) {
//        super(Id, cuenta, monto, saldoanterior, saldofinal);
//    }
    Clientes cliente;
    CuentaColones colones;

    public void DepositoColones(String cuenta, float monto) {
        this.cuenta = cliente.buscarCuentaColones(cuenta);
        this.saldoanterior = (float) colones.getSaldo();
        this.colones.setSaldo();
        this.saldofinal = (float) colones.getSaldo();
    }

}
