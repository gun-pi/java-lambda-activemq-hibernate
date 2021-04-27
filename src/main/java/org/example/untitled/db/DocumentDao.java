package org.example.untitled.db;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DocumentDao {

    public static Long save(DocumentEntity documentEntity) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            final Long id = (Long) session.save(documentEntity);
            transaction.commit();
            return id;
        }
    }
}
