package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Store;
import gov.iti.jets.persistence.repository.StoreRepository;
import gov.iti.jets.util.MyLocal;

public class StoreRepositoryImpl extends BaseRepositoryImpl<Store, Short> implements StoreRepository {

    public StoreRepositoryImpl()
    {
        super(Store.class, MyLocal.getInstance().get());
    }
}
