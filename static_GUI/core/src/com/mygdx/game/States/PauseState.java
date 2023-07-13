package com.mygdx.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.TankStars;

public class PauseState extends State{
    private Texture background;

    private Texture exit;

    public PauseState(GameStateManager gsm) {
        super(gsm);
        background=new Texture("backg.png");

        exit=new Texture("exit.png");


    }

    @Override
    protected void handleInput() {
        if(Gdx.input.getX()>(TankStars.WIDTH)/2-(exit.getWidth())/2 && Gdx.input.getX()<(TankStars.WIDTH)/2+(exit.getWidth())/2 && Gdx.input.getY()<TankStars.HEIGHT/2+exit.getHeight()/2 && Gdx.input.getY()>TankStars.HEIGHT/2-exit.getHeight()/2){
            if (Gdx.input.justTouched()) {
                Gdx.app.exit();
            }
       }






    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background,0,0, TankStars.WIDTH,TankStars.HEIGHT);

        sb.draw(exit,(TankStars.WIDTH)/2-(exit.getWidth())/2,TankStars.HEIGHT/2-40);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
