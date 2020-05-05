package general;

import State.GameState;
import State.WhitePlayerTurnState;
import State.ResetGameState;
import State.StartState;

import java.util.Observable;

public class GameManager extends Observable {
    private Goban goban;
    private GameState startState;
    private GameState endPlayerTurn;
    private GameState resetGame;
    private GameState currentState;

    private Player player;

    public GameManager(){
        goban = Goban.getInstance();

        startState = new StartState(this);
        endPlayerTurn = new WhitePlayerTurnState(this);
        resetGame = new ResetGameState(this);
        currentState = startState;

    }

    public void setState(GameState newState){
        currentState = newState;
    }

    public GameState getStartState() {
        return startState;
    }

    public GameState getEndPlayerTurn() {
        return endPlayerTurn;
    }

    public GameState getResetGame() {
        return resetGame;
    }

    public GameState getCurrentState() {
        return currentState;
    }
}
