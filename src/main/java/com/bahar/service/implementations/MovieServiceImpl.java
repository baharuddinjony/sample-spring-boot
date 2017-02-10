package com.bahar.service.implementations;


import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bahar.models.Movie;
import com.bahar.repositories.MovieRepositoriy;
import com.bahar.requestdto.MovieRequestDto;
import com.bahar.service.interfaces.MovieService;
import com.bahar.utils.Response;

@Service("movieService")
@Transactional
public class MovieServiceImpl implements MovieService {
	private final MovieRepositoriy movieRepository;
	private Movie movie=new Movie();

	@Autowired
	public MovieServiceImpl(MovieRepositoriy movieRepository) {
		this.movieRepository = movieRepository;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Response get(long id) {
		return Response.builder().status("").statusCode("").count(0).type("").results(movieRepository.findOne(id))
				.build();

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Response getAll() {
		return Response.builder().status("").statusCode("").count(0).type("").results(movieRepository.findAll())
				.build();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Response update(MovieRequestDto movieRequestDto) {
		BeanUtils.copyProperties(movieRequestDto, movie);
		return Response.builder().status("").statusCode("").count(0).type("").results(movieRepository.save(movie))
				.build();

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Response create(MovieRequestDto movieRequestDto) {
		BeanUtils.copyProperties(movieRequestDto, movie);
		return Response.builder().status("").statusCode("").count(0).type("").results(movieRepository.save(movie))
				.build();

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Response delete(long id) {
		return Response.builder().status("").statusCode("").count(0).type("").results(movieRepository.findOne(id))
				.build();

	}

}
