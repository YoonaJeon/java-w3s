import java.io.*;

public class Main {
    public static void main (String[] args) {
        enum Days {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }
        ;

        for (Days day : Days.values()) {
            System.out.println(day);
        }

        enum Cars {
            TOYOTA_CAMRY,
            HONDA_CIVIC,
            FORD_MUSTANG,
            TESLA_MODEL_S,
            BMW_X5,
            AUDI_A4,
            MERCEDES_BENZ_C_CLASS,
            NISSAN_ALTIMA,
            CHEVROLET_CORVETTE,
            VOLKSWAGEN_GOLF;
        }

        int car = 0;
        Cars[] cars = Cars.values();
        while (car < cars.length) {
            System.out.println(cars[car]);
            car++;
        }
    }
}