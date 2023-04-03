package gov.iti.jets.web;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBFactory {
    private final static EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("bank");

    private DBFactory() {

    }

    public static EntityManagerFactory getInstance() {
        return entityManagerFactory;
    }
}
