
package Tarjetas;

/**
 *
 * @author Joyce
 */
public class TarjetaCredito extends Tarjeta {
    //Atributos
   
   protected String fechaCorte;
   protected double limite;
   protected float saldo;
   
   
   //Metodos

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite < 0) {
            this.limite = 0;
        } else {
            this.limite = limite;
        }
    }

    public float getSaldo() {
        return saldo;
    }
    
    //Constructor

    public TarjetaCredito(String fechaCorte, double limite, float saldo, String numeroTarjeta, String cuenta) {
        super(numeroTarjeta, cuenta);
        this.fechaCorte = fechaCorte;
        this.limite = limite;
        this.saldo = saldo;
    }

    

}
