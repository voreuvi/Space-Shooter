package com.mygdx.game.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;


//This class is going to utilize the ActorBase,
//The main differences from the enemy is that health = 3; Decrements every time hit;
// then kill() will be executed.

public class ActorPlayer extends ActorDamage {

    private float health = 3;
    private boolean plyIsDamageable = false;

    Texture texPlayer = new Texture(Gdx.files.internal("spaceship1.png"));
    Sprite sprPlayer = new Sprite(texPlayer);

    public void create(){ }

    @Override
    protected void setStage(Stage stage){
        super.setStage(stage);
        stage.setKeyboardFocus(this);
    }

    @Override
    public void damage(float angle){
        if(plyIsDamageable){
            super.damage(angle);

        }
    }

    @Override
    public void act(float deltaTime){
        super.act(deltaTime);
        //Configure movement variables
        //Speed, velocity*, positions
        //plyIsMoving
    }

    public ActorPlayer(){
        //Define position
        //Prevent the player from exceeding screen bounds
        addListener(plyInputListener);

        //See if there is a more elegant way of doing below:
        //Add action is useful, allows for sequencing and delaying aforementioned
        addAction(Actions.sequence(Actions.delay(6), Actions.run(new Runnable(){
            @Override
            public void run(){
                //Put more flags which I want to be checked here
                plyIsDamageable = true;
            }

        })));

    }

    //Input
    private InputListener plyInputListener = new InputListener() {
        @Override
        public boolean keyDown(InputEvent event, int keycode) {

            if (event.getKeyCode() == Input.Keys.A) {
                //plyXPos--;
                return true;
            }

            if (event.getKeyCode() == Input.Keys.D) {
                //plyXPos++;
                return true;
            }

            if (event.getKeyCode() == Input.Keys.SPACE) {
                //plyShoot();
                return true;
            }

            return false;

        }

    };

    //Uncomment depending on method of rendering plyShip;
/*    @Override
    public void draw(SpriteBatch batch, float parentAlpha){
        super.draw(batch, parentAlpha);



    }*/




    public void draw(SpriteBatch batch, float alpha){
        sprPlayer.draw(batch);
    }
}
