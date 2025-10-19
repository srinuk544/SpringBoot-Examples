package com.example.auto;

import org.springframework.stereotype.Component;

@Component
public class Outdoor implements IGame {

	@Override
	public void playgame() {
		// TODO Auto-generated method stub

		System.out.println("Cricket");
		System.out.println("footBall");
	}

}
