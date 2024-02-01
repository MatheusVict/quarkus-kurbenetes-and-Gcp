package io.matheusvictor.resource;

import io.matheusvictor.client.PriceClient;
import io.matheusvictor.dto.CurrencyPriceDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/currency")
public class CurrencyResource {

    @Inject
    @RestClient
    PriceClient priceClient;


    @GET
    @Path("/info")
    public String getPairValue() {
        CurrencyPriceDTO currencyValues = priceClient.getPriceByPair("USD-BRL");


        return "The high price to pair (USD-BRL) is: "
                + currencyValues.getUSDBRL().getHigh();
    }
}
