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

        System.out.println("Nhập tên tài liệu : ");
        this.nameDocument = scanner.nextLine();

        do {
           try {
                System.out.println("Số bản phát hành : ");
                this.numberRelease = Integer.parseInt(scanner.nextLine());
                if (this.numberRelease <= 0) {
                     System.out.println("\n" + "Số phát hành phải lớn hơn 0 !");
                }
              } catch (NumberFormatException e) {
                System.out.println("Phát hành số phải là một số !");
           }
        } while (this.numberRelease <= 0);
        }


    @Override
    public String toString() {
        return "Tài liệu : {" +  '\'' +
                " Mã Tài liệu = " + idDocument + '\'' +
                ", Tên tài liệu = " + nameDocument + '\'' +
                ", Số lượng phát hành = " + numberRelease + '\'' +
                '}';
    }
}
