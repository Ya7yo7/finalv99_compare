package com.gp.currencyexchange.controller;

import com.gp.currencyexchange.response.CompareDto;
import com.gp.currencyexchange.response.ConversionDto;
import com.gp.currencyexchange.service.ExchangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class currencyExchangeCont {

    private final ExchangeService exchange;

    @GetMapping("/pair/{base}/{target}/{amount}")
    public ConversionDto getExchangeRate(@PathVariable String base, @PathVariable String target, @PathVariable String amount) {
        return exchange.convert(base, target, amount);
    }

    @GetMapping("/compare/{base}/{targetCurrencies}/{amount}")
    public List<ConversionDto> compareCurrencies(
            @PathVariable String base,
            @PathVariable String targetCurrencies,
            @PathVariable String amount) {

        // Call the Compare function from the ExchangeService with the provided parameters
        List<ConversionDto> comparisons = exchange.Compare(base, targetCurrencies, amount);

        return comparisons;
    }
}
