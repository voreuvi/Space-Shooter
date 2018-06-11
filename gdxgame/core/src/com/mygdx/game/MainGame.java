package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.screens.GameOverScreen;
import com.mygdx.game.screens.GameScreen;

//This class is self-explanatory




public class MainGame extends Game {

	/*Put Screens Here i.e.
	private AsteroidsGameOverScreen mGameOverScreen
	private ResourceManager mResources
	private AsteroidsGameScreen mGameScreen*/

	SpriteBatch batch;
	Texture img;

	private GameOverScreen scrGameOverScreen;
	private GameScreen scrGameScreen;
	private ResourceManager scrResources;

	public static MainGame scrInstance;


	public static MainGame getInstance(){
		return scrInstance;
	}

	@Override
	public void create () {
		scrInstance = this;

		scrResources = new ResourceManager();
		scrResources.loadResources();

		scrGameScreen = new GameScreen();
		setScreen(scrGameScreen);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();






		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
