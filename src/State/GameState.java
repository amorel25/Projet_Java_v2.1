package State;

import general.GameManager;
import general.Player;

public interface GameState {
    public void startGame();
    public void BlackPlayerTurn(GameManager game, Player colorPlayer, int x, int y);
    public void WhitePlayerTurn(GameManager game, Player colorPlayer, int x, int y);
    public void endGame();
    public void resetGame();
}
