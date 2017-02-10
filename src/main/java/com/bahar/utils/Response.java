package com.bahar.utils;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response<T> {
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private String status;
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private String statusCode;
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private int count;
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private String type;
	@JsonInclude(JsonInclude.Include.ALWAYS)
	private T results;

}
