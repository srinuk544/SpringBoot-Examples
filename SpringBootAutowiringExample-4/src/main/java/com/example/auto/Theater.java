package com.example.auto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Theater {
	@Autowired
	@Qualifier("thriller")
	private IMovie iMovie;
	@Autowired
	private IMovie drama;

	private IMovie okk;

	@Autowired

	public Theater(@Qualifier("horrer") IMovie okk) {
		super();
		this.okk = okk;

	}

	public List<String> moiveRunning(String type, String lang) {

		if (type.equals("t"))

			return iMovie.PrintMovies(lang);
		if (type.equals("d"))
			return drama.PrintMovies(lang);
		if (type.equals("h"))
			return okk.PrintMovies(lang);

		return null;

	}

}
