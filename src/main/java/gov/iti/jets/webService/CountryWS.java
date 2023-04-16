package gov.iti.jets.webService;

import gov.iti.jets.dto.ActorDto;
import gov.iti.jets.dto.CountryDto;
import gov.iti.jets.service.ActorService;
import gov.iti.jets.service.CountryService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class CountryWS {

    private CountryService countryService;
    public CountryWS()
    {
        countryService = CountryService.getInstance();
    }
    @WebResult(name="Country")
    public List<CountryDto> findAllCountries()
    {
        List<CountryDto> countryDtos = countryService.findAll();
        return  countryDtos;
    }

    @WebResult(name="Country")
    public CountryDto findCountryById(@WebParam(name="id") short id)
    {
        return countryService.findById(id);
    }

    @WebResult(name="Country")
    public CountryDto addCountry(@WebParam(name = "Country") CountryDto dto) {
        CountryDto savedDto = countryService.add(dto);
        return savedDto;
    }

    @WebResult(name="Country")
    public CountryDto updateCountry(@WebParam(name = "id")short id,@WebParam(name = "Country") CountryDto dto) {
        CountryDto updatedDto = countryService.update(id, dto);
        return updatedDto;
    }

    @WebResult(name="Country")
    public CountryDto deleteCountryById(@WebParam(name = "id")short id) {
        CountryDto dto = countryService.deleteById(id);
        return dto;
    }
}
