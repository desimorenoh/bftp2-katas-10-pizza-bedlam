import java.math.BigDecimal;
import java.util.Locale;

public class Pizza {
    private String name;
    private BigDecimal price;

    public Pizza(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTicket() {
        return String.format("%s   %.2f€\n   _____________________________\n   TOTAL                 %.2f€", name.toUpperCase(Locale.ROOT), price, price);
    }
}
