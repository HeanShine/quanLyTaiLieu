package model;

import java.util.Scanner;

public class Book extends Document {
    private String author;
    private int numberPage;

    public Book() {
        super();
    }

    public Book(String nameDocument, int numberRelease, String author, int numberPage) {
        super(nameDocument, numberRelease);
        this.author = author;
        this.numberPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }
    public int getNumberPage() {
        return numberPage;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }
    public void InputBook() {
        Scanner scanner = new Scanner(System.in);
        super.InputDocument();
        System.out.println("Enter author: ");
        this.author = scanner.nextLine();
        System.out.println("Enter number page: ");
        this.numberPage = scanner.nextInt();
    }
    @Override
    public String toString() {
        return "Book{" +
                "idDocument=" + getIdDocument() +
                ", nameDocument='" + getNameDocument() + '\'' +
                ", numberRelease=" + getNumberRelease() +
                "author='" + author + '\'' +
                ", numberPage=" + numberPage +
                '}';
    }
}
