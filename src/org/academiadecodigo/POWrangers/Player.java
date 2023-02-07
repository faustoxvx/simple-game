package org.academiadecodigo.POWrangers;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private Picture picture;

    public Player(String filepath) {
        picture = new Picture(200,598, filepath);
        picture.draw();
    }

    public void moveRight(){
        picture.translate(10,0);
    }

    public void moveLeft(){
        picture.translate(-10,0);
    }

    public void moveUp(){
        picture.translate(0,-10);
    }

    public void moveDown(){
        picture.translate(0,10);
    }
}
