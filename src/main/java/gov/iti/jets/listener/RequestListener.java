package gov.iti.jets.listener;

import gov.iti.jets.persistence.DBFactory;
import gov.iti.jets.util.MyLocal;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener {
    public static int counter = 0;

    @Override
    public void requestInitialized(ServletRequestEvent sre){
        System.out.println("start = "+  ++counter);
        MyLocal.getInstance().set(DBFactory.getInstance().createEntityManager());
    }
    @Override
    public void requestDestroyed(ServletRequestEvent sre){
        System.out.println("end = "+  ++counter);
        MyLocal.getInstance().get().close();
        MyLocal.getInstance().remove();
    }
}
