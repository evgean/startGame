package ru.geekbrains.startgame.base;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Explosion extends Sprite {
    private Sound explSound;

    public Explosion(TextureRegion region, int rows, int cols, int frames, Sound explSound ) {
        super(region, rows, cols, frames);
        this.explSound = explSound;
    }

    public void sound() {
        explSound.play();
    }
}
