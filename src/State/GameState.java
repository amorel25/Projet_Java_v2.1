package State;

public interface GameState {
    public void startGame();
    public void endPlayerTurn();
    public void endGame();
    public void resetGame();
}
