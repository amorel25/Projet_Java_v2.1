package State;

import general.GameManager;

public class PlayerTurnState implements GameState {
    private GameManager game;

    public PlayerTurnState(GameManager game) {
        this.game = game;
    }

    @Override
    public void startGame() {
        return;
    }

    @Override
    public void endPlayerTurn() {
        System.out.println("end player turn");
    }

    @Override
    public void resetGame() {
        return;
    }
}
