
package lab1;

/**
 *
 * @author Joyce
 */
public class TarjetaCredito {
    //Atributos
   protected int numeroTarjeta;    
   protected String cuenta;
   protected String fechaCorte;
   protected double limite;
   protected double saldo;
   
   
   //Metodos
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(String fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    //Constructor

    public TarjetaCredito(int numeroTarjeta, String cuenta, String fechaCorte, Double limite, Double saldo) {
        this.numeroTarjeta = numeroTarjeta;
        this.cuenta = cuenta;
        this.fechaCorte = fechaCorte;
        this.limite = limite;
        this.saldo = saldo;
    }
     
}
