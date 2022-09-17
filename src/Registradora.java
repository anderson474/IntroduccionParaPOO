public class Registradora {
    private String nombre;
    protected int idPersona;
    private static int contadorPersonas;


    public Registradora(String nombre){
        contadorPersonas++;
        idPersona=contadorPersonas;
        this.nombre = nombre;
    }
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
}
