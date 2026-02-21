package pitercoding.devdojo.javacore.designpatters.main;

import pitercoding.devdojo.javacore.designpatters.domain.Aircraft;
import pitercoding.devdojo.javacore.designpatters.domain.AircraftSingletonEager;

public class AircraftMain01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seatNumber) {
        System.out.println(AircraftSingletonEager.getInstance());
        // Aircraft aircraft = new Aircraft("Boeing 737");
        // System.out.println(aircraft.bookSeat(seatNumber));

    }
}
