//package gov.iti.jets.webService;
//
//import gov.iti.jets.dto.BaseDto;
//import gov.iti.jets.entity.BaseEntity;
//import gov.iti.jets.service.BaseService;
//import jakarta.jws.WebParam;
//import jakarta.jws.WebResult;
//import jakarta.jws.WebService;
//import jakarta.ws.rs.*;
//
//import java.util.List;
//
//@WebService
//public class BaseWSImpl  <E extends BaseEntity, D extends BaseDto, T> implements BaseWS<E, D, T> {
//    protected BaseService<E, D, T> baseService;
//
//    @Override
//    @WebResult(name="dto")
//
//    public D findById(@PathParam("id") T id) {
//        D dto = baseService.findById(id);
//        return dto;
//    }
//
//    @Override
//    @WebResult(name="dtos")
//    public List<D> findAll() {
//        List<D> dtos = baseService.findAll();
//        return dtos;
//    }
//
//    @Override
//    @WebResult(name="dto")
//    public D add(@WebParam(name="dto") D dto) {
//        D savedDto = baseService.add(dto);
//        return savedDto;
//    }
//
//    @Override
//    @WebResult(name="dto")
//    public D update(@PathParam("id") T id, @WebParam(name="dto")  D dto) {
//        D savedDto = baseService.update(id, dto);
//        return savedDto;
//    }
//
//}
