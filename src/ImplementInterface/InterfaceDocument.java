package ImplementInterface;

import model.Document;

public interface InterfaceDocument {
    public boolean isDocument(Integer idCheck);

    public void addDocument(Document document);

    public void removeDocument(Integer idRemove);

    public Document searchDocumentByType();

    void showDocument();
}
