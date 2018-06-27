package com.mygdx.game;


//This class is responsible for loading textures, sprites

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Disposable;

//ResourceManager is responsible for loading all the sprites,
// textures, etc, just to keep the Game clutter free



public class ResourceManager implements Disposable {

    private static ResourceManager scrInstance;


    public static ResourceManager getInstance(){
        return scrInstance;
    }

    ResourceManager(){
        scrInstance = this;
    }

    //Textures
    public Texture plyShipTexture;

    public void loadResources(){
        plyShipTexture = new Texture(Gdx.files.internal("spaceship1.png"));
    }


    @Override
    public void dispose() {
        plyShipTexture.dispose();
    }
}
