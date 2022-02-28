import java.math.BigDecimal;
import java.util.Locale;

public interface Ticket {

      BigDecimal total = Pizza.getPrice().add(Extras.getPrice());


         public static String getTicket() {
            return String.format("%s   %.2f€\n" +
                            "%s   %.2f€\n   _____________________________\n " +
                    "  TOTAL                 %.2f€", Pizza.getName().toUpperCase(Locale.ROOT), Pizza.getPrice(), Extras.getName(), Extras.getPrice(),  total);
        }
}
