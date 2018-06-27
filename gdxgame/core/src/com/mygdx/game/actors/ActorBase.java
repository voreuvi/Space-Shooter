package com.mygdx.game.actors;

import com.badlogic.gdx.scenes.scene2d.Actor;

//Actor base is the default actor class
//Other actors will inherit the contents of this class
//  including both the player and the enemies



public class ActorBase extends Actor {
    private boolean actIsDead = false;

    protected float actSpeed = 0;

    public void setParams(float angle, float speed){
        actSpeed = speed;
    }


    public float getSpeed(){
        return actSpeed;
    }

    public boolean IsDead(){

        return actIsDead;
    }

    public void kill(){
        actIsDead = true;
    }

    public ActorBase(){


    }

}
