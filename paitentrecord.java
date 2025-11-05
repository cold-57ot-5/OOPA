class PatientRecord<T> {
    private T id;
    private String name;
    public PatientRecord(T id, String name) { this.id = id; this.name = name; }
    public static <T> void display(PatientRecord<T> p) {
        System.out.println("ID: " + p.id + ", Name: " + p.name);
    }

    public static void main(String[] args) {
        PatientRecord<String> p1 = new PatientRecord<>("CARD123", "Riya");
        display(p1);
    }
}
