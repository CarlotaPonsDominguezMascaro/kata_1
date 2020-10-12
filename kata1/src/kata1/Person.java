package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthday;
    private final long MiliSeconsPerYear = (long) (1000*60*60*24*365.25);
    

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milisecostoYear(today.getTimeInMillis()-this.birthday.getTimeInMillis()));
    }
    private long milisecostoYear(long miles){
        return miles/this.MiliSeconsPerYear;
    }
}
