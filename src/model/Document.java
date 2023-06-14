package model;

import java.util.Scanner;

public class Document {
    private static int nextId = 1;
    private int idDocument;
    private String nameDocument;
    private int numberRelease;

    public Document() {
        this.idDocument = nextId++;
    }
    public Document(String nameDocument, int numberRelease) {
        this.nameDocument = nameDocument;
        this.numberRelease = numberRelease;
    }

    public int getIdDocument() {
        return idDocument;
    }

    public String getNameDocument() {
        return nameDocument;
    }

    public int getNumberRelease() {
        return numberRelease;
    }



    public void setNameDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    public void setNumberRelease(int numberRelease) {
        this.numberRelease = numberRelease;
    }

    public void InputDocument() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name document: ");
        this.nameDocument = scanner.nextLine();
        System.out.println("Enter number release: ");
        this.numberRelease = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Document{" +
                "idDocument=" + idDocument +
                ", nameDocument='" + nameDocument + '\'' +
                ", numberRelease=" + numberRelease +
                '}';
    }
}
