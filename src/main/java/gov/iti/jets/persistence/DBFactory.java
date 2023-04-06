package gov.iti.jets.persistence;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBFactory {
    private final static EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("sakila");

    private DBFactory() {

    }

    public static EntityManagerFactory getInstance() {
        return entityManagerFactory;
    }
}
