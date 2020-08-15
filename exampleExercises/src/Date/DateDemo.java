package Date;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2001,05,01);
        Date birthday = calendar.getTime();
        PersonImmutableDate person = new PersonImmutableDate(birthday, "Maria" );
        birthday = person.getBirthday();
        System.out.println(birthday);
        birthday.setTime(System.currentTimeMillis());
        System.out.println(birthday);
        System.out.println(person.getBirthday());
        System.out.println();

        PersonMutableDate personDateMutable = new PersonMutableDate(birthday, "Nare");
        Date date = person.getBirthday();
        System.out.println(date);
        date.setTime(System.currentTimeMillis());
        System.out.println(date);
        System.out.println(personDateMutable.getBirthday());

    }
}
