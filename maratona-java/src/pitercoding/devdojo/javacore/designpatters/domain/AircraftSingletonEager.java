package pitercoding.devdojo.javacore.designpatters.domain;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String model;

    private AircraftSingletonEager(String model) {
        this.model = model;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSingletonEager getInstance() {
        return INSTANCE;
    }

    public String getModel() {
        return model;
    }

    public boolean bookSeat(String seatNumber) {
        return availableSeats.remove(seatNumber);
    }
}
