package main.java.model;

import main.java.controller.ScoreAlgorithmBase;

public class SquareBalloon extends ScoreAlgorithmBase {

    @Override
    public int calculateScore(int taps, int multiplier) { return (taps * multiplier) + 40; }

}
