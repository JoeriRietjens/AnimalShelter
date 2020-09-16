import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Gender;

import java.util.ArrayList;

    public class Reservation {
        public ArrayList<Animal> animalList = new ArrayList<Animal>();

        public void newCat(String name, Gender gender, String badHabits){
            this.animalList.add(new Cat(name, gender, badHabits));
        }

        public void newDog(String name, Gender gender, String badHabits){
            this.animalList.add(new Dog(name, gender));
        }

    }

