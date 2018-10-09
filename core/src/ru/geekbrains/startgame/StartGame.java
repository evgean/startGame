package ru.geekbrains.startgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class StartGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	TextureRegion bg;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		bg = new TextureRegion(new Texture("bg.jpg"), 0, 0, 2048, 2048);
	}

	@Override
	public void render () {
		batch.begin();
		batch.draw(bg, 0, 0);
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
