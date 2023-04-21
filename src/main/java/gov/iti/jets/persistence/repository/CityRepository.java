package gov.iti.jets.persistence.repository;

import gov.iti.jets.entity.City;

import java.util.List;

public interface CityRepository extends BaseRepository<City, Short> {

    public List<City> findCitiesByCountryId(Short countryId);

    }
