package pl.kinson.footballapi.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class League {
    @JsonProperty(value = "league_id")
    private String leagueId;
    @JsonProperty(value = "league_name")
    private String leagueName;
    @JsonProperty(value = "league_season")
    private String leagueSeason;
    @JsonProperty(value = "league_logo")
    private String leagueLogo;
}
