package gov.iti.jets.util;

import jakarta.persistence.EntityManager;

public class MyLocal {
    private volatile static ThreadLocal<EntityManager> myLocal;

    private MyLocal() {

    }

    public static ThreadLocal<EntityManager> getInstance() {
        if (myLocal == null) {
            synchronized (MyLocal.class) {
                if (myLocal == null) {
                    myLocal = new ThreadLocal<EntityManager>();
                }
            }
        }
        return myLocal;
    }
}
