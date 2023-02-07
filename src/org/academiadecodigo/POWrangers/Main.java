package org.academiadecodigo.POWrangers;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Much graphics. Such wow.");

        /*
        Rectangle rectangle = new Rectangle(10, 10, 100, 100);
        rectangle.setColor(Color.BLUE);
        rectangle.fill();

        Rectangle r2 = new Rectangle(150, 10, 100, 100);
        r2.setColor(Color.RED);
        r2.fill();

        //Picture giantX = new Picture(5, 200, "resources/x.png");
        //giantX.draw();

        Picture fist = new Picture(5, 200, "resources/fist.png");
        fist.draw();

        */




        MagicKeyboard magicKeyboard = new MagicKeyboard();
        magicKeyboard.init();

        Picture fanuca = new Picture(600,598,"resources/fanuca.png");
        fanuca.draw();

        Picture oldGuy = new Picture(900,526, "resources/oldguy.png");
        oldGuy.draw();

    }
}
