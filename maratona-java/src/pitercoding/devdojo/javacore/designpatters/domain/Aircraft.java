package pitercoding.devdojo.javacore.designpatters.domain;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();
    private final String model;

    public Aircraft(String model) {
        this.model = model;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seatNumber) {
        return availableSeats.remove(seatNumber);
    }
}
