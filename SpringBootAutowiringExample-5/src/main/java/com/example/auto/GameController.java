package com.example.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameController {

	private IGame iGame;
	private IGame oGame;
	private IGame wGame;

	public GameController(@Qualifier("indore") IGame iGame, @Qualifier("outdoor") IGame oGame,
			@Qualifier("web") IGame wGame) {
		super();
		this.iGame = iGame;
		this.oGame = oGame;
		this.wGame = wGame;
	}

	public void showgame() {
		iGame.playgame();
		oGame.playgame();
		wGame.playgame();

	}
}
