package org.kras;
/*
What is the result?
• 1111
• 1101
• A runtime exception is thrown.
- 1212
- 1201
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataFormater {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2021, Month.JANUARY, 1);
        Period period = Period.ofDays(-10);
        LocalDate d2 = d1.plus(period);
        LocalDate d2a = d2.withMonth(1);
        LocalDateTime ldt = d2a.atTime(LocalTime.of(11, 11));
        boolean after = d1.isAfter(d2a);
        boolean equals = d1.getMonth().equals(ldt.getMonth());
        boolean isCondition = after ^ !equals;
        if (isCondition) {
            ldt = d2a.atTime(LocalTime.of(12,12));
        }
        System.out.println(ldt.format(DateTimeFormatter.ofPattern("HHMM")));
    }
}
