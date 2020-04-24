package State;

import general.GameManager;

public class ResetGameState implements GameState {
    private GameManager game;

    public ResetGameState(GameManager game) {
        this.game = game;
    }

    @Override
    public void startGame() {
        return;
    }

    @Override
    public void endPlayerTurn() {
        return;
    }

    @Override
    public void resetGame() {
        System.out.println("reset");
    }
}
