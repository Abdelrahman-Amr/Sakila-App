package gov.iti.jets.mapper;

import gov.iti.jets.dto.InventoryDto;
import gov.iti.jets.entity.Film;
import gov.iti.jets.entity.Inventory;
import gov.iti.jets.entity.Store;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface InventoryMapper  extends BaseMapper<Inventory, InventoryDto> {

    default Inventory partialUpdate(InventoryDto dto, Inventory entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getInventoryId() != null ) {
            entity.setInventoryId( dto.getInventoryId() );
        }
        if ( dto.getLastUpdate() != null ) {
            entity.setLastUpdate( dto.getLastUpdate() );
        }
        if ( dto.getFilmId() != null ) {
            Film film = new Film();
            film.setFilmId(dto.getFilmId().getFilmId());
            entity.setFilmId(film);
        }
        if ( dto.getStoreId() != null ) {
            Store store = new Store();
            store.setStoreId(dto.getStoreId().getStoreId());
            entity.setStoreId(store);
        }

        return entity;
    }

}
