package pl.kinson.footballapi.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Standing {

    private String countryId;

    @JsonProperty(value = "country_name")
    private String countryName;
    @JsonProperty(value = "league_id")
    private String leagueId;
    @JsonProperty(value = "league_name")
    private String leagueName;
    @JsonProperty(value = "team_id")
    private String teamId;
    @JsonProperty(value = "team_name")
    private String teamName;
    @JsonProperty(value = "overall_league_position")
    private String overallLeaguePosition;
    @JsonProperty(value = "overall_league_payed")
    private String overallLeaguePayed;
    @JsonProperty(value = "overall_league_W")
    private String overallLeagueW;
    @JsonProperty(value = "overall_league_D")
    private String overallLeagueD;
    @JsonProperty(value = "overall_league_L")
    private String overallLeagueL;
    @JsonProperty(value = "overall_league_GF")
    private String overallLeagueGF;
    @JsonProperty(value = "overall_league_GA")
    private String overallLeagueGA;
    @JsonProperty(value = "overall_league_PTS")
    private String overallLeaguePTS;

}