package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV1 {

    private Animal animal;

    public Animal get() {
        return animal;
    }

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("name: " + animal.getName());
        System.out.println("size: " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
