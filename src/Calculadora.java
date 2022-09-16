/**
 * Esta clase émula las caracteristicas de una calculadora
 * @author Jhon Anderson Galeano Santillana.
 */
public class Calculadora {
    private int a;
    private int b;
    protected Calculadora(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
    }
    public int sumar() {return this.a+this.b;}
    public int restar() {return this.a-this.b;}
    public int division(){
        if(this.a/this.b!=0){
            return this.a/this.b;
        }
        else{
            return 0;
        }
    }
}
