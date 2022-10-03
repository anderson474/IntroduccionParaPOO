/**
 * Esta clase émula las caracteristicas de una fruta
 * @author Jhon Anderson Galeano Santillana.
 */
import java.util.ArrayList;
public class Fruit {
    /**
     * @param colors es una variable que instancia de una clase Array<String>
     * @param name atributo que guarda el nombre de la persona
     * @param
     */
    ArrayList<String> colors = new ArrayList<String>();
    private String name;
    private float averageWeight;

    protected void setColors(String color) {
        /**
         * Cada vez que se mande un atributo color
         * se agrega a un array
         */
        this.colors.add(color);
    }

    public void getColors() {
        /**
         * devuleve la impresión del string completo
         */
        System.out.println(this.colors);
    }
}
