package Animals;

public class Cat extends Animal {
    public String badHabits;

    public String getBadHabits() {
        return badHabits;
    }

    private void setBadHabits(String badHabits) {
        badHabits = badHabits;
    }

    public Cat(String name, Animals.Gender gender, String badHabits) {
        super(name, gender);
        this.badHabits = badHabits;
    }

    @Override
    public String toString() {
        return String.format(super.toString() +
                        ", bad habits: %s",
                this.badHabits.toLowerCase());
    }

    @Override
    public double getPrice() {
        int count = this.badHabits.length();
        int price = 350 - (20*count);
        return Math.max(price, 35);
    }
}