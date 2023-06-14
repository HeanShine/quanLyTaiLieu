package model;

import java.util.Scanner;

public class News extends Document {
    private int dayRelease;

    public News() {
        super();
    }

    public News(String nameDocument, int numberRelease, int dayRelease) {
        super(nameDocument, numberRelease);
        this.dayRelease = dayRelease;
    }

    public int getDayRelease() {
        return dayRelease;
    }

    public void setDayRelease(int dayRelease) {
        this.dayRelease = dayRelease;
    }

    public void InputNews() {
        Scanner scanner = new Scanner(System.in);
        super.InputDocument();
        do {
            try {
                System.out.println(" Nhập ngày phát hành : ");
                this.dayRelease = Integer.parseInt(scanner.nextLine());
                if (this.dayRelease <= 0 || this.dayRelease > 31) {
                    System.out.println("\n" + "Ngày phát hành phải lớn hơn 0 và nhỏ hơn 31 !");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ngày phát hành phải là một số !");
            }
        } while (this.dayRelease <= 0 || this.dayRelease > 31);

    }
    @Override
    public String toString() {
        return "Báo {" +
                "Mã báo =" + getIdDocument() + '\'' +
                ", tên báo ='" + getNameDocument() + '\'' +
                ", số lượng báo =" + getNumberRelease() + '\'' +
                "ngày phát hành báo =" + dayRelease + '\'' +
                '}';
    }
}
