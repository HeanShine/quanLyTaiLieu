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

        System.out.println("Nhập tên tác giả : ");
        this.author = scanner.nextLine();

        do {
            try {
                System.out.println("Nhập số trang : ");
                this.numberPage = Integer.parseInt(scanner.nextLine());
                if (this.numberPage <= 0) {
                    System.out.println("\n" + "Số trang phải lớn hơn 0 !");
                }
            } catch (NumberFormatException e) {
                System.out.println("Số trang phải là một số !");
            }
        } while (this.numberPage <= 0);

    }

    @Override
    public String toString() {
        return " Sách {" +
                "Mã sách = " + getIdDocument() + '\'' +
                ", Tên sách = '" + getNameDocument() + '\'' +
                ", Số lượng phát hành = " + getNumberRelease() + '\'' +
                "Tên tác giả ='" + author + '\'' +
                ", Số trang =" + numberPage + '\'' +
                '}';
    }
}
