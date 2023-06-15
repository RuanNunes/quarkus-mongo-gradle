package ruan.nunes.dataprovider.database;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@MongoEntity(collection = "pokemon",database = "pokemon-db")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokemonEntity extends PanacheMongoEntity {
    private String name;
    private String url;
}
