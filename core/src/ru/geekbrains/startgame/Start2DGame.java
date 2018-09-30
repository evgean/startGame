package ru.geekbrains.startgame;

import com.badlogic.gdx.Game;

import ru.geekbrains.startgame.screen.MenuScreen;


public class Start2DGame extends Game {
    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }
}
