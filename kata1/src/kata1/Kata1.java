package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Lotta", new Date(99,8,24));
        System.out.println("nombre: "+ person.getName()+ " Edad: "+person.getAge());
    }

    
}
