package gov.iti.jets.mapper;

import gov.iti.jets.dto.AddressDto;
import gov.iti.jets.entity.Address;
import gov.iti.jets.entity.City;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.Arrays;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface AddressMapper extends BaseMapper<Address, AddressDto> {

    default Address partialUpdate(AddressDto dto, Address entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getAddressId() != null ) {
            entity.setAddressId( dto.getAddressId() );
        }
        if ( dto.getAddress() != null ) {
            entity.setAddress( dto.getAddress() );
        }
        if ( dto.getAddress2() != null ) {
            entity.setAddress2( dto.getAddress2() );
        }
        if ( dto.getDistrict() != null ) {
            entity.setDistrict( dto.getDistrict() );
        }
        if ( dto.getPostalCode() != null ) {
            entity.setPostalCode( dto.getPostalCode() );
        }
        if ( dto.getPhone() != null ) {
            entity.setPhone( dto.getPhone() );
        }
        byte[] location = dto.getLocation();
        if ( location != null ) {
            entity.setLocation( Arrays.copyOf( location, location.length ) );
        }
        if ( dto.getLastUpdate() != null ) {
            entity.setLastUpdate( dto.getLastUpdate() );
        }
            if(dto.getCityId()!=null)
            {
                City city = new City();
                city.setCityId(dto.getCityId().getCityId());
                city.setCity(dto.getCityId().getCity());
                city.setLastUpdate(dto.getCityId().getLastUpdate());
                entity.setCityId(city);
            }



        return entity;
    }

}
