package com.bahar.requestdto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class MovieRequestDto {
	public interface UpdateValidation {

	}

	public interface CreateValidation {

	}

	@NotNull(groups = { UpdateValidation.class })
	@Min(1)
	private long id;
	
	@NotNull(groups = { CreateValidation.class, UpdateValidation.class })
	private String title;
	
	@NotNull(groups = { CreateValidation.class, UpdateValidation.class })
	@Min(18)
	private int year;
}
