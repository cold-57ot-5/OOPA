// File: Q3_PrintableDemo.java
interface Printable {
    void printContent();
}

class PDFDocument implements Printable {
    public void printContent() {
        System.out.println("Printing PDF content...");
    }
}

class WordDocument implements Printable {
    public void printContent() {
        System.out.println("Printing Word content...");
    }
}

public class Q3_PrintableDemo {
    public static void main(String[] args) {
        Printable[] docs = { new PDFDocument(), new WordDocument() };
        for (Printable d : docs) {
            d.printContent();
        }
    }
}
