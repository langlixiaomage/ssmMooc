package com.mage.action;

import com.mage.domain.Document;
import com.mage.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DocumentAction {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "getAllDocuments",method = RequestMethod.POST)
    @ResponseBody
    public List<Document> getAllDocumentsAction() throws Exception{
        List<Document> documents = documentService.getAllDocuments();
        System.out.println(documents);
        return documents;
    }
    @RequestMapping("deleteDocumentAction")
    public void deleteDocumentAction(Integer id) throws Exception{
        documentService.removeDocumentById(id);
    }
}
