package gov.iti.jets.exception;

import jakarta.xml.ws.WebFault;

@WebFault
public class CustomException extends RuntimeException{

    public CustomException(String msg)
    {
        super(msg);
    }
}
