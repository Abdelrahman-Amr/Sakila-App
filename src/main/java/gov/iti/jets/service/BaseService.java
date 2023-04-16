package gov.iti.jets.service;

import gov.iti.jets.dto.BaseDto;
import gov.iti.jets.entity.BaseEntity;

import java.util.List;

public interface BaseService<E extends BaseEntity, D extends BaseDto, T> {

    public D findById(T id);
    public List<D> findAll();
    public List<D> getPage(int page, int limit);

    public D add(D dto) ;
    public D update(T id, D dto) ;

    D deleteById(T id);


}
