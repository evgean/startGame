package ru.geekbrains.startgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ru.geekbrains.startgame.Start2DGame;
import ru.geekbrains.startgame.StartGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		float aspect = 3f / 4f;
		config.resizable = false;
		config.width = 300;
		config.height = (int) (config.width / aspect);
		new LwjglApplication(new Start2DGame(), config);
	}
}
