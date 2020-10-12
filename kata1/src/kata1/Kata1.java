package kata1;

import java.time.LocalDate;
import java.time.Month;


public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999, Month.MARCH, 24);
        Person person;
        person = new Person("Lotta", date);
        System.out.println("nombre: "+ person.getName()+ " Edad: "+person.getAge());
    }

    
}