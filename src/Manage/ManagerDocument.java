package Manage;

import ImplementInterface.InterfaceDocument;
import model.Book;
import model.Document;
import model.Magazine;
import model.News;

import java.util.ArrayList;
import java.util.List;

public class ManagerDocument implements InterfaceDocument {
    private ArrayList<Document> listDocument = new ArrayList<>();

    @Override
    public boolean isDocument(Integer idDocument) {
        for (int i = 0; i < listDocument.size(); i++) {
            if (listDocument.get(i).getIdDocument() == idDocument) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addDocument(Document document) {
        if (isDocument(document.getIdDocument())) {
            System.out.println("Tài liệu đã tồn tại !");
        } else {
            listDocument.add(document);
        }
    }

    @Override
    public void removeDocument(Integer idRemove) {
        if (isDocument(idRemove)) {
            for (int i = 0; i < listDocument.size(); i++) {
                if (listDocument.get(i).getIdDocument() == idRemove) {
                    listDocument.remove(i);
                }
            }
        } else {
            System.out.println("Tài liệu không tồn tại !");
        }
    }

    @Override
    public List<Magazine> filterMagazines() {
        List<Magazine> magazines = new ArrayList<>();
        for (Document document : listDocument) {
            if (document instanceof Magazine) {
                magazines.add((Magazine) document);
            }
        }
        for (Magazine magazine1 : magazines) {
            System.out.println(magazine1.toString());
        }
        return magazines;
    }

    @Override
    public List<Book> filterBook() {
        List<Book> books = new ArrayList<>();
        for (Document document : listDocument) {
            if (document instanceof Book) {
                books.add((Book) document);
            }
        }
        for (Book book : books) {
            System.out.println(book.toString());
        }
        return books;
    }

    @Override
    public List<News> filterNews() {
        List<News> news = new ArrayList<>();
        for (Document document : listDocument) {
            if (document instanceof News) {
                news.add((News) document);
            }
        }
        for (News news1 : news) {
            System.out.println(news1.toString());
        }
        return news;
    }

    @Override
    public void showDocument() {
        for (Document document : listDocument) {
            System.out.println(document.toString());
        }
    }
}
