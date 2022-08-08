package pl.kinson.footballapi.Client;


import org.springframework.stereotype.Component;
import pl.kinson.footballapi.Model.Country;
import pl.kinson.footballapi.Model.League;
import pl.kinson.footballapi.Model.Standing;
import pl.kinson.footballapi.Model.Team;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class FootballApiClientFacade {
    private final FootballApiClient footballApiClient;

    public static final String APIKey ="9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
    public static final String ACTION_COUNTRY ="get_countries";
    private static final String ACTION_LEAGUE ="get_leagues";
    private static final String ACTION_TEAM ="get_teams";
    private static final String ACTION_STANDING ="get_standings";

    public FootballApiClientFacade(final FootballApiClient footballApiClient) {
        this.footballApiClient = footballApiClient;
    }

    public Optional<Country> getCountry(final String countryName){
        Objects.requireNonNull(countryName, "countryName cannot be null.");
        return footballApiClient.getCountry(ACTION_COUNTRY, APIKey).stream()
                .filter(c -> c.getCountryName().equals(countryName))
                .findFirst();
    }

    public Optional<League> getLeague(final String leagueName, final String countryId){
        Objects.requireNonNull(leagueName, "leagueName cannot be null.");
        Objects.requireNonNull(countryId, "countryId cannot be null.");
        return footballApiClient.getLeague(ACTION_LEAGUE, countryId, APIKey).stream()
                .filter(c -> c.getLeagueName().equals(leagueName))
                .findFirst();
    }

    public Optional<Team> getTeam(final String teamName, final String leagueId){
        Objects.requireNonNull(teamName, "teamName cannot be null.");
        Objects.requireNonNull(leagueId, "leagueId cannot be null.");
        return footballApiClient.getTeam(ACTION_TEAM, leagueId, APIKey).stream()
                .filter(c -> c.getTeamName().equals(teamName))
                .findFirst();
    }

    public List<Standing> getStanding(final String leagueId){
        Objects.requireNonNull(leagueId, "leagueId cannot be null.");
        return footballApiClient.getStanding(ACTION_STANDING, leagueId, APIKey);
    }
}