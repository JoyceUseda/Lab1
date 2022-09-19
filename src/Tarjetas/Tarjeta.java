
package Tarjetas;

/**
 *
 * @author Joyce
 */
public abstract class Tarjeta {
    //Atributos
    private String numeroTarjeta;
    private String cuenta;

    
    //Metodos
    

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getCuenta() {
        return cuenta;
    }

    //Constructor

    public Tarjeta(String numeroTarjeta, String cuenta) {
        this.numeroTarjeta = numeroTarjeta;
        this.cuenta = cuenta;
    }
}
