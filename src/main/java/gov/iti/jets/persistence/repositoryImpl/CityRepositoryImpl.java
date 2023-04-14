package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.City;
import gov.iti.jets.persistence.repository.CityRepository;
import gov.iti.jets.util.MyLocal;

public class CityRepositoryImpl extends BaseRepositoryImpl<City, Short> implements CityRepository {
    public CityRepositoryImpl()
    {
        super(City.class, MyLocal.getInstance().get());
    }

}
