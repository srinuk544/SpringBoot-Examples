package com.example.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Horrer implements IMovie {

	@Override
	public List<String> PrintMovies(String lang) {
		// TODO Auto-generated method stub
		if (lang.equals("tamil"))

			return Arrays.asList("kamchana", "Aranmani");

		if (lang.equals("Telugu"))
			return Arrays.asList("Siva", "kamchana", "Chanramuki");
		if (lang.equals("English"))
			return Arrays.asList("om Bhim bush", "scam1996");

		return null;
	}

}
