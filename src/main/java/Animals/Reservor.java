package Animals;

import java.time.LocalDateTime;

public class Reservor {
    public String Name;
    public LocalDateTime ReservedAt;

    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    public LocalDateTime getReservedAt() {
        return ReservedAt;
    }

    private void setReservedAt(LocalDateTime reservedAt) {
        ReservedAt = reservedAt;
    }

    public Reservor(String name, LocalDateTime reservedAt) {
        Name = name;
        ReservedAt = reservedAt;
    }
}