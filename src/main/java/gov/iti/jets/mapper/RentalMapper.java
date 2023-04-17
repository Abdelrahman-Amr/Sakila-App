package gov.iti.jets.mapper;

import gov.iti.jets.dto.RentalDto;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.entity.Inventory;
import gov.iti.jets.entity.Rental;
import gov.iti.jets.entity.Staff;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface RentalMapper extends BaseMapper<Rental, RentalDto> {

    default Rental partialUpdate(RentalDto dto, Rental entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getRentalId() != null ) {
            entity.setRentalId( dto.getRentalId() );
        }
        if ( dto.getRentalDate() != null ) {
            entity.setRentalDate( dto.getRentalDate() );
        }
        if ( dto.getReturnDate() != null ) {
            entity.setReturnDate( dto.getReturnDate() );
        }
        if ( dto.getLastUpdate() != null ) {
            entity.setLastUpdate( dto.getLastUpdate() );
        }
        if ( dto.getCustomerId() != null ) {
            Customer customer = new Customer();
            customer.setCustomerId(dto.getCustomerId().getCustomerId());
            entity.setCustomerId(customer);
        }
        if ( dto.getStaffId() != null ) {
            Staff staff = new Staff();
            staff.setStaffId(dto.getStaffId().getStaffId());
            entity.setStaffId(staff);
        }
        if ( dto.getInventoryId() != null ) {
            Inventory inventory = new Inventory();
            inventory.setInventoryId(dto.getInventoryId().getInventoryId());
            entity.setInventoryId(inventory);
        }


        return entity;
    }

}
