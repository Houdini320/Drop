package com.badlogic.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.BitmapFontLoader;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Drop extends Game {

	SpriteBatch batch;
	BitmapFont font;


	public void create() {
		batch = new SpriteBatch();
		// Use LibGDX's default Arial font.
		font = new BitmapFont(Gdx.files.internal("bitmap.fnt"), Gdx.files.internal("bitmap.png"), false);


		this.setScreen(new MainMenuScreen(this));
	}

	public void render() {
		super.render(); // important!

	}

	public void dispose() {
		batch.dispose();
		font.dispose();
	}

}