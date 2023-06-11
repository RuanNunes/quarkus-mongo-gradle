package ruan.nunes.data.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import ruan.nunes.data.client.dto.PokemonList;

@RegisterRestClient(configKey = "pokemon-api")
public interface PokemonClient {
    @GET
    @Path("/pokemon")
    PokemonList getPokemons(@QueryParam("offset") int offset, @QueryParam("limit") int limit);
}
