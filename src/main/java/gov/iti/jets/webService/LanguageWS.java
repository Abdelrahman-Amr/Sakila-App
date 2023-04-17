package gov.iti.jets.webService;

import gov.iti.jets.dto.FilmDto;
import gov.iti.jets.dto.LanguageDto;
import gov.iti.jets.service.LanguageService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class LanguageWS {
    private LanguageService languageService;
    public LanguageWS()
    {
        languageService = LanguageService.getInstance();
    }
    @WebResult(name="language")
    public List<LanguageDto> findAllLanguages()
    {
        List<LanguageDto> languageDtos = languageService.findAll();
        return  languageDtos;
    }
    @WebResult(name="language")
    public List<LanguageDto> getLanguagesPage(@WebParam(name="page") int page, @WebParam(name="limit") int limit)
    {
        List<LanguageDto> languageDtos = languageService.getPage(page, limit);
        return  languageDtos;
    }

    @WebResult(name="language")
    public LanguageDto findLanguageById(@WebParam(name="id") Short id)
    {
        return languageService.findById(id);
    }

    @WebResult(name="language")
    public LanguageDto add(@WebParam(name = "language") LanguageDto dto) {
        LanguageDto languageDto = languageService.add(dto);
        return languageDto;
    }

    @WebResult(name="language")
    public LanguageDto updateLanguage(@WebParam(name = "id")Short id,@WebParam(name = "language") LanguageDto dto) {
        LanguageDto updatedDto = languageService.update(id, dto);
        return updatedDto;
    }

    @WebResult(name="language")
    public LanguageDto deleteLanguageById(@WebParam(name = "id")Short id) {
        LanguageDto dto = languageService.deleteById(id);
        return dto;
    }
}
