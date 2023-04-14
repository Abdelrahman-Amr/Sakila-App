package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Country;
import gov.iti.jets.persistence.repository.CountryRepository;
import gov.iti.jets.util.MyLocal;

public class CountryRepositoryImpl extends BaseRepositoryImpl<Country, Short> implements CountryRepository {

    public CountryRepositoryImpl()
    {
        super(Country.class, MyLocal.getInstance().get());
    }

}
