package gov.iti.jets.service;

import gov.iti.jets.dto.CountryDto;
import gov.iti.jets.entity.Country;
import gov.iti.jets.mapper.CountryMapper;

public class CountryService extends BaseServiceImpl<Country, CountryDto, Short>{
    private static  volatile CountryService countryService;

    private CountryService()
    {
        super(Country.class, CountryMapper.class);
    }
    public static CountryService getInstance()
    {
        if(countryService == null)
        {
            synchronized (CountryService.class)
            {
                if(countryService == null)
                {
                    countryService = new CountryService();
                }
            }
        }
        return countryService;
    }
    
}
