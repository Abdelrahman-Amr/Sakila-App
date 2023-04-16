package gov.iti.jets.service;

import gov.iti.jets.dto.PaymentDto;
import gov.iti.jets.entity.Payment;
import gov.iti.jets.mapper.PaymentMapper;

public class PaymentService extends BaseServiceImpl<Payment, PaymentDto, Short>{

    private static  volatile PaymentService paymentService;
    private PaymentService()
    {
        super(Payment.class, PaymentMapper.class);
    }
    public static PaymentService getInstance()
    {
        if(paymentService == null)
        {
            synchronized (PaymentService.class)
            {
                if(paymentService == null)
                {
                    paymentService = new PaymentService();
                }
            }
        }
        return  paymentService;
    }
}
