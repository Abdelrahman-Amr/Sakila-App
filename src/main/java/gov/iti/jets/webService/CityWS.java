package gov.iti.jets.webService;

import gov.iti.jets.dto.CityDto;
import gov.iti.jets.dto.CountryDto;
import gov.iti.jets.service.CityService;
import gov.iti.jets.service.CountryService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class CityWS {
    private CityService cityService;
    public CityWS()
    {
        cityService = CityService.getInstance();
    }
    @WebResult(name="City")
    public List<CityDto> findAllCities()
    {
        List<CityDto> cityDtos = cityService.findAll();
        return  cityDtos;
    }

    @WebResult(name="City")
    public CityDto findCityById(@WebParam(name="id") short id)
    {
        return cityService.findById(id);
    }

    @WebResult(name="City")
    public CityDto addCity(@WebParam(name = "City") CityDto dto) {
        CityDto savedDto = cityService.add(dto);
        return savedDto;
    }

    @WebResult(name="City")
    public CityDto updateCity(@WebParam(name = "id")short id,@WebParam(name = "City") CityDto dto) {
        CityDto updatedDto = cityService.update(id, dto);
        return updatedDto;
    }

    @WebResult(name="City")
    public CityDto deleteCityById(@WebParam(name = "id")short id) {
        CityDto dto = cityService.deleteById(id);
        return dto;
    }
}
