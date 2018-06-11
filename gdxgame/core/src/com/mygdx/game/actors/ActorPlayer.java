package com.mygdx.game.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ActorPlayer extends Actor {

    Texture texPlayer = new Texture(Gdx.files.internal("spaceship1.png"));
    Sprite sprPlayer = new Sprite(texPlayer);

    public void create(){


    }

    public void draw(SpriteBatch batch, float alpha){
        sprPlayer.draw(batch);
    }
}
