package com.gp.currencyexchange.response;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class ConversionDto {
    private String base_code;
    private String target_code;
    private String amount;
    private String conversion_rate;

}
