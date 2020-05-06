package State;

import general.GameManager;
import general.Player;

public class WhitePlayerTurnState implements GameState {
    private GameManager game;

    @Override
    public void startGame() {
        return;
    }

    @Override
    public void BlackPlayerTurn(GameManager game, Player colorPlayer, int x, int y) {
        return;
    }

    @Override
    public void WhitePlayerTurn(GameManager game, Player colorPlayer, int x, int y) {
        System.out.println("White player turn state");
        this.game = game;
        game.playStone(colorPlayer, x, y);
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
