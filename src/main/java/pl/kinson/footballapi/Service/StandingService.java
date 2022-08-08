package pl.kinson.footballapi.Service;

import pl.kinson.footballapi.Model.Standing;

public interface StandingService {
    Standing findStanding(String countryName, String leagueName, String teamName);
}