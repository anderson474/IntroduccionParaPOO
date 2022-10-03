/**
 * En esta clase se hacen todas las instancias de las démas clases
 * @author Jhon Anderson Galeano Santillana.
 */
public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person("Jhon Anderson","Galeano ","Santillana ",1.70);//instanciando un objeto de la calse persona
        var nameComplete = p1.getName();
        p1.setBirthday(1999, 10, 10);
        p1.getBirthday();
        System.out.println("Su nombre completo es: "+nameComplete);

        Fruit fruit1 = new Fruit();//instanciando un objeto de la calse persona
        fruit1.setColors("amarillo");
        fruit1.setColors("verde");
        fruit1.setColors("azul");
        fruit1.getColors();

        BankAccount Account1 = new BankAccount( 123456);
        Account1.setActived();
        String cuenta = Account1.getAccount();
        System.out.println(cuenta);

        Calculator op = new Calculator(5,5);
        int answerAdd = op.add();
        int answerSub = op.subtract();
        int AnswerDivision = op.division();
        System.out.println("la suma es: "+ answerAdd + "\n"
                            + "la resta da: "+ answerSub + "\n"
                            + "la division da: " + AnswerDivision);


        Car user1= new Car("chevroletSpark",12345,2,3,"Alberto");
        System.out.println(user1.toString());




        System.out.println("No. de personas: "+ Recorder.getCounterPeople());
        Recorder persona1 = new Recorder("Juanes");
        System.out.println("Persona 1: "+persona1.getNombre());
        System.out.println("No. de personas: "+ Recorder.getCounterPeople());
        Recorder persona2 = new Recorder("Juanes");
        System.out.println("Persona 1: "+persona2.getNombre());
        System.out.println("No. de personas: "+ Recorder.getCounterPeople());


    }
}
