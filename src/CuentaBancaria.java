/**
 * Esta clase émula las caracteristicas de una cuenta bancaria
 * y de su activación y desactivación
 * @author Jhon Anderson Galeano Santillana.
 */
public class CuentaBancaria {
    /**
     * @param accountNumber contiene le número de la cuenta
     * @param activated contiene el estado de activo o inactivo de la cuenta siendo True y False respectivamente
     * @param count Contiene el indicador de si entraron a activar la cuenta o no
     */
    protected int accountNumber;
    protected boolean activated;
    static private int count;

    public CuentaBancaria( int account){
        /**
         * El constructor inicializa el número de la cuenta
         */
        this.accountNumber = account;

    }
    public void setActived() {
        /**
         * en este método se utiliza para que se tenga que pasar por él,
         * si no no se activa la cuenta
         */
        count++;
        if(count==1){
            this.activated = true;
        }
        else{
            this.activated = false;
        }
    }

    protected String getCuenta() {
        /**
         * en este método se devulve la impresión de su cuenta y su estado
         */
        return "la cuenta No. "+this.accountNumber + " es: "+ this.activated;

    }
}
