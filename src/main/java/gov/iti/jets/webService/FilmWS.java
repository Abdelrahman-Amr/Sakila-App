package gov.iti.jets.webService;

import gov.iti.jets.dto.ActorDto;
import gov.iti.jets.dto.CountryDto;
import gov.iti.jets.dto.FilmDto;
import gov.iti.jets.service.ActorService;
import gov.iti.jets.service.FilmService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

import java.util.List;

@WebService
public class FilmWS {
    private FilmService filmService;
    public FilmWS()
    {
        filmService = FilmService.getInstance();
    }
    @WebResult(name="Films")
    public List<FilmDto> findAllFilms()
    {
        List<FilmDto> filmDtos = filmService.findAll();
        return  filmDtos;
    }

    @WebResult(name="Films")
    public List<FilmDto> getFilmsPage(@WebParam(name="page") int page, @WebParam(name="limit") int limit)
    {
        List<FilmDto> filmDtos = filmService.getPage(page, limit);
        return  filmDtos;
    }

    @WebResult(name="Film")
    public FilmDto findFilmById(@WebParam(name="id") short id)
    {
        return filmService.findById(id);
    }

    @WebResult(name="Film")
    public FilmDto addFilm(@WebParam(name = "Film") FilmDto dto) {
        FilmDto savedDto = filmService.add(dto);
        return savedDto;
    }

    @WebResult(name="Film")
    public FilmDto updateFilm(@WebParam(name = "id")short id,@WebParam(name = "Film") FilmDto dto) {
        FilmDto updatedDto = filmService.update(id, dto);
        return updatedDto;
    }

    @WebResult(name="Film")
    public FilmDto deleteFilmById(@WebParam(name = "id")short id) {
        FilmDto dto = filmService.deleteById(id);
        return dto;
    }

    public List<FilmDto> findFilmsByActorId(@QueryParam("actorId") int actorId)
    {
        List<FilmDto> filmDtos = filmService.findFilmsByActorId(actorId);
        return  filmDtos;
    }
}
