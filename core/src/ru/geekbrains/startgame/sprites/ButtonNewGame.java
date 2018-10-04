package ru.geekbrains.startgame.sprites;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.startgame.base.ActionListener;
import ru.geekbrains.startgame.base.ScaledTouchUpButton;
import ru.geekbrains.startgame.math.Rect;

public class ButtonNewGame extends ScaledTouchUpButton {

    public ButtonNewGame(TextureAtlas atlas, ActionListener actionListener) {
        super(atlas.findRegion("button_new_game"), actionListener, 0.9f);
        setHeightProportion(0.1f);
    }


}