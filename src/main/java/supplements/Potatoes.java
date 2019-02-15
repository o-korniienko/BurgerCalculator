package supplements;

import interfaces.Supplements;

import java.math.BigDecimal;

public class Potatoes implements Supplements {
    private double price;

    public Potatoes() {
        this.price = 0.5;
    }

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(price);
    }
}
