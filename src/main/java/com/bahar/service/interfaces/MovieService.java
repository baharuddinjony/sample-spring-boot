package com.bahar.service.interfaces;



import com.bahar.requestdto.MovieRequestDto;
import com.bahar.utils.Response;
import com.fasterxml.jackson.databind.JsonNode;

public interface MovieService {
	Response<JsonNode> get(long id);
	Response<JsonNode> getAll();
	Response<JsonNode> update(MovieRequestDto movie);
	Response<JsonNode> create(MovieRequestDto movie);
	Response<JsonNode> delete(long id);

}
