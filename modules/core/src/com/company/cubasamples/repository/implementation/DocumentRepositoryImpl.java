package com.company.cubasamples.repository.implementation;

import com.company.cubasamples.repository.DocumentRepository;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.haulmont.cuba.core.Transaction;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class DocumentRepositoryImpl implements DocumentRepository {

    @Inject
    private Persistence persistence;

    @Override
    public Long grtDocumentsCount() {
        try (Transaction transaction = persistence.createTransaction()) {
            EntityManager entityManager = persistence.getEntityManager();

            Query query = entityManager.createQuery("SELECT count(e) FROM cubasamples_Document e");
            Long documentsCount = (Long) query.getFirstResult();

            transaction.commit();
            return documentsCount;
        }
    }
}
