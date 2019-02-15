package supplements;

import interfaces.Supplements;

import java.math.BigDecimal;

public class Cheese implements Supplements {

    private double price;

    public Cheese() {
        this.price = 2.3;
    }

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(price);
    }
}
