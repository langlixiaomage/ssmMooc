package com.mage.service;

import com.mage.domain.Document;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocumentService {
    public List<Document> getAllDocuments();
    public void removeDocumentById(Integer id);

    public List<Document> getDocumentsByName(String name);
}
