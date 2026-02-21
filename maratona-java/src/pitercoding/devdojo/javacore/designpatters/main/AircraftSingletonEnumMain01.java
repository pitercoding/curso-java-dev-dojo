package pitercoding.devdojo.javacore.designpatters.main;

import pitercoding.devdojo.javacore.designpatters.domain.AircraftSingletonEnum;
import pitercoding.devdojo.javacore.designpatters.domain.AircraftSingletonLazy;

public class AircraftSingletonEnumMain01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    public static void bookSeat(String seatNumber) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seatNumber));
    }
}
