package ru.geekbrains.startgame;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.startgame.base.Sprite;
import ru.geekbrains.startgame.math.Rect;

public class Background extends Sprite{
    public Background(TextureRegion region) {
        super(region);
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(worldBounds.getHeight());
        pos.set(worldBounds.pos);
    }
}
