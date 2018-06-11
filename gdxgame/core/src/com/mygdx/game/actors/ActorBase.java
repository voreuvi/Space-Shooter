package com.mygdx.game.actors;

import com.badlogic.gdx.scenes.scene2d.Actor;

public class ActorBase extends Actor {
    private boolean actIsDead = false;

    protected float actSpeed = 0;
    protected float actAngle = 0;

    public void setParams(float angle, float speed){
        actAngle = angle; actSpeed = speed;
    }

    public float getAngle(){
        return actAngle;
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
