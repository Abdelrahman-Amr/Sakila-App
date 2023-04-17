package gov.iti.jets.mapper;

import gov.iti.jets.dto.StaffDto;
import gov.iti.jets.entity.Address;
import gov.iti.jets.entity.Staff;
import gov.iti.jets.entity.Store;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.Arrays;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface StaffMapper  extends BaseMapper<Staff, StaffDto>{

    default Staff partialUpdate(StaffDto dto, Staff entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getStaffId() != null ) {
            entity.setStaffId( dto.getStaffId() );
        }
        if ( dto.getFirstName() != null ) {
            entity.setFirstName( dto.getFirstName() );
        }
        if ( dto.getLastName() != null ) {
            entity.setLastName( dto.getLastName() );
        }
        byte[] picture = dto.getPicture();
        if ( picture != null ) {
            entity.setPicture( Arrays.copyOf( picture, picture.length ) );
        }
        if ( dto.getEmail() != null ) {
            entity.setEmail( dto.getEmail() );
        }
        entity.setActive( dto.isActive() );
        if ( dto.getUsername() != null ) {
            entity.setUsername( dto.getUsername() );
        }
        if ( dto.getPassword() != null ) {
            entity.setPassword( dto.getPassword() );
        }
        if ( dto.getLastUpdate() != null ) {
            entity.setLastUpdate( dto.getLastUpdate() );
        }
        if ( dto.getAddressId() != null ) {
            Address address = new Address();
            address.setAddressId(dto.getAddressId().getAddressId());
            entity.setAddressId(address);
        }
        if ( dto.getStoreId() != null ) {
            Store store = new Store();
            store.setStoreId(dto.getStoreId().getStoreId());
            entity.setStoreId(store);
        }

        return entity;
    }



}
