package ruan.nunes.dataprovider.client.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record PokemonList(Long count, String next, String previous, List<Results> results){}