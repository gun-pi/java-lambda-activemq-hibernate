package org.example.untitled.db;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DocumentDao {

    public Long save(DocumentEntity documentEntity) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        final Long id = (Long) session.save(documentEntity);
        tx.commit();
        session.close();
        return id;
    }
}
