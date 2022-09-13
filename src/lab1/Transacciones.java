/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author andre
 */
public abstract class Transacciones {

    protected int Id;
    protected String fecha;
    protected String cuenta;
    //protected String cuentadestino;
    protected float monto;
    protected float saldoanterior;
    protected float saldofinal;
    //protected double saldoanteriordestino;
    //protected double saldofinaldestino;
    

    public int getId() {
        return Id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCuenta() {
        return cuenta;
    }
//
//    public String getCuentadestino() {
//        return cuentadestino;
//    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public double getSaldoanterior() {
        return saldoanterior;
    }

    public double getSaldofinal() {
        return saldofinal;
    }

//    public double getSaldoanteriordestino() {
//        return saldoanteriordestino;
//    }
//
//    public double getSaldofinaldestino() {
//        return saldofinaldestino;
//    }
//    public abstract void Transaccion(String cuenta, double monto);
//
//  
//    public Transacciones(int Id, String cuenta, double monto, double saldoanterior, double saldofinal) {
//
//        this.Id = Id;
//        this.fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
//        this.cuenta = cuenta;
//        this.monto = monto;
//        this.saldoanterior = saldoanterior;
//        this.saldofinal = saldofinal;
//    }
//    public Transacciones(int Id, String cuentaorigen, String cuentadestino, double monto, double saldoanterior, double saldofinal, double saldoanteriordestino, double saldofinaldestino) {
//        this.Id = Id;
//        this.cuenta = cuentaorigen;
//        this.cuentadestino = cuentadestino;
//        this.monto = monto;
//        this.saldoanterior = saldoanterior;
//        this.saldofinal = saldofinal;
//        this.saldoanteriordestino = saldoanteriordestino;
//        this.saldofinaldestino = saldofinaldestino;
//    }
}
