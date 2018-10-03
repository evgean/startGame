package ru.geekbrains.startgame.sprites;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.startgame.base.Sprite;

public class Explosion extends ru.geekbrains.startgame.base.Explosion {

    private float animateInterval = 0.017f;
    private float animateTimer;

    public Explosion(TextureRegion region, int rows, int cols, int frames, Sound explSound) {
        super(region, rows, cols, frames, explSound);
    }

    public void set(float height, Vector2 pos) {
        this.pos.set(pos);
        setHeightProportion(height);
    }

    @Override
    public void update(float delta) {
        animateTimer += delta;
        if (frame == 1) sound();
        if (animateTimer >= animateInterval) {
            animateTimer = 0f;
            if (++frame == regions.length) {
                destroy();
            }
        }
    }

    @Override
    public void destroy() {
        super.destroy();
        frame = 0;
    }
}

