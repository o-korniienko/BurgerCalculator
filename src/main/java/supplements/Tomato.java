package supplements;

import interfaces.Supplements;

import java.math.BigDecimal;

public class Tomato implements Supplements {

    private double price;

    public Tomato() {
        this.price = 0.7;
    }

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(price);
    }
}
