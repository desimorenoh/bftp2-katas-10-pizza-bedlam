import java.math.BigDecimal;
import java.util.Locale;

public class Pizza {
    private static String name;
    private static BigDecimal price;

    public Pizza(String name, BigDecimal price) {
        Pizza.name = name;
        Pizza.price = price;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Pizza.name = name;
    }

    public static BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        Pizza.price = price;
    }

    public String getTicket() {
        return String.format("%s   %.2f€\n   _____________________________\n   TOTAL                 %.2f€", name.toUpperCase(Locale.ROOT), price, price);
    }
}
