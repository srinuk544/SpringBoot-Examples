package com.example.auto;

import org.springframework.stereotype.Component;

@Component
public class Indore implements IGame {

	@Override
	public void playgame() {
		// TODO Auto-generated method stub

		System.out.println("chess");
		System.out.println("carrom");
	}

}
