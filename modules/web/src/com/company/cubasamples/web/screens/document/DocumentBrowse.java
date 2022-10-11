package com.company.cubasamples.web.screens.document;

import com.company.cubasamples.service.DocumentService;
import com.haulmont.cuba.gui.screen.*;
import com.company.cubasamples.entity.Document;

import javax.inject.Inject;

@UiController("cubasamples_Document.browse")
@UiDescriptor("document-browse.xml")
@LookupComponent("documentsTable")
@LoadDataBeforeShow
public class DocumentBrowse extends StandardLookup<Document> {

    @Inject
    private DocumentService documentService;

    public void getDocumentsCount() {
        System.out.println(documentService.getDocumentsCount());
    }
}