package org.example.untitled.db;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {

    private static final SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(DocumentEntity.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
    }

    private HibernateSessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
