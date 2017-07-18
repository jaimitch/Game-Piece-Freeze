package com.theironyard.installparty;

/**
 * Created by jaimitch on 7/18/17.
 */
public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = name;
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(int positionX, int positionY) {
        if(frozen == false) {

            this.positionX = positionX;
            this.positionY = positionY;
        }
        else {
            System.out.println("Your piece is frozen!");
        }
    }

    public boolean unfreeze() {
        this.frozen = false;
        return frozen;
    }

    public boolean freeze() {
        this.frozen = true;
        return frozen;
    }




}


