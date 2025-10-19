package com.example.ok;

import org.springframework.stereotype.Component;

@Component
public class Violian implements IInstrument {

	@Override
	public void PlaySong(String song) {
		// TODO Auto-generated method stub
		System.out.println("playing:" + song + "Using Violian");

	}

}