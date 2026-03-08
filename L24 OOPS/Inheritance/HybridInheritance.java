// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Interface 1
interface Pet {
    void play();
}

// Interface 2
interface Wild {
    void hunt();
}

// Dog = Animal + Pet
class Dog extends Animal implements Pet {
    public void play() {
        System.out.println("Dog plays with ball");
    }
}

// Lion = Animal + Wild
class Lion extends Animal implements Wild {
    public void hunt() {
        System.out.println("Lion hunts in jungle");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();

        Lion l = new Lion();
        l.eat();
        l.hunt();
    }
}
