package ruan.nunes.data;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Builder;

@MongoEntity(collection = "pokemon",database = "pokemon-db")
@Builder
public class PokemonEntity extends PanacheMongoEntity {
    private String name;
    private String url;
}
