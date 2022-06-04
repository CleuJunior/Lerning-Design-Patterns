package main.java;

import main.java.controller.ScoreBoard;
import main.java.model.Balloon;
import main.java.model.Clown;
import main.java.model.SquareBalloon;

public class Main {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Balloon Tap Score:");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Clown Tap Score:");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);


        System.out.print("Square Balloon Tap Score:");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);

    }


}

