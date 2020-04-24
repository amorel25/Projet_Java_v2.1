package general;

import State.GameState;
import State.PlayerTurnState;
import State.ResetGameState;
import State.StartState;

import java.util.Observable;

public class GameManager extends Observable {
    private Goban goban;
    private GameState startState;
    private GameState endPlayerTurn;
    private GameState resetGame;
    private GameState currentState;

    public Player p1;
    public Player p2;

    public GameManager(){
        goban = Goban.getInstance();

        startState = new StartState(this);
        endPlayerTurn = new PlayerTurnState(this);
        resetGame = new ResetGameState(this);
        currentState = startState;

        p1 = new Player(1);
        p2 = new Player(2);
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
