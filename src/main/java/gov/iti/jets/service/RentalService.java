package gov.iti.jets.service;

import gov.iti.jets.dto.RentalDto;
import gov.iti.jets.entity.Rental;
import gov.iti.jets.mapper.RentalMapper;

public class RentalService extends BaseServiceImpl<Rental, RentalDto, Integer>{

    private static  volatile RentalService rentalService;
    private RentalService()
    {
        super(Rental.class, RentalMapper.class);
    }
    public static RentalService getInstance()
    {
        if(rentalService == null)
        {
            synchronized (RentalService.class)
            {
                if(rentalService == null)
                {
                    rentalService = new RentalService();
                }
            }
        }
        return  rentalService;
    }
}
