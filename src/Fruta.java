/**
 * Esta clase émula las caracteristicas de una fruta
 * @author Jhon Anderson Galeano Santillana.
 */
import java.util.ArrayList;
public class Fruta {
    ArrayList<String> colors = new ArrayList<String>();
    private String name;
    private float averageWeight;

    protected void setColors(String color) {this.colors.add(color);}

    public void getColors() {System.out.println(this.colors);}
}
