package supplements;

import interfaces.Supplements;

import java.math.BigDecimal;

public class Peppers implements Supplements {

    private double price;

    public Peppers() {
        this.price = 1.5;
    }

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(price);
    }
}
