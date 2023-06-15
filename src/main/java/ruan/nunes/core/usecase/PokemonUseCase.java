package ruan.nunes.core.usecase;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import ruan.nunes.dataprovider.database.PokemonEntity;
import ruan.nunes.dataprovider.client.PokemonClient;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PokemonUseCase {
    @Inject
    @RestClient
    PokemonClient pokemonClient;
    public List<PokemonEntity> migratePokemons(){
        final var response = pokemonClient.getPokemons(0,2000);
        final List<PokemonEntity> entityList = new ArrayList<>();
        response.results().forEach(r -> {
            final var entity = PokemonEntity.builder()
                    .name(r.name())
                    .url(r.url())
                    .build();
            entityList.add(entity);
        });
        PokemonEntity.persist(entityList);
        return (List<PokemonEntity>) PokemonEntity.findAll();
    }
}
