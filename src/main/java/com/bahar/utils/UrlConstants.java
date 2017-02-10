package com.bahar.utils;

public class UrlConstants {
	private UrlConstants(){
		
	}
	public static final String VERSION = "/v1";
	public static final String MOVIE = VERSION+"/movies";
	public static final String MOVIE_ID = VERSION+MOVIE+"/{id}";
}
