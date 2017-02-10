package com.bahar.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bahar.utils.UrlConstants;

@RestController
@RequestMapping(UrlConstants.MOVIE)
public class MovieController {

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String createMovie(String title, int year) {

		return "creation successful: ";
	}

}
