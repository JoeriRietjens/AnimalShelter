package Animals;

import java.time.LocalDateTime;
import Interfaces.ISellable;

public abstract class Animal implements ISellable {
    public String name;
    public Gender gender;
    public Reservor reservedBy;

    public Reservor getReservedBy() {
        return reservedBy;
    }

    private void setReservedBy(Reservor reservedBy) {
        this.reservedBy = reservedBy;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Animal(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public boolean Reserve(String reservedBy) {
        if (this.reservedBy == null) {
            this.reservedBy = new Reservor(reservedBy, LocalDateTime.now());
            return true;
        }
        return false;
    }

}