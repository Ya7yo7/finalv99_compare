package com.gp.currencyexchange.service;

import com.gp.currencyexchange.response.CompareDto;
import com.gp.currencyexchange.response.ConversionDto;

import java.util.List;

public interface ExchangeService {

  //  CompareDto Compare(String base, String target1, String target2,String amount);

    ConversionDto convert(String base, String target, String amount);
    public List<ConversionDto> Compare(String base, String targetCurrencies, String amount);
}
