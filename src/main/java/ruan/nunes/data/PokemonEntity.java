package ruan.nunes.data;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "pokemon")
public class PokemonEntity extends PanacheMongoEntity {
    private String name;
    private String url;
}
