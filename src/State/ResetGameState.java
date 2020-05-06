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
    public void BlackPlayerTurn() {
        return;
    }

    @Override
    public void WhitePlayerTurn() {
        return;
    }

    @Override
    public void endGame() {
        return;
    }

    @Override
    public void resetGame() {
        System.out.println("reset");
    }
}
