package com.bahar.controllers;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bahar.models.Movie;
import com.bahar.requestdto.MovieRequestDto;
import com.bahar.service.interfaces.MovieService;
import com.bahar.utils.Response;
import com.bahar.utils.UrlConstants;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
@RequestMapping(UrlConstants.MOVIE)
public class MovieController {
	private static final Logger logger = LogManager.getLogger(MovieController.class.getName());
	private final MovieService movieService;

	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Response<JsonNode> createMovie(@Validated({MovieRequestDto.CreateValidation.class}) @RequestBody MovieRequestDto movie , BindingResult bindingResults) {
		logger.info(movie);
		return movieService.create(movie);
	}

	@RequestMapping(value=UrlConstants.MOVIE_ID , method = RequestMethod.PUT)
	@ResponseBody
	public Response<JsonNode> updateMovie(@PathVariable long id,@Validated({MovieRequestDto.UpdateValidation.class}) @RequestBody MovieRequestDto movie , BindingResult bindingResults) {
		logger.info(movie);
		return movieService.update(movie);
	}
	
	@RequestMapping(value=UrlConstants.MOVIE_ID , method = RequestMethod.GET)
	@ResponseBody
	public Response<JsonNode> getMovie(@PathVariable long id) {
		logger.info(id);
		return movieService.get(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Response<JsonNode> getAllMovies() {
		logger.info("getAll");
		return movieService.getAll();
	}

}
