package ru.geekbrains.startgame.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.startgame.Background;
import ru.geekbrains.startgame.BtnEnd;
import ru.geekbrains.startgame.base.Base2DScreen;
import ru.geekbrains.startgame.base.Sprite;
import ru.geekbrains.startgame.math.Rect;

public class MenuScreen extends Base2DScreen {
    Background background;
    Texture bg;
    Vector2 pos;
    Texture btnEndTex;
    BtnEnd btnEnd;


    public MenuScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();
        bg = new Texture("bg.jpg");
        pos = new Vector2(0f,0f);
        btnEndTex = new Texture("exitBtn.png");
        background = new Background(new TextureRegion(bg));
        //exit btn
        btnEnd = new BtnEnd(new TextureRegion(btnEndTex));
        btnEnd.setSize(0.07f, 0.07f);
        btnEnd.setRight(0.5f);
        btnEnd.setTop(0.5f);
    }


    @Override
    public void render(float delta) {
        super.render(delta);
//        Gdx.gl.glClearColor(1, 0.4f, 0.6f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        background.draw(batch);
        btnEnd.draw(batch);
        batch.end();
    }

    @Override
    protected void resize(Rect worldBounds) {
        background.resize(worldBounds);
        btnEnd.resize(worldBounds);
    }

    @Override
    public void dispose() {
        bg.dispose();
        btnEndTex.dispose();
        super.dispose();
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer) {
        btnEnd.touchDown(touch, pointer);
        return super.touchDown(touch, pointer);
    }
}
