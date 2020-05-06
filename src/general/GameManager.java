package general;

import State.GameState;
import State.WhitePlayerTurnState;
import State.ResetGameState;
import State.StartState;

import java.util.Observable;

public class GameManager extends Observable {
    private Goban goban;
    private GameState startState;
    private GameState resetGame;
    private GameState currentState;

    public GameManager(){
        goban = Goban.getInstance();

        startState = new StartState(this);
        resetGame = new ResetGameState(this);
        currentState = startState;

    }

    public void setState(GameState newState){
        currentState = newState;
    }

    public GameState getStartState() {
        return this.startState;
    }

    public GameState getResetGame() {
        return this.resetGame;
    }

    public GameState getCurrentState() {
        return currentState;
    }

    public void initPlayer(Player player){
        switch (player){
            case BLACK:
                System.out.println("joueur noir");
                //initialiser avec 0 pierres placées et score = 0
                return;
            case WHITE:
                System.out.println("joueur blanc");
                //initialiser avec 0 pierres placées et score = 0
                return;
            default:
                throw new IllegalArgumentException("Joueur non trouvé");
        }
    }
}
