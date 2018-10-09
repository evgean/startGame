package ru.geekbrains.startgame.sprites;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.startgame.base.ActionListener;
import ru.geekbrains.startgame.base.ScaledTouchUpButton;


public class ButtonNewGame extends ScaledTouchUpButton {

    public ButtonNewGame(TextureAtlas atlas, ActionListener actionListener) {
        super(atlas.findRegion("button_new_game"), actionListener, 0.9f);
        setHeightProportion(0.05f);
        setTop(-0.012f);
    }
}