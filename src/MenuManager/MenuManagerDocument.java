package MenuManager;

import Manage.ManagerDocument;
import model.Book;
import model.Magazine;
import model.News;

import java.util.Scanner;

public class MenuManagerDocument {
    public static void main(String[] args) {
        ManagerDocument managerDocument = new ManagerDocument();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int choice;
            System.out.println("-----Menu-----");
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Xóa tài liệu");
            System.out.println("3. Tìm kiếm tài liệu theo loại");
            System.out.println("4. Hiển thị thông tin về tài liệu");
            System.out.println("5. Thoát chương trình");
            System.out.println("--------------");

            System.out.println("Vui long chọn 1 lựa chọn : ");
            do {
                choice = scanner.nextInt();
                if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
                    System.out.println("Vui lòng nhập lại : ");
                }
            } while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);

            switch (choice) {
                case 1:
                    System.out.println("1. Thêm sách");
                    System.out.println("2. Thêm tạp chí");
                    System.out.println("3. Thêm báo");
                    System.out.println("Vui lòng chọn 1 lựa chọn để thêm : ");
                    int choiceAdd = 0;

                    do {
                        try {
                            choiceAdd = Integer.parseInt(scanner.nextLine());
                            if (choiceAdd < 0) {
                                System.out.println("vui lòng nhập số lớn hơn 0 ");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Đầu vào không hợp lệ. Vui lòng nhập lại");
                        }
                    } while (choiceAdd != 1 && choiceAdd != 2 && choiceAdd != 3);

                    switch (choiceAdd) {
                        case 1:
                            Book book = new Book();
                            book.InputBook();
                            managerDocument.addDocument(book);
                            break;
                        case 2:
                            Magazine magazine = new Magazine();
                            magazine.InputMagazine();
                            managerDocument.addDocument(magazine);
                            break;
                        case 3:
                            News news = new News();
                            news.InputDocument();
                            managerDocument.addDocument(news);
                            break;
                    }
                    break;

                case 2:
                    int idRemove;
                    do {
                        System.out.println("Chọn id để xóa : ");
                        idRemove = scanner.nextInt();
                        if (idRemove < 0) {
                            try {
                                idRemove = Integer.parseInt(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Đầu vào không hợp lệ. Vui lòng nhập lại");
                            }
                            if (idRemove < 0) {
                                System.out.println("Vui lòng nhập id > 0 ");
                            }
                        }
                    } while (idRemove < 0);

                    managerDocument.removeDocument(idRemove);
                    break;

                case 3:
                    System.out.println("1. Danh sách sách");
                    System.out.println("2. Danh sách tạp chí");
                    System.out.println("3. Danh sách báo");
                    System.out.println("Vui lòng nhập 1 lựa chọn : ");

                    choiceAdd = 0;

                    do {
                        try {
                            choiceAdd = Integer.parseInt(scanner.nextLine());
                            if (choiceAdd < 0) {
                                System.out.println("vui lòng nhập số lớn hơn 0 ");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Đầu vào không hợp lệ. Vui lòng nhập lại");
                        }
                    } while (choiceAdd != 1 && choiceAdd != 2 && choiceAdd != 3);


                    switch (choiceAdd) {
                        case 1:
                            managerDocument.filterBook();
                            break;
                        case 2:
                            managerDocument.filterMagazines();
                            break;
                        case 3:
                            managerDocument.filterNews();
                            break;
                    }
                    break;

                case 4:
                    managerDocument.showDocument();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}