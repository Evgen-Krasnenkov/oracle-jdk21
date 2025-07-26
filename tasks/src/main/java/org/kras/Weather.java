package org.kras;

public class Weather {
    public enum Forecast {
        SUNNY, CLOUDY, RAINY;
        public String toString() {
            return this.name().toLowerCase();
        }
        static String getForecast(String name) {
            try {
                Forecast f = Forecast.valueOf(name);
                return (f.ordinal() % 2 != 0)
                        ? f.name().toLowerCase() : f.name().toUpperCase();
            } catch (Exception e) {
                return "SNOWY";
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < Forecast.values().length; i++) {
            String name = Forecast.values()[i].toString();
            System.out.print(Forecast.getForecast(name));
        }
    }
}
