package State;

import general.GameManager;
import general.Player;

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
    public void BlackPlayerTurn(GameManager game, Player colorPlayer, int x, int y) {

    }

    @Override
    public void WhitePlayerTurn(GameManager game, Player colorPlayer, int x, int y) {

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
