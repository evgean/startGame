package ru.geekbrains.startgame.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.startgame.base.Base2DScreen;

public class MenuScreen extends Base2DScreen {
    SpriteBatch batch;
    Texture img;
    TextureRegion region;
    Vector2 pos;
    float speed;
    float keyStep;
    Vector2 step;
    Vector2 newCordVector;
    Vector2 direction;
    boolean anim = false;

    public MenuScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();
        batch = new SpriteBatch();
        img = new Texture("myShip_01.png");
        pos = new Vector2(300, 300);
        //time to get to the destination
        speed = 0.5f;
        //pixels to move ship when press key arrows
        keyStep = 3;
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(0.7f,0.7f,0.7f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, pos.x, pos.y);
        if (anim) {
            pos.add(step);
            if (Math.abs(pos.x - newCordVector.x) < 1) anim = false;
        }
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
        super.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        newCordVector = new Vector2(screenX, (Gdx.graphics.getHeight()) - screenY);
        direction = newCordVector.cpy().sub(pos);
        //calculate step for achieve destination
        step = new Vector2(direction.x / (60 / speed), direction.y / (60 / speed));
        anim = true;
        return super.touchDown(screenX, screenY, pointer, button);
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == 19) pos.y += keyStep;
        if (keycode == 22) pos.x += keyStep;
        if (keycode == 20) pos.y -= keyStep;
        if (keycode == 21) pos.x -= keyStep;
        return super.keyDown(keycode);
    }
}
