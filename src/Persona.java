/**
 * Esta clase émula las caracteristicas de una persona
 * @author Jhon Anderson Galeano Santillana.
 */
import java.util.Date;
public class Persona {
    /**
     * @param name representa el nombre de una persona
     * @param datebirth representa la fecha de nacimiento de una persona
     * @param lastname1 representa el primer apellido
     * @param lastname2 representa el segundo apellido
     * @param height representa la altura de una persona
     */
    String name;
    Date datebirth;
    private String lastname1;
    private String lastname2;
    private double height;

    // metodos
    // la usaran los objetos de esta clase

    public Persona(String name, String lastname1,String lastname2,  double height  ){
        /**
         * Se inicializa el constructor
         */
        this.name=name;
        this.lastname1=lastname1;
        this.lastname2 = lastname2;
        this.height = height;
    }
    private String setNameComplete() {
        /**
         *@return Se configura el nombre completo concatenandolo con sus apellidos
         */
        return this.name+this.lastname1+this.lastname2;
    }
    protected String getName(){
        /**
         * @return nos devuelve el nombre completo
         */
        return this.setNameComplete();
    }

    public void setBirthday(int year, int month, int day){
        /**
         * Este método nos configura los datos de enacimiento en una sola variable de tipo
         * date
         */
        this.datebirth = new Date((year-1900), month-1, day);
    }
    public void getBirthday(){
        /**
         * Este método devuelve la impresión de la fecha de nacimiento
         */
        System.out.println("la fecha de nacimiento es: "+this.datebirth);
    }



}
