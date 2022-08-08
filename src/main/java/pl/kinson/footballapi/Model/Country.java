package pl.kinson.footballapi.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Country {

    @JsonProperty(value = "country_id")
    private String countryId;

    @JsonProperty(value = "country_name")
    private String countryName;

    @JsonProperty(value = "country_logo")
    private String countryLogo;
}