/**
 * Reperesenta las características que estan presentes en un carro.
 * @author Jhon Anderson Galeano Santillana.
 */
public class Carro {
    /**
     * definicción de los atributos de la clase.
     */
    private String model;
    private int serial;
    private int lenght;
    private  int height;
    private  String owner;

    public Carro(String model,int serial, int lenght, int height, String owner){
        /**
         * Constructor de la clase Carro
         * @param model se asigna el argumento del constructor al metodo
         * y es lo mismo para los demás
         */
        this.model = model;
        this.serial = serial;
        this.lenght = lenght;
        this.height = height;
        this.owner = owner;

    }
    private int setDimensions(){
        /**
         * @return devuelve la multiplicación entre variables locales
         */
        return this.lenght*this.height;
    }
    protected String getDimensions(){
        /**
         * @return devuelve una cadena con la respuesta deseada.
         */
        return "El automovil "+ this.model +
                "  su dimensione es "+ this.setDimensions();
    }
}
