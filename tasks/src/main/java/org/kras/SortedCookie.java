package org.kras;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/*
• Cookie=1.99 Cake=3.99 Candy=2.99
• Cake=3.99 Cookie=1.99 Candy=2.99
• Candy=2.99 Cake=3.99 Cookie=1.99
- Candy=2.99 Cake=3.99 Cookie=4.99
- Cookie=4.99 Cake=3.99 Candy=2.99
- Exception is thrown at run time.
- Cake=3.99 Cookie=4.99 Candy=2.99
 */

public class SortedCookie {

    public static void main(String[] args) {
    Map<String, BigDecimal> priceList = new HashMap<>();
    priceList.put("Cake", BigDecimal.valueOf(3.99));
    priceList.put("Cookie", BigDecimal.valueOf(1.99));
    priceList.put("Candy", BigDecimal.valueOf(2.99));
    priceList.put("Cookie", BigDecimal.valueOf(4.99));
    priceList.entrySet().stream()
            .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
            .forEach(entry -> System.out.print(entry + " "));
    }
}
