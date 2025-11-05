class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Lion roars loudly.");
    }

    public static void main(String[] args) {
        Lion l = new Lion();
        l.eat();  // inherited method
        l.roar(); // subclass-specific method
    }
}
