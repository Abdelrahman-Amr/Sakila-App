package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Address;
import gov.iti.jets.persistence.repository.AddressRepository;
import gov.iti.jets.util.MyLocal;

public class AddressRepositoryImpl extends BaseRepositoryImpl<Address, Short> implements AddressRepository {
    public AddressRepositoryImpl()
    {
        super(Address.class, MyLocal.getInstance().get());
    }

}
