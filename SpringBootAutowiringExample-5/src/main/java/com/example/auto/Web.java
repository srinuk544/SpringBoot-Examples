package com.example.auto;

import org.springframework.stereotype.Component;

@Component
public class Web implements IGame {

	@Override
	public void playgame() {
		// TODO Auto-generated method stub

		System.out.println("8BallPool");
		System.out.println("Candy crush");
	}

}
