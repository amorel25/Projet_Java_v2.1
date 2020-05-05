package State;

import general.GameManager;

public class StartState implements GameState {
    private GameManager game;

    public StartState(GameManager game) {
        this.game = game;
    }

    @Override
    public void startGame() {
        System.out.println("startGame");
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
        return;
    }
}
