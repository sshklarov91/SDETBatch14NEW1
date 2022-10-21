package Class23;

public abstract class Animal {
    abstract void eat();

    abstract void sleep();

    void walk() {
        System.out.println("Cat walk");
    }

    public static void main(String[] args) {

    }
}

class cat extends Animal {
    void eat() {
        System.out.println("Cats like fish");
    }

    void sleep() {
        System.out.println("Cats line to sleep for 12-16 hours");
    }

    void showAttitude() {
        System.out.println("hmm hmm hmm hmm");

    }
}

class dog extends Animal {
    void eat() {
        System.out.println("Dogs line watermelon");
    }

    void sleep() {
        System.out.println("Animals usually sleep for 8-12 hours");
    }
}