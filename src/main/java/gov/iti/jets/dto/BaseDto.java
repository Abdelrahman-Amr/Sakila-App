package gov.iti.jets.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseDto implements Serializable {
    private  transient  Date lastUpdate;
}
