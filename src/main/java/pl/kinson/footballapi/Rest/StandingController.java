package pl.kinson.footballapi.Rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.kinson.footballapi.DTO.StandingDTO;
import pl.kinson.footballapi.Model.Standing;
import pl.kinson.footballapi.Service.StandingService;

@RestController
public class StandingController {

    final private StandingService standingService;

    public StandingController(final StandingService standingService) {
        this.standingService = standingService;
    }

    @RequestMapping("/standing")
    public StandingDTO index(@RequestParam(value = "countryName") String countryName,
                             @RequestParam(value = "leagueName") String leagueName,
                             @RequestParam(value = "teamName") String teamName) {
        final Standing standing = standingService.findStanding(countryName, leagueName, teamName);
        return StandingDTO.builder()
                .countryId(standing.getCountryId())
                .countryName(standing.getCountryName())
                .leagueId(standing.getLeagueId())
                .leagueName(standing.getLeagueName())
                .teamId(standing.getTeamId())
                .teamName(standing.getTeamName())
                .overallLeaguePosition(standing.getOverallLeaguePosition())
                .build();
    }

}