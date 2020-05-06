package State;

import general.GameManager;

public class WhitePlayerTurnState implements GameState {
    private GameManager game;

    public WhitePlayerTurnState(GameManager game) {
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
        System.out.println("white player turn");
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
