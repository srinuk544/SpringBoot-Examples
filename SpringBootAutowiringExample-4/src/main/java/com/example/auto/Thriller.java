package com.example.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Thriller implements IMovie {

	@Override
	public List<String> PrintMovies(String lang) {
		// TODO Auto-generated method stub
		if (lang.equals("tamil"))

			return Arrays.asList("96", "GOAT");

		if (lang.equals("Telugu"))
			return Arrays.asList("RRR", "Devara", "Gajini");
		if (lang.equals("English"))
			return Arrays.asList("parreatos of cariabon", "scam1996");

		return null;
	}

}
