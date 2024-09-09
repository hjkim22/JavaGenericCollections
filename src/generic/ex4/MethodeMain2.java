package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodeMain2 {

    public static void main(String[] args) {

        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("cat", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("big dog", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
