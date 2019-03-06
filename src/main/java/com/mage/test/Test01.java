package com.mage.test;

import com.mage.domain.Document;
import com.mage.serviceImp.DocumentServiceImp;
import org.junit.Test;

import java.util.List;

public class Test01 {
    @Test
    public void fun01() throws Exception{
        DocumentServiceImp documentServiceImp = new DocumentServiceImp();
        List<Document> documents = documentServiceImp.getAllDocuments();
        System.out.println(documents);
    }
}
