package model;

import java.util.Scanner;

public class Magazine extends Document {
    private int monthRelease;

    public Magazine() {
        super();
    }

    public Magazine(String nameDocument, int numberRelease, int monthRelease) {
        super(nameDocument, numberRelease);
        this.monthRelease = monthRelease;
    }

    public int getMonthRelease() {
        return monthRelease;
    }

    public void setMonthRelease(int monthRelease) {
        this.monthRelease = monthRelease;
    }

    public void InputMagazine() {
        Scanner scanner = new Scanner(System.in);
        super.InputDocument();

        do {
            try {
                System.out.println("Nhập tháng phát hành : ");
                this.monthRelease = Integer.parseInt(scanner.nextLine());
                if (this.monthRelease <= 0 || this.monthRelease > 12) {
                    System.out.println("\n" + "Tháng phát hành phải lớn hơn 0 và nhỏ hơn 12 !");
                }
            } catch (NumberFormatException e) {
                System.out.println("Tháng phát hành phải là một số !");
            }
        } while (this.monthRelease <= 0 || this.monthRelease > 12);

    }

    @Override
    public String toString() {
        return "Tạp chí {" +
                "Mã tạp chí  =" + getIdDocument() + '\'' +
                ", tên tạp chí ='" + getNameDocument() + '\'' +
                ", số lượng tạp chí =" + getNumberRelease() + '\'' +
                " tháng phát hành =" + monthRelease + '\'' +
                '}';
    }
}
