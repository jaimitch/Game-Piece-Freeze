package com.theironyard.installparty;

public class Main {

    public static void main(String[] args) {
        GamePiece gamePiece = new GamePiece();


        gamePiece.isFrozen();
        System.out.println(gamePiece.frozen);

        gamePiece.freeze();
        System.out.println(gamePiece.frozen);

        gamePiece.unfreeze();
        System.out.println(gamePiece.frozen);
        gamePiece.move(3,5);
        System.out.println(gamePiece.getPositionX());
        System.out.println(gamePiece.getPositionY());

        gamePiece.freeze();
        System.out.println(gamePiece.frozen);
        gamePiece.move(6,2);
        System.out.println(gamePiece.getPositionX());
        System.out.println(gamePiece.getPositionY());


    }
}
