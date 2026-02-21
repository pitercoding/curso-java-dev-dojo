package pitercoding.devdojo.javacore.designpatters.main;

import pitercoding.devdojo.javacore.designpatters.domain.Aircraft;
import pitercoding.devdojo.javacore.designpatters.domain.AircraftSingletonEager;

public class AircraftSingletonEagerMain01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftMain01.bookSeat("1A");
    }

    private static void bookSeat(String seatNumber) {
        System.out.println(AircraftSingletonEager.getInstance());
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getInstance();
        System.out.println(aircraftSingletonEager.bookSeat(seatNumber));

    }
}
