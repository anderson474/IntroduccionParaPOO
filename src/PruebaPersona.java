/**
 * En esta clase se hacen todas las instancias de las démas clases
 * @author Jhon Anderson Galeano Santillana.
 */
public class PruebaPersona {
    public static void main(String[] args) {

        Persona p1 = new Persona("Jhon Anderson","Galeano ","Santillana ",1.70);//instanciando un objeto de la calse persona
        var nameComplete = p1.getName();
        p1.setBirthday(1999, 10, 10);
        p1.getBirthday();
        System.out.println("Su nombre completo es: "+nameComplete);

        Fruta fruta1 = new Fruta();//instanciando un objeto de la calse persona
        fruta1.setColors("amarillo");
        fruta1.setColors("verde");
        fruta1.setColors("azul");
        fruta1.getColors();

        CuentaBancaria cuenta1 = new CuentaBancaria( 123456);
        cuenta1.setActived();
        String cuenta = cuenta1.getCuenta();
        System.out.println(cuenta);

        Calculadora op = new Calculadora(5,5);
        int respuestaSuma = op.sumar();
        int respuestaResta = op.restar();
        int respuestaDividir = op.division();
        System.out.println("la suma es: "+ respuestaSuma + "\n"
                            + "la resta da: "+ respuestaResta + "\n"
                            + "la division da: " + respuestaDividir);


        Carro usuario1= new Carro("chevroletSpark",12345,2,3,"Alberto");
        System.out.println(usuario1.toString());




        System.out.println("No. de personas: "+Registradora.getContadorPersonas());
        Registradora persona1 = new Registradora("Juanes");
        System.out.println("Persona 1: "+persona1.getNombre());
        System.out.println("No. de personas: "+Registradora.getContadorPersonas());
        Registradora persona2 = new Registradora("Juanes");
        System.out.println("Persona 1: "+persona2.getNombre());
        System.out.println("No. de personas: "+Registradora.getContadorPersonas());


    }
}
