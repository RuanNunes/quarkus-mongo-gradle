package ruan.nunes.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import ruan.nunes.data.PokemonEntity;
import ruan.nunes.data.client.PokemonClient;
import ruan.nunes.data.client.dto.PokemonList;

import java.util.ArrayList;
import java.util.List;

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
        final var response = pokemonClient.getPokemons(0,2000);
        final List<PokemonEntity> entityList = new ArrayList<>();
        response.results().forEach(r -> {
            entityList.add(PokemonEntity.builder()
                            .name(r.name())
                            .url(r.url())
                    .build());
        });
        PokemonEntity.persist(entityList);
        return response;
    }

}
