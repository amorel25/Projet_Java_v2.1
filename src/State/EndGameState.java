package State;

import general.GameManager;
import general.Player;

public class EndGameState implements GameState {
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
        System.out.println("end game");
    }

    @Override
    public void resetGame() {
        return;
    }
}
