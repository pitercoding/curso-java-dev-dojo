package pitercoding.devdojo.javacore.designpatters.main;

import pitercoding.devdojo.javacore.designpatters.domain.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyMain01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");

        System.out.println(AircraftSingletonLazy.getInstance());
        System.out.println(AircraftSingletonLazy.getInstance());
        Constructor<AircraftSingletonLazy> constructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = constructor.newInstance("Boeing 737");
        System.out.println(aircraftSingletonLazy);

    }

    private static void bookSeat(String seatNumber) {
        System.out.println(AircraftSingletonLazy.getInstance());
        AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getInstance();
        System.out.println(aircraftSingletonLazy.bookSeat(seatNumber));

    }
}
