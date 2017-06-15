package objects;

import snakegame.SnakeGame;

/**
 * Created by USER on 13/06/2017.
 */


public class Apple {

    public int posX;
    public int posY;
    SnakeGame main;

    public Apple(int startX, int startY) {
        posX = startX;
        posY = startY;

    }

    @SuppressWarnings("static-access")
    public void setRandomPosition() {
        posX = (int) (Math.random() * main.WIDTH);
        posY = (int) (Math.random() * main.HEIGHT);
    }
}