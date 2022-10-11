package com.company.cubasamples.web.screens.document;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubasamples.entity.Document;

@UiController("cubasamples_Document.edit")
@UiDescriptor("document-edit.xml")
@EditedEntityContainer("documentDc")
@LoadDataBeforeShow
public class DocumentEdit extends StandardEditor<Document> {
}