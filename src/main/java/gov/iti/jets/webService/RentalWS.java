package gov.iti.jets.webService;

import gov.iti.jets.dto.LanguageDto;
import gov.iti.jets.dto.RentalDto;
import gov.iti.jets.service.LanguageService;
import gov.iti.jets.service.RentalService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class RentalWS {

    private RentalService rentalService;
    public RentalWS()
    {
        rentalService = RentalService.getInstance();
    }
    @WebResult(name="rental")
    public List<RentalDto> findAllRentals()
    {
        List<RentalDto> languageDtos = rentalService.findAll();
        return  languageDtos;
    }
    @WebResult(name="rental")
    public List<RentalDto> getRentalsPage(@WebParam(name="page") int page, @WebParam(name="limit") int limit)
    {
        List<RentalDto> languageDtos = rentalService.getPage(page, limit);
        return  languageDtos;
    }

    @WebResult(name="rental")
    public RentalDto findRentalById(@WebParam(name="id") int id)
    {
        return rentalService.findById(id);
    }

    @WebResult(name="rental")
    public RentalDto addRental(@WebParam(name = "rental") RentalDto dto) {
        RentalDto languageDto = rentalService.add(dto);
        return languageDto;
    }

    @WebResult(name="rental")
    public RentalDto updateRental(@WebParam(name = "id")int id, @WebParam(name = "rental") RentalDto dto) {
        RentalDto updatedDto = rentalService.update(id, dto);
        return updatedDto;
    }

    @WebResult(name="rental")
    public RentalDto deleteRentalById(@WebParam(name = "id")int id) {
        RentalDto dto = rentalService.deleteById(id);
        return dto;
    }
}
