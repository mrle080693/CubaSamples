package com.company.cubasamples.core.unit;

import com.company.cubasamples.repository.DocumentRepository;
import com.company.cubasamples.service.DocumentServiceBean;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentServiceBeanTest {
    private final DocumentRepository mockedDocumentRepository = Mockito.mock(DocumentRepository.class);
    private final DocumentServiceBean documentServiceBean = new DocumentServiceBean(mockedDocumentRepository);

    @Test
    void getDocumentsCount_ShouldReturnTheSameAsMock_Always() {
        Long mockedRepoResult = 11L;
        Mockito.when(mockedDocumentRepository.grtDocumentsCount())
                .thenReturn(mockedRepoResult);

        Long serviceResult = documentServiceBean.getDocumentsCount();
        assertEquals(mockedRepoResult, serviceResult);
    }
}
