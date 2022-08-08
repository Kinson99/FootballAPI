package pl.kinson.footballapi.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Team {
    @JsonProperty(value = "team_key")
    private String teamId;
    @JsonProperty(value = "team_name")
    private String teamName;
    @JsonProperty(value = "team_badge")
    private String teamBadge;
}