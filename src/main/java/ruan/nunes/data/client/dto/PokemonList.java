package ruan.nunes.data.client.dto;

import java.util.List;

public record PokemonList(Long count, String next, String previous, List<Results> results){}