package pitercoding.devdojo.javacore.designpatters.domain;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String model;

    private AircraftSingletonLazy(String model) {
        this.model = model;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("Boeing 737");
                }
            }
        }
        return INSTANCE;
    }

    public String getModel() {
        return model;
    }

    public boolean bookSeat(String seatNumber) {
        return availableSeats.remove(seatNumber);
    }
}
