package supplements;

import interfaces.Supplements;

import java.math.BigDecimal;

public class Meat implements Supplements {

    private double price;

    public Meat() {
        this.price = 4.5;
    }

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(price);
    }
}
