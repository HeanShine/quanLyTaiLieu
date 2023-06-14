package Manage;

import ImplementInterface.InterfaceDocument;
import model.Document;

import java.util.ArrayList;

public class ManagerDocument implements InterfaceDocument {
    private ArrayList <Document> listDocument = new ArrayList<>();
    @Override
    public boolean isDocument(Integer idCheck) {
        for (int i = 0; i < listDocument.size(); i++) {
            if (listDocument.get(i).getIdDocument() == idCheck) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addDocument(Document document) {
        if (isDocument(document.getIdDocument())) {
            System.out.println("Document is exist");
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
            System.out.println("Document is not exist");
        }
    }

    @Override
    public Document searchDocumentByType() {
        //dung instance of de loc theo loai document (book, newspaper, journal)
        
        return null;
    }

    @Override
    public void showDocument() {

    }
}
