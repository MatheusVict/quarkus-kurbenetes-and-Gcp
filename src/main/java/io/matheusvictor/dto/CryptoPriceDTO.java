package io.matheusvictor.dto;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CryptoPriceDTO {
    private String id;
    private String symbol;
    private String name;
    private String image;

    @JsonbProperty("current_price")
    private double currentPrice;

    @JsonbProperty("market_cap")
    private Long marketCap;

    @JsonbProperty("market_cap_rank")
    private Long marketCapRank;

    @JsonbProperty("fully_diluted_valuation")
    private Long fullyDilutedValuation;

    @JsonbProperty("total_volume")
    private Long totalVolume;

    @JsonbProperty("high_24h")
    private double high24h;

    @JsonbProperty("low_24h")
    private double low24h;

    @JsonbProperty("price_change_24h")
    private double priceChange24h;

    @JsonbProperty("price_change_percentage_24h")
    private double priceChangePercentage24h;

    @JsonbProperty("market_cap_change_24h")
    private double marketCapChange24h;

    @JsonbProperty("market_cap_change_percentage_24h")
    private double marketCapChangePercentage24h;

    @JsonbProperty("circulating_supply")
    private int circulatingSupply;

    @JsonbProperty("total_supply")
    private int totalSupply;

    @JsonbProperty("max_supply")
    private int maxSupply;

    @JsonbProperty("ath")
    private double ath;

    @JsonbProperty("ath_change_percentage")
    private double athChangePercentage;

    @JsonbProperty("ath_date")
    private Date athDate;

    private double atl;

    @JsonbProperty("atl_change_percentage")
    private double atlChangePercentage;

    @JsonbProperty("atl_date")
    private Date atlDate;

    private Object roi;

    @JsonbProperty("last_updated")
    private Date lastUpdated;
}
