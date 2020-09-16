package Animals;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Dog extends Animal {

    public LocalDateTime lastWalk;
    public static int amountOfDogs = -1;

    public LocalDateTime getLastWalk() {
        return lastWalk;
    }

    private void setLastWalk(LocalDateTime lastWalk) {
        this.lastWalk = lastWalk;
    }

    public boolean needswalk;

    public boolean getNeedswalk() {
        return ChronoUnit.DAYS.between(this.lastWalk, LocalDateTime.now()) > 0;
    }

    public Dog(String name, Gender gender) {
        super(name, gender);
        this.lastWalk = LocalDateTime.now();
        amountOfDogs++;
    }

    @Override
    public String toString() {
        return String.format(super.toString() +
                        ", last walk: %s",
                this.lastWalk.toLocalTime());
    }

    @Override
    public double getPrice() {
        int discount = amountOfDogs * 50;
        int price = 500 - discount;
        return Math.max(price, 50);
    }
}