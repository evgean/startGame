package ru.geekbrains.startgame.pool;

import com.badlogic.gdx.audio.Sound;

import ru.geekbrains.startgame.base.SpritesPool;
import ru.geekbrains.startgame.math.Rect;
import ru.geekbrains.startgame.sprites.Enemy;
import ru.geekbrains.startgame.sprites.MainShip;

public class EnemyPool extends SpritesPool<Enemy> {

    private BulletPool bulletPool;
    private Sound shootSound;
    private MainShip mainShip;
    private ExplosionPool explosionPool;

    public EnemyPool(BulletPool bulletPool, ExplosionPool explosionPool, Sound shootSound, MainShip mainShip) {
        this.bulletPool = bulletPool;
        this.shootSound = shootSound;
        this.mainShip = mainShip;
        this.explosionPool = explosionPool;
    }

    @Override
    protected Enemy newObject() {
        return new Enemy(bulletPool, explosionPool, shootSound, mainShip);
    }
}
