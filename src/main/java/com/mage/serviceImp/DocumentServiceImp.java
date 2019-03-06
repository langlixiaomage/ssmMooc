package com.mage.serviceImp;

import com.mage.dao.DocumentDao;
import com.mage.domain.Document;
import com.mage.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class DocumentServiceImp implements DocumentService {

    @Autowired
    private DocumentDao dd;

    @Override
    public List<Document> getAllDocuments() {
        List<Document> documents = null;
        try {
            documents = dd.selectAllDocument();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return documents;
    }

    @Override
    public void removeDocumentById(Integer id) {
        try {
            dd.deleteDocumentById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Document> getDocumentsByName(String name) {
        List<Document> allDocuments = getAllDocuments();
        List<Document> documents = new LinkedList<Document>();
        Iterator<Document> iterator = allDocuments.iterator();
        while (iterator.hasNext()){
            Document d = iterator.next();
            if (d.getName().equals(name)){
                documents.add(d);
            }
        }
        return documents;
    }
}
