package ruan.nunes.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import ruan.nunes.data.client.PokemonClient;
import ruan.nunes.data.client.dto.PokemonList;

@Path("/pokemon")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PokemonResource {
    @Inject
    @RestClient
    PokemonClient pokemonClient;

    @GET
    @Path("/client")
    public PokemonList pokemonList(){
        return pokemonClient.getPokemons();
    }

    @GET
    //https://pokeapi.co/api/v2/pokemon/
    public String pokemon() {
        return """
                {
                "count": 1281,
                "next": "https://pokeapi.co/api/v2/pokemon/?offset=20&limit=20",
                "previous": null,
                "results": [
                {
                "name": "bulbasaur",
                "url": "https://pokeapi.co/api/v2/pokemon/1/"
                },
                {
                "name": "ivysaur",
                "url": "https://pokeapi.co/api/v2/pokemon/2/"
                },
                {
                "name": "venusaur",
                "url": "https://pokeapi.co/api/v2/pokemon/3/"
                },
                {
                "name": "charmander",
                "url": "https://pokeapi.co/api/v2/pokemon/4/"
                },
                {
                "name": "charmeleon",
                "url": "https://pokeapi.co/api/v2/pokemon/5/"
                },
                {
                "name": "charizard",
                "url": "https://pokeapi.co/api/v2/pokemon/6/"
                },
                {
                "name": "squirtle",
                "url": "https://pokeapi.co/api/v2/pokemon/7/"
                },
                {
                "name": "wartortle",
                "url": "https://pokeapi.co/api/v2/pokemon/8/"
                },
                {
                "name": "blastoise",
                "url": "https://pokeapi.co/api/v2/pokemon/9/"
                },
                {
                "name": "caterpie",
                "url": "https://pokeapi.co/api/v2/pokemon/10/"
                },
                {
                "name": "metapod",
                "url": "https://pokeapi.co/api/v2/pokemon/11/"
                },
                {
                "name": "butterfree",
                "url": "https://pokeapi.co/api/v2/pokemon/12/"
                },
                {
                "name": "weedle",
                "url": "https://pokeapi.co/api/v2/pokemon/13/"
                },
                {
                "name": "kakuna",
                "url": "https://pokeapi.co/api/v2/pokemon/14/"
                },
                {
                "name": "beedrill",
                "url": "https://pokeapi.co/api/v2/pokemon/15/"
                },
                {
                "name": "pidgey",
                "url": "https://pokeapi.co/api/v2/pokemon/16/"
                },
                {
                "name": "pidgeotto",
                "url": "https://pokeapi.co/api/v2/pokemon/17/"
                },
                {
                "name": "pidgeot",
                "url": "https://pokeapi.co/api/v2/pokemon/18/"
                },
                {
                "name": "rattata",
                "url": "https://pokeapi.co/api/v2/pokemon/19/"
                },
                {
                "name": "raticate",
                "url": "https://pokeapi.co/api/v2/pokemon/20/"
                }
                ]
                }
                """;
    }
}
