package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Rental;
import gov.iti.jets.persistence.repository.RentalRepository;
import gov.iti.jets.util.MyLocal;

public class RentalRepositoryImpl extends BaseRepositoryImpl<Rental , Integer> implements RentalRepository {

    public RentalRepositoryImpl()
    {
        super(Rental.class, MyLocal.getInstance().get());
    }

}
