/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDeDiseno.MVC.Modelo;

import Cuentas.*;

/**
 *
 * @author ADMIN
 */
public abstract class Cuenta {

    protected String numeroCuenta;
    protected float saldo;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }

    public Cuenta(String numeroCuenta, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Cuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public void movimientoRetiro(float monto) {
        if (saldo < monto) {
            System.out.println("Monto mayor a saldo actual en la cuenta no se puede realizar retiro");
        } else {
            this.saldo = saldo - monto;
        }
    }

    public void movimientoDeposito(float monto) {
        this.saldo = saldo + monto;
    }

}
