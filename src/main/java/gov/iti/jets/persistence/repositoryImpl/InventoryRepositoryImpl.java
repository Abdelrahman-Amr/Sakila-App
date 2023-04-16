package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Inventory;
import gov.iti.jets.persistence.repository.InventoryRepository;
import gov.iti.jets.util.MyLocal;

public class InventoryRepositoryImpl extends BaseRepositoryImpl<Inventory, Integer> implements InventoryRepository {
    public InventoryRepositoryImpl()
    {
        super(Inventory.class, MyLocal.getInstance().get());
    }

}
