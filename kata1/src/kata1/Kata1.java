package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1999, 8, 24);
        Person person = new Person("Lotta", date);
        System.out.println("nombre: "+ person.getName()+ " Edad: "+person.getAge());
    }

    
}