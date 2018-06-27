package com.mygdx.game.actors;

//Not sure if this file is redundant
//In short, extended actor base which is killable
//The damage model needs to be sorted out in future versions

//Need to find damage model on FTP server,


public class ActorDamage extends ActorBase{

    public void damage(float angle){

        super.kill(); //Kills actor

    }

}
