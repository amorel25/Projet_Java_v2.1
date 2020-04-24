package State;

import general.GameManager;

public class PlayerWhiteTurnState implements GameState {
    private GameManager game;

    public PlayerWhiteTurnState(GameManager game) {
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
    public void endGame() {
        return;
    }

    @Override
    public void resetGame() {
        return;
    }
}
