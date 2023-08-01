public class Animal {
    public String makeAnimalSound() {
        return "Some generic animal sound";
    }
}

class Dog extends Animal {
    public String makeDogSound() {
        return "Bark";
    }
}

class Cat extends Animal {
    public String makeCatSound() {
        return "Meow";
    }
}
