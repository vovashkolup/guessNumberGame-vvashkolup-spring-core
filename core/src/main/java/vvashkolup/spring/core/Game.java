package vvashkolup.spring.core;

public interface Game {

    int getNumber();
    int getGuess();
    void setGuess(int guess);
    int getSmallest();
    int getGuessCount();
    int getBiggest();
    int remainingGuesses();
    void reset();
    void check();
    boolean isValidNumber();
    boolean isGameWon();
    boolean isGameLost();
}
