package State;

public interface GameState {
    public void startGame();
    public void BlackPlayerTurn();
    public void WhitePlayerTurn();
    public void endGame();
    public void resetGame();
}
