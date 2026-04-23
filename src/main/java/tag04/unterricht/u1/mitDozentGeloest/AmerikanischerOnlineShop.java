package tag04.unterricht.u1.mitDozentGeloest;

import java.math.BigDecimal;

public class AmerikanischerOnlineShop
{

    public Dollar shopping(Dollar d)
    {
        System.out.println("Thank you for shopping :) You spent 10 dollars.");
        d.betrag = d.betrag - 10;
        return d;
    }
}
