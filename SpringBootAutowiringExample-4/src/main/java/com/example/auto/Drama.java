package com.example.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Drama implements IMovie {

	@Override
	public List<String> PrintMovies(String lang) {
		// TODO Auto-generated method stub
		if (lang.equals("tamil"))

			return Arrays.asList("Amaran", "poni");

		if (lang.equals("Telugu"))
			return Arrays.asList("Jayam manadhe raaaaaaaa", "kalisiumdha raaaa", "premimchukumdham raaaa");
		if (lang.equals("English"))
			return Arrays.asList("Taitan", "sofjjjfj");

		return null;
	}

}