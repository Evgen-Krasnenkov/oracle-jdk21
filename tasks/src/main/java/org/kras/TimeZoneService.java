package org.kras;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneService {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Chicago");
        ZonedDateTime zdt = ZonedDateTime.of(
                LocalDate.of(2011, 11, 7),
                LocalTime.of(1, 30),
                zoneId);
        ZonedDateTime hourLater = zdt.plusHours(1);
        boolean isRight = zdt.getHour() == hourLater.getHour();
        boolean isSameOffset = zdt.getOffset().equals(hourLater.getOffset());
    }
}
