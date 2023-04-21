package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.City;
import gov.iti.jets.persistence.repository.CityRepository;
import gov.iti.jets.util.MyLocal;
import jakarta.persistence.Query;

import java.util.List;

public class CityRepositoryImpl extends BaseRepositoryImpl<City, Short> implements CityRepository {
    public CityRepositoryImpl()
    {
        super(City.class, MyLocal.getInstance().get());
    }

    @Override
    public List<City> findCitiesByCountryId(Short countryId){
        Query query = entityManager.createQuery("from City c where c.countryId.countryId =:countryId");
        query.setParameter("countryId", countryId);
        List<City> cities = query.getResultList();
        return  cities;
    }

}
