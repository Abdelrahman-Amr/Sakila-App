package gov.iti.jets.mapper;

import gov.iti.jets.dto.StoreDto;
import gov.iti.jets.entity.Address;
import gov.iti.jets.entity.Staff;
import gov.iti.jets.entity.Store;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface StoreMapper extends BaseMapper<Store, StoreDto>{

    default Store partialUpdate(StoreDto dto, Store entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getStoreId() != null ) {
            entity.setStoreId( dto.getStoreId() );
        }
        if ( dto.getLastUpdate() != null ) {
            entity.setLastUpdate( dto.getLastUpdate() );
        }
        if ( dto.getAddressId() != null ) {
            Address address = new Address();
            address.setAddressId(dto.getAddressId().getAddressId());
            entity.setAddressId(address);
        }
        if ( dto.getManagerStaffId() != null ) {
            Staff staff = new Staff();
            staff.setStaffId(dto.getManagerStaffId().getStaffId());
            entity.setManagerStaffId(staff);
        }

        return entity;
    }

}
