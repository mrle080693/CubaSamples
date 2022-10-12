package com.company.cubasamples.core.integration;

import com.company.cubasamples.CubasamplesTestContainer;
import com.company.cubasamples.service.DocumentService;
import com.haulmont.cuba.testsupport.TestContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
// See https://doc.cuba-platform.com/manual-7.2/integration_tests_mw.html

class DocumentServiceIntegrationTest {

    @RegisterExtension
    static TestContainer container = CubasamplesTestContainer.Common.INSTANCE;
    static DocumentService documentServiceBean;

    @BeforeAll
    static void beforeAll() {
        documentServiceBean = container.getSpringAppContext().getBean(DocumentService.class);
    }

    @Test
    void getDocumentsCount_ShouldReturnCorrectCount() {
        long expected = 0;
        long actual = documentServiceBean.getDocumentsCount();

        Assertions.assertEquals(expected, actual);
    }
}