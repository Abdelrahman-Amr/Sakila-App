package gov.iti.jets.webService;

import gov.iti.jets.dto.ActorDto;
import gov.iti.jets.dto.FilmDto;
import gov.iti.jets.service.ActorService;
import gov.iti.jets.service.FilmService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class FilmWS {

    private FilmService filmService;
    public FilmWS()
    {
        filmService = FilmService.getInstance();
    }
    @WebResult(name="film")
    public List<FilmDto> findAll()
    {
        List<FilmDto> films = filmService.findAll();
        return  films;
    }

    @WebResult(name="film")
    public FilmDto findById(@WebParam(name="id") Short id)
    {
        return filmService.findById(id);
    }

    @WebResult(name="film")
    public FilmDto add(@WebParam(name = "film") FilmDto dto) {
        FilmDto filmDto = filmService.add(dto);
        return filmDto;
    }

    @WebResult(name="film")
    public FilmDto update(@WebParam(name = "id")Short id,@WebParam(name = "film") FilmDto dto) {
        FilmDto updatedDto = filmService.update(id, dto);
        return updatedDto;
    }

}
