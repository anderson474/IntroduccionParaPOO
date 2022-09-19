/**
 * Esta clase representa la registradora de un Bus.
 * @author Jhon Anderson Galeano Santillana.
 */
public class Registradora {
    /**
     * @param nombre representa el nombre de la persona que ingresa.
     * @param idPersona representa la identificación de ese nombre con el número en que lo conto.
     * @param contador
     */
    private String name;
    protected int id;
    private static int counter;


    public Registradora(String name){
        /**
         * Se detecta cada que se instancia la clase o cada que ingrese una persona.
         */
        counter++;
        this.id=counter;
        this.name = name;
    }
    public static int getContadorPersonas(){return counter;}

    public String getNombre(){return this.name;}
}
