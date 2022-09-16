/**
 * En esta clase se hacen todas las instancias de las démas clases
 * @author Jhon Anderson Galeano Santillana.
 */
public class PruebaPersona {
    public static void main(String[] args) {
        // creacion de un objeto de tipo persona
        Persona p1 = new Persona("JHON ANDERSON","Galeano ","SAntillana ",1.70);//instanciando un objeto de la calse persona
        var nameComplete = p1.getName();
        p1.setBirthday(1999, 10, 10);
        p1.getBirthday();
        System.out.println(nameComplete);

        Fruta fruta1 = new Fruta();//instanciando un objeto de la calse persona
        fruta1.setColors("amarillo");
        fruta1.setColors("verde");
        fruta1.setColors("azul");
        fruta1.getColors();

        CuentaBancaria cuenta1 = new CuentaBancaria(true, 123456);
        String cuenta = cuenta1.getActivated();
        System.out.println(cuenta);

        Calculadora op = new Calculadora(5,5);
        int respuestaSuma = op.sumar();
        int respuestaResta = op.restar();
        int respuestaDividir = op.division();
        System.out.println("la suma es: "+ respuestaSuma + "\n"
                            + "la resta da: "+ respuestaResta + "\n"
                            + "la division da: " + respuestaDividir);


        Carro usuario1= new Carro("chevroletSpark",12345,2,3,"Alberto");
        System.out.println(usuario1.getDimensions());

    }
}
