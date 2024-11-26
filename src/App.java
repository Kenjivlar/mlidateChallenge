import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Date Challenge");

        // Very Important: Need to SET Locale.English if not will throw error because wont be parsed completely
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM, yyyy", Locale.ENGLISH);

        String[] fechas = {
            "28 October, 2018",
            "04 March, 2020",
            "17 May, 2016",
            "23 September, 2021",
            "14 February, 2014"
        };

        // Very Important: SET the length of the new array with the same length of the one that has data if not will throw error
        String[] fechasn = new String[fechas.length];

        for (int i = 0; i < fechas.length; i++) {
            System.out.println(fechas[i]);
           LocalDate date = LocalDate.parse(fechas[i], format);
   
        String formattedString = date.toString();
       
        fechasn[i] = formattedString;

        }

        for (int i = 0; i < fechasn.length; i++) {
            System.out.println(fechasn[i]);
        }
    }
}
