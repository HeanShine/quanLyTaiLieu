package ImplementInterface;

import model.Book;
import model.Document;
import model.Magazine;
import model.News;

import java.util.List;

public interface InterfaceDocument {
    public boolean isDocument(Integer idCheck);

    public void addDocument(Document document);

    public void removeDocument(Integer idRemove);

    public List<Magazine> filterMagazines();

    public List<Book> filterBook();

    public List<News> filterNews();

    void showDocument();
}
