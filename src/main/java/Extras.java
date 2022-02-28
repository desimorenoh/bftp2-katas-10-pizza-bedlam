import java.math.BigDecimal;

public class Extras {

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Extras.name = name;
    }

    public static BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        Extras.price = price;
    }

    private static String name;
    private static BigDecimal price;

    public Extras(String name, BigDecimal price) {
        Extras.name = name;
        Extras.price = price;
    }

}
