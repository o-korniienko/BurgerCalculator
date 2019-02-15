package supplements;

import interfaces.Supplements;

import java.math.BigDecimal;

public class Salat implements Supplements {
    private double price;

    public Salat() {
        this.price = 1.2;
    }

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(price);
    }
}
