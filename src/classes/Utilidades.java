package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Erica
 */
public class Utilidades {

    public static boolean isNumeric(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static Date stringToDate(String data) {
        SimpleDateFormat formatotexto = new SimpleDateFormat("yyyy/MM/dd");
        Date x = null;
        try {
            x = formatotexto.parse(data);
        } catch (ParseException ex) {
        }
        return x;
    }
    
    public static String formatDate(Date data) {
        SimpleDateFormat formatotexto = new SimpleDateFormat("yyyy/MM/dd");
        return formatotexto.format(data);
    }
}
