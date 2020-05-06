package State;

import general.GameManager;

public class BlackPlayerTurnState implements GameState {
    private GameManager game;

    public BlackPlayerTurnState(GameManager game) {
        this.game = game;
    }

    @Override
    public void startGame() {
        return;
    }

    @Override
    public void BlackPlayerTurn() {
        System.out.println("Black player turn");
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
        return;
    }
}
