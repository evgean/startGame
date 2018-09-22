package ru.geekbrains.startgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.startgame.base.Sprite;
import ru.geekbrains.startgame.math.Rect;

public class BtnEnd extends Sprite {
    public BtnEnd(TextureRegion region) {
        super(region);
    }


    @Override
    public boolean touchDown(Vector2 touch, int pointer) {
        if (isMe(touch)) Gdx.app.exit();
        return super.touchDown(touch, pointer);
    }

}
