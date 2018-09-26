package ru.geekbrains.startgame.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.Input;
import ru.geekbrains.startgame.base.Sprite;
import ru.geekbrains.startgame.math.Rect;

public class Ship extends Sprite {
    private Vector2 v = new Vector2();
    private Rect worldBounds;
    private boolean anim = false;
    private boolean lSide = false;

    public Ship(TextureAtlas atlas) {
        super(new TextureRegion(atlas.findRegion("main_ship"), 0, 0, 195, 287));
        v.set(0.3f, 0);
        setHeightProportion(0.15f);
    }

    @Override
    public void resize(Rect worldBounds) {
        this.worldBounds = worldBounds;
        setBottom(worldBounds.getBottom() + 0.02f);
    }

    @Override
    public void update(float delta) {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) pos.mulAdd(v, -delta);
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) pos.mulAdd(v, delta);
        if (anim) {
            if (lSide) pos.mulAdd(v, -delta);
            else pos.mulAdd(v, delta);
        }
        checkAndHandleBounds();
    }

    private void checkAndHandleBounds() {
        if (getRight() < worldBounds.getLeft()) setLeft(worldBounds.getRight());
        if (getLeft() > worldBounds.getRight()) setRight(worldBounds.getLeft());
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer) {
        anim = true;
        if (touch.x < 0) lSide = true;
        if (touch.x > 0) lSide = false;
        return false;
    }

    @Override
    public boolean touchUp(Vector2 touch, int pointer) {
        anim = false;
        return super.touchUp(touch, pointer);
    }
}
