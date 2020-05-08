package State;

import general.GameManager;
import general.Player;

public class StartState implements GameState {
    private GameManager game;

    public StartState(GameManager game) {
        this.game = game;
    }

    @Override
    public void startGame() {
        System.out.println("startGame");
        game.initPlayer(Player.BLACK);
        game.initPlayer(Player.WHITE);
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
        return;
    }
}
