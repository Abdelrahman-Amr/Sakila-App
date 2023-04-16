package gov.iti.jets.mapper;

import gov.iti.jets.dto.PaymentDto;
import gov.iti.jets.entity.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface PaymentMapper extends BaseMapper<Payment, PaymentDto> {

}
