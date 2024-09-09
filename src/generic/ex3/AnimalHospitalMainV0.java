package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("cat", 50);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 개 병원에 고양이 전달
        // dogHospital.set(cat); // 컴파일 오류

        // 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("dog2", 220));
        System.out.println("biggerDog = " + biggerDog);
    }
}
