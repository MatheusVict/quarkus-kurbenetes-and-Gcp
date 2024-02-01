package io.matheusvictor.client;

import io.matheusvictor.dto.CryptoPriceDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient
public interface CryptoPriceClient {

    @GET
    List<CryptoPriceDTO> getPriceBy(@QueryParam("vs_currency") String vsCurrency, @QueryParam("ids") String ids);
}
