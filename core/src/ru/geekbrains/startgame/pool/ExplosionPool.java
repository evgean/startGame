package ru.geekbrains.startgame.pool;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.geekbrains.startgame.base.SpritesPool;
import ru.geekbrains.startgame.sprites.Explosion;

public class ExplosionPool extends SpritesPool<Explosion> {

    private final TextureRegion textureRegion;
    private Sound explSound;

    public ExplosionPool(TextureAtlas atlas, Sound explSound) {
        this.textureRegion = atlas.findRegion("explosion");
        this.explSound = explSound;
    }

    @Override
    protected Explosion newObject() {
        return new Explosion(textureRegion, 9, 9, 74, explSound);
    }
}
