package com.company.cubasamples.service;

import com.company.cubasamples.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(DocumentService.NAME)
public class DocumentServiceBean implements DocumentService {

    @Inject
    private DocumentRepository documentRepository;

    @Override
    public Long getDocumentsCount() {
        return documentRepository.grtDocumentsCount();
    }
}