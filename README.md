# Football API

This project is a RESTful API service, which enables you to retrieve a standing for a specific football team in a given country and league.

## Getting started

### Prerequisites
- Java 11 or higher installed
- Git
- IDE of your choice

### Installing

To install this project, follow these steps:

Clone the repository

```
git clone https://github.com/Kinson99/football-api.git
```
Open the project in your IDE and build it.

Run the application using the main method in the FootballApiApplication class.

## Usage
### Endpoint
The API provides a single endpoint:

'GET /standing'

### Query Parameters
The following query parameters must be specified in the request URL:

-'countryName': The name of the country in which the league is played.
-'leagueName': The name of the league in which the team is playing.
-'teamName': The name of the team for which to retrieve the standing.

### Example Request

```
GET /standing?countryName=England&leagueName=Premier League&teamName=Arsenal
```

### Example Response
```
{
    "countryId": "41",
    "countryName": "England",
    "leagueId": "2",
    "leagueName": "Premier League",
    "teamId": "42",
    "teamName": "Arsenal",
    "overallLeaguePosition": "11"
}
```

## Built With
-Spring Boot

-Lombok

-Jackson

-JUnit
