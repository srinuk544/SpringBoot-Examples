package com.example.ok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Perform {

	@Autowired
	@Qualifier("guitar")
	private IInstrument iInstrument;
	@Autowired
	private IInstrument violian;

	private IInstrument inst;

	@Autowired
	public void setInst(@Qualifier("keyBoard") IInstrument inst) {
		this.inst = inst;
	}

	public void show(String song, String type) {
		if (type.equals("g"))
			iInstrument.PlaySong(song);

		if (type.equals("v"))
			violian.PlaySong(song);

		if (type.equals("k"))
			inst.PlaySong(song);

	}

}
