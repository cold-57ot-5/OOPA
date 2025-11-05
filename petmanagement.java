class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps softly.");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();  // from Animal
        p.bark(); // from Dog
        p.weep(); // from Puppy
    }
}
