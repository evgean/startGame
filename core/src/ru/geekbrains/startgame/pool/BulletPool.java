package ru.geekbrains.startgame.pool;

import ru.geekbrains.startgame.base.SpritesPool;
import ru.geekbrains.startgame.sprites.Bullet;

public class BulletPool extends SpritesPool<Bullet> {

    @Override
    protected Bullet newObject() {
        return new Bullet();
    }

    @Override
    protected void log() {
        System.out.println("Bullet active/free: " + activeObjects.size() + "/" + freeObjects.size());
    }
}
