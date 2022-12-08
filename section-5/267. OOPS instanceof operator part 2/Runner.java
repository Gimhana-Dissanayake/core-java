
abstract class Animal {

}

class Dog extends Animal {
    public void barking() {
        System.out.println("Bow Bow Bow...");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Mew Mew Mew...");
    }
}

class Lion extends Animal {
    public void raor() {
        System.out.println("Roar Roar Roar...");
    }
}

class Zoo {
    public void playAnimalSound(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.barking();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
        }
        if (animal instanceof Lion) {
            Lion lion = (Lion) animal;
            lion.raor();
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.playAnimalSound(new Dog());
        zoo.playAnimalSound(new Cat());
        zoo.playAnimalSound(new Lion());
    }
}
