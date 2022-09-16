/**
 * Esta clase émula las caracteristicas de una cuenta bancaria
 * @author Jhon Anderson Galeano Santillana.
 */
public class CuentaBancaria {
    int accountNumber;
    boolean activated;
    protected String toString;

    public CuentaBancaria(boolean estado, int account){
        this.accountNumber = account;
        this.activated = estado;
    }
    private void setActived() {
        /**
         * en este método se realiza la concatenación
         */
        this.toString = "número de cuenta: "+this.accountNumber+
                "su estado es: "+ this.activated;
    }

    protected String getActivated() {
        /**
         * en este método se devulve el atributo actualizado llamado toString
         */
        return this.toString;

    }
}
