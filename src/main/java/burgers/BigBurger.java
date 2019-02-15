package burgers;

import interfaces.Burger;
import interfaces.Supplements;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigBurger implements Burger {

    private List<Supplements> supplements;

    public BigBurger(Supplements... s) {
        this.supplements = new ArrayList<Supplements>(Arrays.asList(s));
    }

    public BigBurger() {
    }

    public List<Supplements> getSupplements() {
        return supplements;
    }

    public BigDecimal totalPrice() {
        BigDecimal result = new BigDecimal(0);
        for (Supplements s : supplements) {
            result = result.add( s.getPrice());
        }
        return result;
    }
}
