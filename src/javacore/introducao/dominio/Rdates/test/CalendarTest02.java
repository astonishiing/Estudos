package javacore.introducao.dominio.Rdates.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest02 {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss Z");
        Calendar newCalendar = Calendar.getInstance();

        String stringDate = dateFormat.format(calendar.getTime());
        Date newDate = dateFormat.parse(stringDate);

//        Esse Dois logo abaixo possuem compatibilidade:
//        Date date = calendar.getTime();
//        calendar.setTime(date);

        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println("==========");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.HOUR));

        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 5);
        System.out.println(calendar.getTime());

        System.out.println("========");
        newCalendar.set(Calendar.HOUR, calendar.get(Calendar.HOUR) + 1);
        System.out.println(calendar.before(newCalendar));

        System.out.println("=================");
        stringDate.replace("10:", "12:");
        newCalendar.setTime(newDate);
        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(dateFormat.format(newCalendar.getTime()));
    }
}
