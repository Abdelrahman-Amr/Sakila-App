package gov.iti.jets.webService;

import gov.iti.jets.dto.CityDto;
import gov.iti.jets.dto.PaymentDto;
import gov.iti.jets.service.PaymentService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class PaymentWS {

    private PaymentService paymentService;
    public PaymentWS()
    {
        paymentService = PaymentService.getInstance();
    }
    @WebResult(name="Payment")
    public List<PaymentDto> findAllPayments()
    {
        List<PaymentDto> paymentDtos = paymentService.findAll();
        return  paymentDtos;
    }
    @WebResult(name="Payment")
    public List<PaymentDto> getPaymentsPage(@WebParam(name="page") int page, @WebParam(name="limit") int limit)
    {
        List<PaymentDto> paymentDtos = paymentService.getPage(page, limit);
        return  paymentDtos;
    }

    @WebResult(name="Payment")
    public PaymentDto findPaymentById(@WebParam(name="id") short id)
    {
        return paymentService.findById(id);
    }

    @WebResult(name="Payment")
    public PaymentDto addPayment(@WebParam(name = "Payment") PaymentDto dto) {
        PaymentDto savedDto = paymentService.add(dto);
        return savedDto;
    }


    @WebResult(name="Payment")
    public PaymentDto deletePaymentById(@WebParam(name = "id")short id) {
        PaymentDto dto = paymentService.deleteById(id);
        return dto;
    }
}
