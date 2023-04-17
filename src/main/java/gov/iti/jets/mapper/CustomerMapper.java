package gov.iti.jets.mapper;

import gov.iti.jets.dto.CustomerDto;
import gov.iti.jets.entity.Address;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.entity.Store;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface CustomerMapper extends BaseMapper<Customer, CustomerDto>{

    default Customer partialUpdate(CustomerDto dto, Customer entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getCustomerId() != null ) {
            entity.setCustomerId( dto.getCustomerId() );
        }
        if ( dto.getFirstName() != null ) {
            entity.setFirstName( dto.getFirstName() );
        }
        if ( dto.getLastName() != null ) {
            entity.setLastName( dto.getLastName() );
        }
        if ( dto.getEmail() != null ) {
            entity.setEmail( dto.getEmail() );
        }
        entity.setActive( dto.isActive() );
        if ( dto.getCreateDate() != null ) {
            entity.setCreateDate( dto.getCreateDate() );
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
