/**
 * Reperesenta las características que estan presentes en un carro.
 * @author Jhon Anderson Galeano Santillana.
 */
public class Car {
    /**
     * definicción de los atributos de la clase.
     * @param model representa el modelo del carro.
     * @param Serial representa el codigo serial del producto (en este caso el carro).
     * @param lenght representa el ancho del automóvil.
     * @param height representa el alto del automóvil.
     * @param owner representa el nombre del dueño.
     */
    protected String model;
    private int serial;
    private int lenght;
    private  int height;
    private  String owner;

    public Car(String model, int serial, int lenght, int height, String owner){
        /**
         * Constructor de la clase Carro
         * @param model se asigna el argumento del constructor al método,
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
         * @return devuelve la dimensión de un carro.
         */
        return this.lenght*this.height;
    }

    public String toString(){
        /**
         * @return devuelve una cadena con la respuesta deseada.
         */
        return "El automovil "+ this.model +
                "  su dimensione es "+ this.setDimensions();
    }
}
