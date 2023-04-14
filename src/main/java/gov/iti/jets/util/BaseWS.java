//package gov.iti.jets.webService;
//
//import gov.iti.jets.dto.BaseDto;
//import gov.iti.jets.entity.BaseEntity;
//import jakarta.jws.WebParam;
//import jakarta.jws.WebResult;
//import jakarta.ws.rs.*;
//import java.util.List;
//
//public interface BaseWS  <E extends BaseEntity, D extends BaseDto, T> {
//
//
//    public D findById(@PathParam("id") T id);
//
//    public List<D> findAll();
//
//
//    public D add(@WebParam(name="dto") D dto);
//
//
//    public D update(@PathParam("id") T id, @WebParam(name="dto") D dto);
//
//}
