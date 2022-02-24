import java.math.BigDecimal;

public class Extras {

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

    private String name;
    private BigDecimal price;

    public Extras(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
