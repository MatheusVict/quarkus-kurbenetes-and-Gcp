package io.matheusvictor.dto;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class USDBRL {

    private String code;
    private String codein;
    private String name;
    private String high;
    private String low;
    private String varBid;
    private String pctChange;
    private String bid;
    private String ask;
    private String timestamp;
    @JsonbProperty("create_date")
    private String createDate;
}
