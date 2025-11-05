class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }

    public static <T> boolean compareBoxes(Box<T> b1, Box<T> b2) {
        return b1.get().equals(b2.get());
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        box1.set(10);
        box2.set(10);
        System.out.println(compareBoxes(box1, box2));
    }
}
